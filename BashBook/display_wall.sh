#!/bin/bash

cd bashbook # access bashbook
if [ -d "$1" ]; then #if user does exist
      cat "$1"/Wall #print users wall

else [ ! -d "$1" ]; #if user doesnt exist
      echo nok: User "$1" does not exist 
fi 
