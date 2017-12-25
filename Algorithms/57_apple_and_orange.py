#!/bin/python3

import sys


s,t = input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
apples = [int(apple_temp) for apple_temp in input().strip().split(' ')]
oranges = [int(orange_temp) for orange_temp in input().strip().split(' ')]

counta = 0 
countb = 0

# < -------- Not as good solution ------->
for apple in apples:
    d = a + apple
    if s <= d <= t:
        counta += 1
        
for orange in oranges:
    if s <= b + orange <= t:
        countb += 1

print(counta)
print(countb)
# < -------- END - Not as good solution ------->

# Better Solution 
# print(sum(s <= a + d <= t for d in apples))
# print(sum(s <= b + d <= t for d in oranges))
# OR 
# print(sum([1 for x in apple if (x + a) >= s and (x + a) <= t]))
# print(sum([1 for x in orange if (x + b) >= s and (x + b) <= t]))