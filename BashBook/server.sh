#!/bin/bash

clear # clear everything above this
#print out menu-ing stuff makes it look nice
echo "Server CT213 -- Assignment 1"
echo "----------------------------"
echo "     M A I N -- M E N U     "
echo "----------------------------"
echo "     Functions    -->   Commands"
# commands and how to type each of them out to use correctly
echo "1. Create User    --> (create,'id')"
echo "2. Add Friends    --> (add,'id','Friend')"
echo "3. Post to wall   --> (post,'sender','receiver','message')"
echo "4. Display wall   --> (display,'id')"
echo "when using the commands please place ',' where indicated do not use a space"
# shows how to leave infinite loop and close server
echo "Use 'exit' command to close at any time"
echo # used to make things look neat

#infinite loop 
while :
do
      IFS="," read -p "Enter Command: " command var1 var2 var3
      # this reads in and stores the values input by the user anything
      # any additional inputs are stored into and alongside var3 
      # "," is used to create seperate terms so users can put spaces 
      # their names

        #checks what command was input
      if [ "$command" == "create" ]; then 
            ./bashbook/create.sh "$var1"
      fi

      #check for command
      if [ "$command" == "add" ]; then 
            ./bashbook/Add_friend.sh "$var1" "$var2"
            ./bashbook/Add_friend.sh "$var2" "$var1"
#here the friend code is run, however we run it twice to make friendship 
#symmetrical, 
      fi
      
      #check for command
      if [ "$command" == "post" ]; then 
            ./bashbook/post_messages.sh "$var1" "$var2" "$var3"
# here var3 stores any excess inputs again eliminating the need for quotes 
      fi
      
      #check for command
      if [ "$command" == "display" ]; then 
                  ./bashbook/display_wall.sh "$var1"
      fi
      
      #additional command used to leave the server
      if [ "$command" == "exit" ]; then 
            exit 1
      fi

done

