#!/bin/bash

# Check if exactly one argument is provided
if [ $# -ne 1 ]; then
    filepath="./src/main/resources/api.yaml"
  else
    filepath="./src/main/resources/$1"
fi

echo "Using file: $filepath"

mvn package -Dgenerator_inputfile="$filepath"