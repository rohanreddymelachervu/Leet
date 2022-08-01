class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int ans=0,c=0,start=0;
        for(int i=0;i<gas.size();i++){
            ans+=gas[i]-cost[i];
        }
        if(ans<0)
            return -1;
        int i=0;
        ans=0;
        while(c!=gas.size()){
            ans+=gas[i]-cost[i];
            if(ans<0){
                c=0;
                i=(i+1)%gas.size();
                start=i;
                ans=0;
                continue;
            }
            c++;
            i=(i+1)%gas.size();
        }
        return start;
    }
};