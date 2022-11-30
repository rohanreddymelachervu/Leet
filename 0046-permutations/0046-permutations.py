class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        curr = []
        visited = [False for i in range(len(nums))]
        def permute(curr):
            if len(curr) == len(nums):
                res.append(curr.copy())
                return
            for i in range(len(nums)):
                if not visited[i]:
                    curr.append(nums[i])
                    visited[i] = True
                    permute(curr)
                    visited[i] = False
                    curr.pop()
        permute(curr)
        return res