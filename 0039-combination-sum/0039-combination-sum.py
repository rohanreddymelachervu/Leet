class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        curr = []
        def backtrack(curr, target, index):
            if index == len(candidates):
                if target == 0:
                    res.append(curr.copy())
                return
            if candidates[index] <= target:
                curr.append(candidates[index])
                backtrack(curr, target-candidates[index], index)
                curr.pop()
            backtrack(curr, target, index+1)
        backtrack(curr, target, 0)
        return res