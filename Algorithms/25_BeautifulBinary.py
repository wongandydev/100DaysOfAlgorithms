# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import sys 

lengthOfBinary = int(raw_input().strip()) #.strip() will remove all white spaces
b = map(int, list(raw_input().strip())) #Places it in a map (similar to Java Array. with type int

count = 0

for i in range(2, lengthOfBinary):
    if(b[i-2] == 0 and b[i-1] == 1 and b[i] ==0):
        b[i] = 1
        count+=1
    print count