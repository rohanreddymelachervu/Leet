class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if len(digits) == 0:
            return []
        mappings = {1:'', 2:'abc', 3:'def', 4:'ghi', 5:'jkl', 6:'mno', 7:'pqrs', 
                   8:'tuv', 9:'wxyz'}
        res = []
        def backtrack(curr, index):
            if len(curr) == len(digits):
                copy = curr
                res.append(copy)
                return
            letters = mappings.get(int(digits[index]))
            for i in range(len(letters)):
                curr += letters[i]
                backtrack(curr, index+1)
                curr = curr[:-1]
        backtrack('',0)
        return res