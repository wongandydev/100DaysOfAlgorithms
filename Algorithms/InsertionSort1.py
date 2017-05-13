#!bin/python3

size = int(input().strip())

Arr = [int(arrItem) for arrItem in input().strip().split(' ')]

print(Arr, len(Arr))

for i in range(size):
    for j in range(i + 1, size):
        if Arr[i] > Arr[j]:
            temp = Arr[i]
            Arr[i] = Arr[j]
            Arr[j] = temp

print(Arr)
