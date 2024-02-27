'''
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version.
You should minimize the number of calls to the API.
'''

versions = []
versions = [False] * 29
versions[29:30] = [True] * 1
print(versions)

def isBad(x):
    return versions[x]
    
def findBad():
    first = 0
    last = len(versions)
    while(first < last):
        middle = int(first + (last - first) / 2)
        if(isBad(middle)):
            if(not isBad(middle - 1)): return middle
            last = middle
        else: first = middle + 1
    return first

print(findBad())