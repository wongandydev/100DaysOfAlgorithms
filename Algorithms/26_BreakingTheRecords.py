# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


#!/bin/python
import sys

def getRecord(s):
    # Complete this function
    currentMax, currentMin = s[0], s[0]
    maxCount, minCount = 0,0
    for i in s:
        if i < currentMin:
            currentMin = i
            minCount += 1
        if i > currentMax:
            currentMax = i
            maxCount += 1
    return[maxCount, minCount]


n = int(raw_input().strip())
s = map(int, raw_input().strip().split(' '))
result = getRecord(s)
print " ".join(map(str, result))
