#!/bin/python3

def solve(year):
    if year < 1918: #Julian Calendar 
        if year % 4 == 0:
            day = 12
        else:
            day= 13
    elif year > 1918: #Gregorian Calendar 
        if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
            day = 12
        else:
            day = 13
    else: #1918
        day = 26 #12 + 14 (Because Feb 14 is the 32 day so taht 14 days that need to be counted for to get 256 day)
    return "%s.09.%s" % (day, year)

year = int(input().strip())
result = solve(year)
print(result)