# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def traverse(self,root,temp,numbers)->None:
        if root==None:
            return
        if root.left!=None:
            self.traverse(root.left,temp+(str)(root.val),numbers)
        if root.right!=None:
            self.traverse(root.right,temp+(str)(root.val),numbers)
        if root.right==None and root.left==None:
            temp+=(str)(root.val)
            numbers.append(temp)
            return
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        numbers=[]; result=0
        self.traverse(root,"",numbers)
        numbers=[int(num) for num in numbers]
        return sum(numbers)