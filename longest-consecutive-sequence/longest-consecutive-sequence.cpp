class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()<=1) return nums.size();
        map<int,int> m; 
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        int count=1; int maxx=INT_MIN;
        auto it=m.begin();
        auto it1=m.begin(); it1++;
        while(it1!=m.end()){
            if(it1->first-it->first==1) count++;
            else{
                if(count>maxx) maxx=count;
                count=1;
            }
            it1++; it++;
        }
        return max(maxx,count);
    }
};