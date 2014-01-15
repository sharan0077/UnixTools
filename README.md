UnixTools
=========
#WC

This tools displays the count of lines words characters in the corresponding file.

###Syntax   : gs_wc <FileName>
           
###Example  : gs_wc a.txt
           
###Output   : 7 6 47

#Head

This tools displays the starting 10 lines of the file content .

you can also specify number of lines to be displayed

###Syntax   : gs_head <FileName> [-n]
  
    -n      : number of lines to be displayed [optional]

###Example  : gs_head a.txt -2

###Output   :
             hi all!
             doing well
            

#Tail

This tools displays the last 10 lines of the file content .

you can also specify number of lines to be displayed

###Syntax   : gs_tail <FileName> [-n]
  
    -n      : number of lines to be displayed [optional]

###Example  : gs_tail a.txt -2

###Output   : 
             hi all!
             doing well
            
#Unique

This tools displays the unique lines of the file content .


###Syntax   : gs_unique <FileName>

###Example  : gs_unique a.txt 

###Output   : 
             hi all!
             doing well
             
#ReduceSpace

This tools is used to reduce the extra wide spaces in the file .
