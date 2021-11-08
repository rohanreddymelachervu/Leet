class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        result.add(new ArrayList<Integer>());
        for(int num : nums){
            int n=result.size();
            for(int j=0;j<n;j++){
                List<Integer> temp=new ArrayList(result.get(j));
                temp.add(num);
                result.add(temp);
            }
        }
        return result;
    }
}