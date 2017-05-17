#!/bin/python3

size = int(input().strip())

arr = [int(item) for item in input().strip().split()]

equal = []

left = []

right = []

equal.append(arr[0])

for i in range(1, len(arr)):
    if arr[i] > arr[0]:
        right.append(arr[i])
    elif arr[i] < arr[0]:
        left.append(arr[i])
    elif arr[i] == arr[0]:
        equal.append(arr[i])
    
print(*left, *equal, *right)