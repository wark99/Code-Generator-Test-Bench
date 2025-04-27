#!/bin/bash

# Check if exactly one argument is provided
if [ $# -ne 1 ]; then
    filepath="./src/main/resources/docs/api.yaml"
  else
    filepath="./src/main/resources/docs/$1"
fi

echo "Using file: $filepath"

mvn package -Dgenerator_inputfile="$filepath"

if [ $? -ne 0 ]; then
    echo "Error while generating the code for $filepath"
    exit 0
fi
exit 0