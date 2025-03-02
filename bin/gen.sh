#!/bin/bash

MODEL="deepseek-r1"
PROMPT="Generate an API client in Java respecting the specifications of the following Swagger YAML:"

OLLAMA_URL="http://localhost:11434/api/generate"
WORK_DIR="src/main/resources/docs"
TARGET_DIR="$WORK_DIR/generated"

# Ensure output directory exists
mkdir -p "$TARGET_DIR"

for FILE in "$WORK_DIR"/*.yaml; do
  echo "Processing file: $FILE"
  FILE_PATH=$(realpath "$FILE")

  # Read FILE content and escape it properly
  FILE_CONTENT=$(jq -Rs . < "$FILE_PATH")

  # Create a temporary FILE for the JSON payload
  JSON_TEMP=$(mktemp)

  # Construct JSON safely
  echo '{
    "model": "'$MODEL'",
    "prompt": '"$(jq -Rs . <<<"$PROMPT")"',
    "file": '"$FILE_CONTENT"',
    "stream": false
  }' > "$JSON_TEMP"

  # Send request with JSON FILE and clean up response
  RESPONSE=$(curl -X POST $OLLAMA_URL -H "Content-Type: application/json" --data @"$JSON_TEMP" | jq -r .response)

  # Clean up temp FILE
  rm -f "$JSON_TEMP"

  # Save response
  OUTPUT_FILE="$TARGET_DIR/$(basename "$FILE" .yaml).txt"
  echo "Prompt: $PROMPT" > "$OUTPUT_FILE"
  echo "$FILE_PATH" >> "$OUTPUT_FILE"
  echo "Response: $RESPONSE" >> "$OUTPUT_FILE"
  echo "Generated: $OUTPUT_FILE"
done