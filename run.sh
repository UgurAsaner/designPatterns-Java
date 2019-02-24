#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Run with pattern name: './run.sh adapter'"
else
    cd "$1"/build/
    java -cp "$1".jar: "$1".Main
    cd ../../
fi