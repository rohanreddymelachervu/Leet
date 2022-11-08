class Solution:
    def makeGood(self, s: str) -> str:
        stack = []
        for c in s: 
            if len(stack) == 0:
                stack.append(c)
            else:
                peek = stack[-1]
                if peek.isupper() and c.islower() or c.isupper() and peek.islower():
                    if peek.lower() == c.lower():
                        stack.pop()
                        continue
                    else:
                        stack.append(c)
                else:
                    stack.append(c)
        return ''.join(stack)