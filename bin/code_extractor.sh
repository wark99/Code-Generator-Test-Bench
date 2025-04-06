#!/bin/bash

# Directory containing the files to process
INPUT_DIR="src/main/resources/docs/generated/deepseek-r1"
OUTPUT_DIR="gen/src/main/java"

# Loop through each file in the directory
for file in "$INPUT_DIR"/*; do
  current_file=$(basename "$file" .txt)
  echo "Processing file: $current_file"

  # Extract all Java code blocks from the file using awk
  awk '
      BEGIN { inside=0; block_count=0; block="" }
      /^```java/ { inside=1; next }
      /^```/ {
        if (inside) {
          block_count++
          filename="/tmp/code_block_" block_count ".tmp"
          print block > filename
          close(filename)
          block=""
          inside=0
        }
        next
      }
      {
        if (inside) {
          block = block $0 "\n"
        }
      }
    ' "$file"

  # Process each extracted code block
  for tmp_file in /tmp/code_block_*.tmp; do
    # Extract package path
    package_line=$(grep "^package " "$tmp_file")
    package_path=$(echo "$package_line" | sed -n 's/package \(.*\);/\1/p' | tr '.' '/')

    # Set default package path if not present
    [[ -z "$package_path" ]] && package_path="default"

    # Extract class/interface/record/enum name
    class_name=$(grep -E '^(public )?(class|interface|record|enum) ' "$tmp_file" \
      | sed -E 's/^(public )?(class|interface|record|enum) ([A-Za-z0-9_]+).*/\3/' \
      | head -n 1)

    echo "Current file: $current_file, Package path: $package_path, Class name: $class_name"

    # Skip if class name is not found
    if [[ -z "$class_name" ]]; then
      echo "⚠️  Skipping block: no class/interface/record/enum found in $tmp_file"
      #rm "$tmp_file"
      continue
    fi

    # Build output directory and filename
    mkdir -p "$OUTPUT_DIR/$current_file/$package_path"
    output_file="$OUTPUT_DIR/$current_file/$package_path/$class_name.java"

    # Write content to file
    cat "$tmp_file" > "$output_file"
    echo "✅ Wrote $output_file"

    # Clean up temp file
    #rm "$tmp_file"
  done
done
