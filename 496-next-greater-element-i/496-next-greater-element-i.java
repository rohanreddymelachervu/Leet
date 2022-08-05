class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Arrays.fill(result,-1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                int pop=stack.pop();
                result[map.get(pop)]=nums2[i];
            }   
            if(map.containsKey(nums2[i])){
                stack.push(nums2[i]);
            }
        }
        return result;    
    }
}