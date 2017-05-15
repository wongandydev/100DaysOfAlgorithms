#!/bin/python3

import sys

n = int(input().strip())
calories = list(map(int, input().strip().split(' ')))

calories.sort()

i = n - 1
count = 0
miles = 0

for i in range(n - 1, -1, -1):
    miles += ((2 ** count) * calories[i])
    count += 1 
    # print("%s %s %s" %(calories[i], miles, count))

print (miles)