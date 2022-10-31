class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:        
        s = set()
        res = []
        for i in range(len(nums)):
            d = {}
            target = -nums[i]
            for j in range(i+1, len(nums)):
                if target - nums[j] in d:
                    temp = tuple(sorted([nums[i], nums[j], target - nums[j]]))
                    if temp not in s:
                        s.add(temp)
                        res.append(list(temp))
                else:
                    d[nums[j]] = j
        return res