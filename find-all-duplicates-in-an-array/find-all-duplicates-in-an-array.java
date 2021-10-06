class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList(); HashSet<Integer> set=new HashSet();
        for(int num : nums){
            if(!set.contains(num)) set.add(num);
            else{ 
                if(result.contains(num)) continue;
                else result.add(num);
            }
        }
        return result;
    }
}