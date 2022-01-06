# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if root==None: 
            return 0
        result=[]
        self.BFS(root,result)
        return result
    def BFS(self,root:Optional[TreeNode],result:List[float])->None:
        q=[]
        q.append(root)
        while(len(q)>0):
            size=len(q)
            avg=0.0
            for i in range(0,len(q)):
                currNode=q.pop(0)
                avg+=currNode.val
                if currNode.left!=None: 
                    q.append(currNode.left)
                if currNode.right!=None: 
                    q.append(currNode.right)
            avg/=size
            result.append(avg)
    
                