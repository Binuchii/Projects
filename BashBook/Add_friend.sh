#!/bin/bash

# cd is used to access evrything within the bashbook folder
cd bashbook
# if "$1" exists 
if [ -d "$1" ]; then
      if [ -d "$2" ]; then # if "$1" exists 
            # if "$2" is in "$1"/Friends then print already there 
            if grep "$2" "$1"/Friends > /dev/null; then
                  echo already there 
                  # exits code
                  exit 0
            else
                  # else add "$2" to "$1"/Friends
                  echo "$2" >> "$1"/Friends
                  echo ok: Friend added


            fi
            else [ ! -d "$2" ]; # else if "$2" doesn't exist
                  echo nok: friend "$2" does not exist 
      fi 
      
else [ ! -d "$1" ];  # else if "$1" doesn't exist
      echo nok: user "$1" does not exist
fi 
