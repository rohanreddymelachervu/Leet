class Solution:
    def longestBeautifulSubstring(self, word: str) -> int:
        res = 0
        seen = set()
        left = -1
        right = 0
        while right<len(word):
            if right>0 and word[right]<word[right-1]:
                seen.clear()
                left = right-1
            seen.add(word[right])
            if len(seen) == 5:
                res = max(res, right-left)
            right += 1
        return res