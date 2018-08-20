#!/bin/bash
./build.sh || exit
git add .
git commit -a -m "Update"
git push

