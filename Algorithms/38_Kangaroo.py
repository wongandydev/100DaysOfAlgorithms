                                                                                                                                                                                                        #!/bin/python3

import sys


x1,v1,x2,v2 = input().strip().split(' ')
x1,v1,x2,v2 = [int(x1),int(v1),int(x2),int(v2)]

'''
Make sure that the first kanagroo is moving quicker than second kangaroo to be able to catch up. 
Then we need to make sure that when we subtract starting points and spaces moved, that it is a 
diviisible evenly so that we know we do not have situations where it jumps .2 of a space.
(calculations would be difffernet.)
'''

if ((v1 > v2 ) and (x2-x1)%(v1-v2) == 0): 
    print ("YES")
else:
    print ("NO")