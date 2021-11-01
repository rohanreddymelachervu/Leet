class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> st;
        for(int i=0;i<asteroids.size();i++){
            if(st.empty() or asteroids[i]>0) st.push(asteroids[i]);
            else{
                while(true){
                    int peek=st.top();
                    if(peek>-asteroids[i]){
                        break;
                    } else if(peek==-asteroids[i]){
                        st.pop();
                        break;
                    } else if(peek<0){
                        st.push(asteroids[i]);
                        break;
                    } else{
                        st.pop();
                        if(st.empty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        vector<int> result(st.size(),0);
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.top();
            st.pop();
        }
        return result;
    }
};