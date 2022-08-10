class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        col = set()
        posDiag=set()
        negDiag=set()
        res=[]
        board=[["."]*n for i in range(n)]
        def backtrack(r):
            if r==n:
                copy = ["".join(row) for row in board]
                res.append(copy)
                return
            for c in range(n):
                if c in col or (c+r) in posDiag or (r-c) in negDiag:
                    continue
                col.add(c)
                negDiag.add(r-c)
                posDiag.add(r+c)
                board[r][c] = "Q"
                backtrack(r+1)
                
                col.remove(c)
                negDiag.remove(r-c)
                posDiag.remove(r+c)
                board[r][c]="."
        backtrack(0)
        return res
                