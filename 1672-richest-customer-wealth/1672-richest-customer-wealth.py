class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_sum=0; current_sum=0;
        for i in range(len(accounts)):
            for j in range(len(accounts[i])):
                current_sum+=accounts[i][j]
            max_sum=max(max_sum,current_sum);
            current_sum=0
        return max_sum