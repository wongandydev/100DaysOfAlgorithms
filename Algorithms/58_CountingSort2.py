#!/bin/python3

import sys

def countingSort(arr,count):
    results = [0] * count
    for i in arr:
        results[i] += 1

    for a in range(count):
        for b in range(results[a]):
            print(a, end=' ')
            
if __name__ == "__main__":
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    result = countingSort(arr, len(arr))
    print (" ".join(map(str, result)))


