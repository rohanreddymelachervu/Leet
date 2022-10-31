class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows, cols = len(grid), len(grid[0])
        count = 0
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '1':
                    count += 1
                    self.dfs(grid, rows, cols, i, j)
        return count
    def dfs(self, grid, rows, cols, i, j) -> None:
        if i < 0 or j < 0 or i >= rows or j >= cols or grid[i][j] == '0':
            return
        grid[i][j] = '0'
        self.dfs(grid, rows, cols, i+1, j)
        self.dfs(grid, rows, cols, i-1, j)
        self.dfs(grid, rows, cols, i, j+1)
        self.dfs(grid, rows, cols, i, j-1)