#!/bin/bash

PROMPT="Generate an API client in Java respecting the specifications of the following Swagger YAML:"
echo "Prompt: $PROMPT"

FOLDER="src/main/resources/docs"
OUTPUT_FOLDER="$FOLDER/generated"

# Ensure output directory exists
mkdir -p "$OUTPUT_FOLDER"

for file in "$FOLDER"/*.yaml; do
  echo "Processing file: $file"

  FILE_PATH=$(realpath "$file")

  # Create a temporary file for the JSON payload
  JSON_TEMP=$(mktemp)

  # Read file content and escape it properly
  FILE_CONTENT=$(jq -Rs . < "$FILE_PATH")

  # Ensure the file content is not empty
  if [ -z "$FILE_CONTENT" ]; then
    echo "Error: Failed to read $FILE_PATH"
    rm -f "$JSON_TEMP"
    continue
  fi

  # Construct JSON safely
  echo '{
    "model": "deepseek-r1",
    "prompt": '"$(jq -Rs . <<<"$PROMPT")"',
    "file": '"$FILE_CONTENT"'
  }' > "$JSON_TEMP"

  # Send request with JSON file and clean up response
  RESPONSE=$(curl -X POST http://localhost:11434/api/generate \
    -H "Content-Type: application/json" --data @"$JSON_TEMP" | jq -r .response)

  echo $RESPONSE

  # Clean up temp file
  rm -f "$JSON_TEMP"

  # Save response
  OUTPUT_FILE="$OUTPUT_FOLDER/$(basename "$file" .yaml).txt"
  echo $RESPONSE > "$OUTPUT_FILE"

  echo "Generated: $OUTPUT_FILE"
done
