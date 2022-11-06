class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(needle) > len(haystack):
            return -1
        if len(needle) == len(haystack):
            return 0 if needle == haystack else -1
        l, r = 0, len(needle)
        while r <= len(haystack):
            if haystack[l:r] == needle:
                return l
            l += 1
            r += 1
        return -1