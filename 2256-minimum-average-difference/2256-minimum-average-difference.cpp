class Solution {
public:
    int minimumAverageDifference(vector<int>& nums) {
        long long sum=0;
        for(int num : nums) sum += num;
        long long prefix=0, n=nums.size(), minn=LLONG_MAX; int minIndex=0;
        for(int i=0; i<nums.size(); i++){
            prefix += nums[i];
            long long x = prefix/(i+1);
            long long y=0;
            if(i != n-1){
                y = (sum - prefix)/(n-i-1);
            }
            if(abs(x - y) < minn){
                minIndex=i;
                minn = abs(x - y);
            }
        }
        return minIndex;
    }
};