#!/bin/python3

import sys

#This program works, but when run with Hackerrank it gets timeout for several test cases. 

n = int(input().strip())
unsorted = []
unsorted_i = 0
for unsorted_i in range(n):
   unsorted_t = str(input().strip())
   unsorted.append(unsorted_t)
# your code goes here
for a in range(n):
	for i in range(a,n):
		if int(unsorted[a]) > int(unsorted[i]):
			temp = int(unsorted[a])
			unsorted[a] = int(unsorted[i])
			unsorted[i] = temp
            
for i in range(len(unsorted)):
    print(unsorted[i])
        

'''
HackerRank Solution
n = int(input())
a = []
for i in range(n):
    a.append(input())

class StringAsInt(object):
    def __init__(self, obj, *args):
        self.obj = obj
    def __lt__(self, other):
        if len(self.obj) != len(other.obj):
            return len(self.obj) < len(other.obj)
        else:
            return self.obj < other.obj
    def __gt__(self, other):
        return other < self
    def __eq__(self, other):
        return self.obj == other.obj
    def __le__(self, other):
        return not (self > other)
    def __ge__(self, other):
        return (other <= self)
    def __ne__(self, other):
        return self.obj != other.obj

a.sort(key = StringAsInt)
for x in a:
    print(x)
'''