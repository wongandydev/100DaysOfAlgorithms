
size = int(input())
results = [0] * size  #Creates an array of size k with zeroes 

for i in [int(n) for n in input().split(' ')]: #second part of for loops first iterates through the input and makes them all an int in a list. Then iterate with i.
    results[i] += 1

print(*results) #By placing the star in the front it basically prints the array as a string. Aka 'unpacks the list'