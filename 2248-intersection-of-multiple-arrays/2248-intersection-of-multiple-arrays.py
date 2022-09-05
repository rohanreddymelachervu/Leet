class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        d = {}
        res = []
        for num in nums:
            for i in num:
                d[i] = d.get(i, 0) + 1
        for key in d.keys():
            if d[key] ==  len(nums):
                res.append(key)
        return sorted(res)