class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        maxx=0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j]==1:
                    maxx=max(self.DFS(grid,i,j),maxx)
        return maxx
    def DFS(self,grid:List[List[int]],i:int,j:int)->int:
        if i<0 or i>=len(grid) or j<0 or j>=len(grid[i]) or grid[i][j]==0:
            return 0
        grid[i][j]=0
        count=1
        count+=self.DFS(grid,i+1,j)+self.DFS(grid,i-1,j)+self.DFS(grid,i,j+1)+self.DFS(grid,i,j-1)
        return count