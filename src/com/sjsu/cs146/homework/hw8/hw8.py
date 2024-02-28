class Solution:
    def longestPalindrome(self, s):
        letters = dict()
        count = len(s)
        for c in s:
            if c in letters.keys(): letters.update({c:letters.get(c) + 1})
            else: letters.update({c:1})
        for i in letters.values(): 
            if i % 2 == 1: count -= 1
        if count < len(s): count += 1
        return count

solution = Solution()
print(solution.longestPalindrome("speediskey"))