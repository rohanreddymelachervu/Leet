class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [None for i in range(n+1)]
        def f(n, dp):
            if n == 0:
                return 1
            if dp[n]:
                return dp[n]
            ones = f(n-1, dp)
            twos = 0
            if n > 1:
                twos = f(n-2, dp)
            dp[n] = ones + twos
            return dp[n]
        return f(n, dp)
            