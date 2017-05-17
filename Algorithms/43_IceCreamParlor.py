#!/bin/python3

trip = int(input().strip())


for t in range(trip):
    money = int(input().strip())
    amtOfFlavors = int(input().strip())
    flavors = [int(f) for f in input().strip().split()]
    for i in range(len(flavors)):
        if (money - flavors[i]) in flavors[i+1:len(flavors)]:
            copy_Array = flavors[i+1:len(flavors)] #Copy array so we can use .index
            secondIndex = copy_Array.index(money-flavors[i]) #give us the index of the second element.
            print (i + 1, i+secondIndex+2) # First one: Add one becaause UID starts at one, second one is +x because x is where the index is at, and +2 because +1 for the i and +1 for the second element
            break

print("%s %s %s %s" % (trip, money, amtOfFlavors, flavor))
