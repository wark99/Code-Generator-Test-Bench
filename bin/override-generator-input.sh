#!/bin/bash

# Check if exactly one argument is provided
if [ $# -ne 1 ]; then
  echo "Skipping generator.inputfile update."
  exit 0
fi

# New filepath provided as the first argument
new_filepath="$1"

# Update the XML file using xmlstarlet
xmlstarlet ed -i "//properties/generator.inputfile" --value "$new_filepath" ./pom.xml

# Success message
echo "Successfully updated generator.inputfile to: $new_filepath"
