#!/bin/python3

import sys


n = int(input().strip())
height = [int(height_temp) for height_temp in input().strip().split(' ')]

max = 0
count = 0
for i in range(len(height)):
    if height[i] > max:
        max = height[i]
for j in range(len(height)):
    if height[j] == max:
        count+=1    
print(count)
