class Solution {
    public int maxAdjacentSum(int[] nums){
        int prev=nums[0], prev2=0;
        for(int i=0; i<nums.length; i++){
            int take=nums[i];
            if(i>1) take += prev2;
            int nonTake=prev;
            int curr=Math.max(take, nonTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        ArrayList<Integer> temp1=new ArrayList<>();
        ArrayList<Integer> temp2=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i!=0) temp1.add(nums[i]);
            if(i!=nums.length-1) temp2.add(nums[i]);
        }
        int[] t1=new int[temp1.size()];
        int[] t2=new int[temp2.size()];
        for(int i=0; i<t1.length; i++){
            t1[i]=temp1.get(i);
            t2[i]=temp2.get(i);
        }
        return Math.max(maxAdjacentSum(t1), maxAdjacentSum(t2));
    }
}