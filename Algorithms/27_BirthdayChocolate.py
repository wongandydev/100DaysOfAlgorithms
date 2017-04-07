# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import sys

def getWays(squares, d, m):
    # Complete this function
    count = 0
    possiblePieces = (len(squares) - m) + 1 #Since there is only a certain number of peice that work; i.e 5 blocks. month is 2 so two blocks, 
                                            #you can only get throught block 0,1,2,3. But not the last one if there are 4 blocks comparing 2. so length which 
                                            #is 5 - 2 which is 3 + 1 will give us four aka pieces that will work.
    for i in range(possiblePieces):
        if (sum(squares[i:i+m]) == d): #1 in front is the counter. It will keep adding one
            count+=1
    return count

n = int(raw_input().strip())
s = map(int, raw_input().strip().split(' '))
d,m = raw_input().strip().split(' ')
d,m = [int(d),int(m)]
result = getWays(s, d, m)
print(result)
