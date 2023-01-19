#!/bin/bash

cd bashbook
if [ $# -eq 3 ]; then # checking the correct amount of inputs wheer submitted
      if [ -d "$1" ]; then # checking if "$1" exists
            if [ -d "$2" ]; then # checking if "$2" exists

            # Checking if the sender is on the receivers friend list
                  if grep "$2" "$1"/Friends > /dev/null ; then
                  #sending the message to the wall
                        echo "$1 : $3" >> "$2"/Wall
                        echo ok: message posted!
                  else #else they aren't friends
                        echo nok: user "$1" is not a friend of "$2" 
                  fi
            
            else [ ! -d "$2" ]; #else "$2" doesn't exist
                  echo nok: Receiver "$2" does not exist 
            fi 

      else [ ! -d "$1" ]; #else "$2" doesn't exist
            echo nok: Sender "$1" does not exist 
      fi 

else [ $# -ne 3 ]; #incorrect number of inputs
      echo incorrect number of lines
fi 
