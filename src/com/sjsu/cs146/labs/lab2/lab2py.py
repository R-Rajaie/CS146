# Given two strings s and t, return true if t is an anagram of s, and false otherwise.
# An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
# typically using all the original letters exactly once.

def anagram(s, t):
    if(len(s) != len(t)): return False
    sMap = {}
    tMap = {}
    for i in range(0, len(s)):
        sMap[s[i]] = sMap.get(s[i], 0) + 1
        tMap[t[i]] = tMap.get(t[i], 0) + 1
    return sMap == tMap

s = "abcde"
t = "cabde"

print(anagram(s, t))