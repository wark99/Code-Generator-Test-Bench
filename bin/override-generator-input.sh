#!/bin/bash

# Check if exactly one argument is provided
if [ $# -ne 1 ]; then
  echo "Skipping generator.inputfile update."
  exit 0
fi

apt-get update
apt-get install -y xmledit

# New filepath provided as the first argument
new_filepath="./src/main/resources/$1"

# Update the XML file
xmledit --update "/project/properties/property[@name='generator.inputfile']/@value" --value "NEW_PATH/TO/FILE" pom.xml

# Success message
echo "Successfully updated generator.inputfile to: $new_filepath"
