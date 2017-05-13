#!bin/python3s

size = int(input().strip())

Arr = [int(arrItem) for arrItem in input().strip().split(' ')]

for i in range(1, size): #Starts at 1 so that we can compare everything using J that moves and i that does through one every while loop
    j = i #Setting it to i is so that we can compare Arr[i] with the one before and see if swap is necessary
    while (j > 0 and Arr[j] < Arr[j - 1]): #Make sure J is greater than 0 and if this is true swap.
        temp = Arr[j]
        Arr[j] = Arr[j-1]
        Arr[j-1] = temp
        j -= 1
    print(*Arr)
