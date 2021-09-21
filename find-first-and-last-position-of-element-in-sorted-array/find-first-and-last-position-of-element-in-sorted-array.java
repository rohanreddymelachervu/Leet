class Solution {
    public int[] finder(int[] nums,int index){
        int[] res=new int[2];
        int high=index; int low=index;
        while(true){
            if(high==nums.length-1) break;
            if(nums[high]==nums[high+1]) high++;
            else break;
        } 
        while(true){
            if(low==0) break;
            if(nums[low]==nums[low-1]) low--;
            else break;
        } 
        res[0]=low; res[1]=high;
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] temp={0,0};
        if(nums.length==1){
            if(nums[0]==target) return temp;
        }
        int left=0; int right=nums.length-1;
        int[] result={-1,-1};
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return finder(nums,mid);
            }
            if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return result;
    }
}