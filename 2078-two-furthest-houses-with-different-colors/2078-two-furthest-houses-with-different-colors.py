class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        maxx = 0
        for i in range(len(colors)):
            for j in range(i+1, len(colors)):
                if colors[j] != colors[i]:
                    maxx = max(maxx, j-i)
        return maxx