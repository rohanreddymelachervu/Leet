class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        col = set()
        posDiag = set()
        negDiag = set()
        board = [['.']*n for i in range(n)]
        res = []
        def backtrack(r):
            if r == n:
                copy = [''.join(row) for row in board]
                res.append(copy)
                return
            for c in range(n):
                if c in col or (c+r) in posDiag or (c-r) in negDiag:
                    continue
                col.add(c)
                posDiag.add(r+c)
                negDiag.add(c-r)
                board[r][c] = 'Q'
                
                backtrack(r+1)
                
                col.remove(c)
                posDiag.remove(r+c)
                negDiag.remove(c-r)
                board[r][c] = '.'
        backtrack(0)
        return res