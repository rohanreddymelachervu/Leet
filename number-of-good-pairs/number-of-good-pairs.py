class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        m={}; result=0;
        for num in nums:
            if num in m.keys():
                m[num]=m.get(num)+1
            else:
                m[num]=1
        for key in m.keys():
            result+=(int)((m.get(key)*(m.get(key)-1))/2)
        return result
        