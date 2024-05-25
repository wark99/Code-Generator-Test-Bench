#!/bin/bash

# Function to prepend a string to a file
prepend_string_to_file() {
    local file="$1"
    local string_to_add="$2"

    # Create a temporary file
    local new_file=prompt/$(basename $file .yaml).txt

    # Write the string to the temporary file
    echo "$string_to_add" >> "$new_file"

    # Append the original file content to the temporary file
    cat "$file" >> "$new_file"

    echo "Updated file: $file"
}

# Directory containing the files
directory="src/main/resources"
# String to add at the beginning of each file
string_to_add="Generate java controllers and models based on the following swagger yaml:
"

# Check if the directory exists
if [ ! -d "$directory" ]; then
    echo "The directory $directory does not exist."
    exit 1
fi

# Iterate over all the files in the directory
for file in "$directory"/*yaml; do
    # Check if it's a file
    if [ -f "$file" ]; then
        prepend_string_to_file "$file" "$string_to_add"
    fi
done
