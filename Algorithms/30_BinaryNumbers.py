# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


print(len(max(bin(int(raw_input().strip()))[2:].split('0'))))

'''Right at the middle, we have the input, we strip any while spaces. 
   Then we cast it to an int. Then cast it to a binary while also 
   substring it from 2 and beyond because binary output is '0b' first. 
   Then we split all 0 so we will have a list of 1s in one element of 
   the list. We use max to find the largest value which would give the 
   largest val of consecutive 1s.
'''

#Note result will have a '' in list as well. But luckily we looking for max consectuive ones 

''' There is a better solution...
input = int(raw_input().strip())
binary = bin(input).split("0")
count = 0
for i in range(0, len(binary)):
    if binary[i] == 1 and binary[i+1] == 1:
        print binary[i]
        count +=1
    else:
         continue
        
print binary
print count'''
'''