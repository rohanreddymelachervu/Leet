class Solution:
    def getDistances(self, arr: List[int]) -> List[int]:
        cntMap, sumMap = {}, {}
        n = len(arr)
        res = [0 for i in range(n)]
        for i in range(n):
            res[i] += cntMap.get(arr[i],0)*i - (sumMap.get(arr[i],0))
            cntMap[arr[i]] = cntMap.get(arr[i],0) + 1
            sumMap[arr[i]] = sumMap.get(arr[i],0) + i
        cntMap.clear()
        sumMap.clear()
        for i in range(n-1, -1, -1):
            res[i] += sumMap.get(arr[i],0) - (cntMap.get(arr[i],0)*i)
            cntMap[arr[i]] = cntMap.get(arr[i],0) + 1
            sumMap[arr[i]] = sumMap.get(arr[i],0) + i
        return res