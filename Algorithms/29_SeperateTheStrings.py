# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import sys

queries = int(raw_input().strip())
words = []

for i in range(queries):
    word = raw_input().strip()
    words.append(word)
    

print words[0:queries]
    
    
    

