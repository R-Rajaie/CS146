import sys

class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution:
     def helper(self, root, max, min):
          if root == None: return True
          if root.val < min or root.val > max: return False
          return self.helper(root.left, min, root.val - 1) and self.helper(root.right, root.val + 1, max)
     def isValidBST(self, root):
          return Solution.helper(self, root, 9223372036854775807, -9223372036854775807)
     
solution = Solution()
one = TreeNode(1)
print(solution.isValidBST(one))
