#!/bin/bash

# Directory containing the files to process
INPUT_DIR="src/main/resources/docs/generated/deepseek-r1"
OUTPUT_DIR="gen/src/main/java"

# Loop through each file in the directory
for file in "$INPUT_DIR"/*; do
  # Read the file line by line
  current_file=$(basename "$file" .txt)
  while IFS= read -r line; do
    # Check if the line contains the start of a code block
    if [[ "$line" == '```'* ]]; then
      # Read the next line to get the package path
      read -r package_line
      # Extract the package path
      package_path=$(echo "$package_line" | sed -n 's/package \(.*\);/\1/p' | tr '.' '/')
      # Create the directory structure if it doesn't exist
      mkdir -p "$OUTPUT_DIR/$current_file/$package_path"
      # Extract the file name from the package path
      file_name=$(basename "$file" .txt).java
      # Create the file with the extracted content
      output_file="$OUTPUT_DIR/$current_file/$package_path/$file_name"
      # Read the content between the backticks and write to the file
      while IFS= read -r code_line && [[ "$code_line" != '```' ]]; do
        echo "$code_line" >> "$output_file"
      done
    fi
  done < "$file"
done