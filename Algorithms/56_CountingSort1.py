
#Best Solution - 

size = int(input()) #Need this line here because it reads the first line input. W/O this, we can't read the next line of ints. 
results = [0]*100 

for i in [int(n) for n in input().split()]:
    results[i] += 1

print(*results)


# <---------- SOLUTION BELOW ONLY WORKS FOR THE FIRST TEST CASE.>


size = int(input()) #Need this line here because it reads the first line input. W/O this, we can't read the next line of ints. 
results = [0] * size  #Creates an array of size k with zeroes 

for i in [int(n) for n in input().split()]: #second part of for loops first iterates through the input and makes them all an int in a list. Then iterate with i.
    results[i] += 1

print(*results) #By placing the star in the front it basically prints the array as a string. Aka 'unpacks the list'