class Solution:
    def shortestBridge(self, grid: List[List[int]]) -> int:
        N = len(grid)
        direct = [[0,1], [0,-1], [1,0], [-1,0]]
        def invalid(r, c):
            return r<0 or c<0 or r == N or c == N
        visited = set()
        def dfs(r, c):
            if invalid(r, c) or not grid[r][c] or (r,c) in visited:
                return
            visited.add((r, c))
            for dr, dc in direct:
                dfs(dr + r, dc + c)
        def bfs():
            res, q = 0, deque(visited)
            while q:
                for i in range(len(q)):
                    r, c  = q.popleft()
                    for dr, dc in direct:
                        curR, curC = dr + r, dc + c
                        if invalid(curR, curC) or (curR, curC) in visited:
                            continue
                        if grid[curR][curC]:
                            return res
                        q.append((curR, curC))
                        visited.add((curR, curC))
                res += 1
            
        for r in range(N):
            for c in range(N):
                if grid[r][c]:
                    dfs(r, c)
                    return bfs()