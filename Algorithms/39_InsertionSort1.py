#!bin/python3

size = int(input().strip())

Arr = [int(arrItem) for arrItem in input().strip().split(' ')]

e = Arr[len(Arr) - 1]

tempIndex = 0

#print(Arr, len(Arr), e)

#Finds where the location we want to put two at. 
for i in range(size-1):
    if e > Arr[i] and e < Arr[i+1]:
        tempIndex = i+1
        #print (tempIndex)

hold = size - 1

for hold in range(size - 1, tempIndex, -1):
    Arr[hold] = Arr[hold - 1]
    print(*Arr)
Arr[tempIndex] = e

print(*Arr)


