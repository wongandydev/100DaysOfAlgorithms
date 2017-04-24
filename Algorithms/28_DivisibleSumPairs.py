# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#!/bin/python3

import sys

n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]
count = 0
for b in range(n):
    for i in range(n):
        if a[b] < a[i] and (a[b] + a[i])%k == 0:
            count+=1
            
print (count)