class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if p.val < root.val and q.val < root.val: return self.lowestCommonAncestor(root.left , p, q)
        if p.val > root.val and q.val > root.val: return self.lowestCommonAncestor(root.right, p, q)
        return root

solution = Solution()
a = TreeNode(1)
b = TreeNode(5)
c = TreeNode(9)
d = TreeNode(3, a)
e = TreeNode(8, b, c)
f = TreeNode(4, d, e)
print(solution.lowestCommonAncestor(f, a, d).val)
print(solution.lowestCommonAncestor(f, a, b).val)