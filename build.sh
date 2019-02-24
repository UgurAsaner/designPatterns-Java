#!/bin/sh

if [ $# -eq 0 ]; then
    echo "Build Started"
    for d in */ ; do
        dir=${d%?}
        echo "Building ${dir}"
        cd $d
        mkdir build
        find . -name "*.java" -print | xargs javac -d ./build
        jar cf ./build/${dir}.jar *
        echo "Building ${dir} Finnished"
        cd ..
    done
    echo "Build Finished\n"
    echo "To Remove Build Files Execute: ./build remove"
elif [ $1 = 'remove' ]; then
    for d in */ ; do
        cd $d
        rm -R build/
        cd ..
    done
    echo "Build Files Removed"
else
    echo "Wrong Arguments"
fi