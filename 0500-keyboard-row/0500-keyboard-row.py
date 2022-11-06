class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        res = []
        up = set("qwertyuiop")
        mid = set("asdfghjkl")
        low = set("zxcvbnm")
        for word in words:
            temp = set()
            for c in word.lower():
                if c in up:
                    temp.add('up')
                elif c in mid:
                    temp.add('mid')
                else:
                    temp.add('low')
            if len(temp) == 1:
                res.append(word)
        return res