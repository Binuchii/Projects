#!/bin/bash

#if the number of inputs is 1
if [ "$#" -eq 1 ]; then

      cd bashbook # access bashbook folder
      if [ -d "$1" ]; then #if user alrady exists
            echo nok: user already exists

      else [ ! -d "$1" ]; # if user doesnt already exist
            mkdir "$1" #make directory
            cd "$1" #access that directory
            touch Wall # create Wall and Friends
            touch Friends
            echo ok: User Created
      fi

else [ "$#" -eq 0 ]; #if no inputs given
      echo nok: no identifier provided
fi

cd
cd bashbook
echo "$1" >> "$1"/Friends
#here is a seperate part of the code we set up to make posting on a wall easier when posting on a wall it checks if the sender is one the receivers friend list, to comply with this restriction we add the user to their own friends list so they can post on thier own wall.
