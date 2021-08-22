class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = len(nums)
        i = 0
        check = []
        while i != length:
            if nums[i] not in check:
                check.append(nums[i])
                i += 1
            else:
                nums.pop(i)
                length -= 1
        return len(check)