class Solution {
public:
    char slowestKey(vector<int>& releaseTimes, string keysPressed) {
        int i=0; int maxn=INT_MIN; char maxc='a'; char final_result;
        for(;i<releaseTimes.size();i++){
            if(i==0){
                int duration=releaseTimes[0];
                maxn=duration; maxc=keysPressed[i];
                final_result=keysPressed[i];
            }
            else{
                int duration=releaseTimes[i]-releaseTimes[i-1];
                if(maxn<duration){
                    maxn=duration; maxc=keysPressed[i];
                    final_result=keysPressed[i];
                }
                if(maxn==duration){
                    if(maxc<keysPressed[i]){
                        maxc=keysPressed[i];
                        final_result=keysPressed[i];
                    }
                }
            }
        }
        return final_result;
    }
};