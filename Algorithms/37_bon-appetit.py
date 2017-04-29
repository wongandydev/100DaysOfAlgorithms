#!/bin/python3

n, k = map(int, input().strip().split())

c = [int(x) for x in input().strip().split()]
# for items in n: #If n was str instea of int
#     c = list(map(int, input().split()))

charged = int(input().strip())

'''
One Line Solution
================
print('Bon Appetit' if (sum(c) - c[k]) // 2 == charged else c[k] // 2) #Double slash will print answer in int
'''

total = 0;

for i in range(len(c)):
    total += c[i]

didNotEat= c[k]
actualCharge = (total - didNotEat)/2

if actualCharge == charged:
    print('Bon Appetit')
else:
    overcharge = int(c[k]/2)
    print(overcharge)
