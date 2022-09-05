class Solution:
    def shortestBridge(self, grid: List[List[int]]) -> int:
        N = len(grid)
        visited = set()
        direct = [[1,0], [0,1], [-1,0], [0,-1]]
        def invalid(r, c):
            return r<0 or c<0 or r == N or c == N
        def dfs(r, c):
            if invalid(r, c) or (r,c) in visited or grid[r][c] == 0:
                return
            visited.add((r,c))
            for dr, dc in direct:
                dfs(dr + r, dc + c)
        
        def bfs():
            res, q = 0, deque(visited)
            while q:
                for i in range(len(q)):
                    r, c = q.popleft()
                    for dr, dc in direct:
                        curR, curC = dr + r, dc + c
                        if invalid(curR, curC) or (curR, curC) in visited:
                            continue
                        if grid[curR][curC]:
                            return res
                        q.append((curR, curC))
                        visited.add((curR, curC))
                res += 1
        
        
        for i in range(N):
            for j in range(N):
                if grid[i][j]:
                    dfs(i, j)
                    return bfs()