# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import sys

queries = int(raw_input().strip())
words = []

for i in range(queries): #Adds all elements into an array
    word = raw_input().strip()
    words.append(word)
    
for word in words:
    if(len(word) == 0 or len(word) == 1):
        print ("NO")
    else:
        isBeauty = False
        length = len(word)
        sum = 0
        for i in range(length):
            sum = 0
            check = str("")
            if(i != length -1): #Make sure ware not testing at 0 when we do substring 
                isBeauty = False
                temp = word[:i]
                if not(len(temp) * 2 > len(word)) and not(len(temp) == 0):
                    code = int(float(temp))
                    sum = code
                    
                    while len(check) < len(str):
                        check = check + code
                        code = code + 1
                    if form.equals(str):
                        isBeauty = True
                        break  
                else:
                    continue
            if(isValid):
                print("YES" + sum)
            else:
                print("NO")
            
    