from collections import deque

class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution():
     def level_order(root):
          total = []
          if not root: return total
          queue = deque([root])

          while queue:
               size = len(queue)
               vals = []

               for i in range(size):
                    node = queue.popleft()
                    vals.append(node.val)
                    if node.left: queue.append(node.left)
                    if node.right: queue.append(node.right)

               total.append(vals)

          return total