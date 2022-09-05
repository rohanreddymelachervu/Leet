class Solution:
    def findLucky(self, arr: List[int]) -> int:
        d = {}
        for i in arr:
            d[i] = d.get(i,0) + 1
        maxx = -100000 
        for key in d.keys():
            if d[key] == key and key > maxx:
                maxx = key
        return maxx if maxx != -100000  else -1