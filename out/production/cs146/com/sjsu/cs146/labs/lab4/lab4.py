class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution:
    def invertTree(self, root):
        if root == None: return True
        if root.right == None or root.left == None:
            if root.right == None:
                root.right = root.left
                root.left = None
                self.invertTree(root.right)
            elif root.left == None:
                root.left = root.right
                root.right = None
                self.invertTree(root.left)
            else: return root
        else:
            temp = TreeNode(root.right)
            root.right = root.left
            root.left = temp
            self.invertTree(root.left)
            self.invertTree(root.right)
        return root