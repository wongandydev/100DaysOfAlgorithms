import sys

def gameOfThrones(s):
    if len([i for i in set(s) if s.count(i) % 2 != 0]) < 2:
        return("YES")
    else:
        return("NO")

s = raw_input().strip()
result = gameOfThrones(s)
print(result)
