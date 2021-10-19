class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result(nums1.size(),0);
        for(int i=0;i<nums1.size();i++){
            auto it=find(nums2.begin(),nums2.end(),nums1[i]);
            if(it!=nums2.end()){
                if(*it==nums2[nums2.size()-1]) result[i]=-1;
                else{
                    bool flag=false;
                    while(it!=nums2.end()){
                        if(*it>nums1[i]){
                            flag=true;
                            result[i]=*it;
                            break;
                        }
                        it++;
                    }
                    if(!flag) result[i]=-1;
                }
            } else{
                result[i]=-1;
            }
        }
        return result;
    }
};