class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mappings = {}
        for s in strs:
            sorted_s = ''.join(sorted(s))
            if sorted_s in mappings:
                mappings[sorted_s].append(s)
            else:
                mappings[sorted_s] = [s]
        res = [val for val in mappings.values()]
        return res