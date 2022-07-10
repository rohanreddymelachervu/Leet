class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] idx=new int[nums.length+1];
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<idx.length;i++) idx[i]=0;
        for(int i=0;i<nums.length;i++){
            idx[nums[i]]++;
        }
        for(int i=1;i<idx.length;i++){
            if(idx[i]==0){
                result.add(i);
            }
        }
        return result;
    }
}