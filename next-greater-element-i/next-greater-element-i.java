class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> numbers2=new ArrayList();
        int[] result=new int[nums1.length];
        for(int num : nums2) numbers2.add(num);
        for(int i=0;i<nums1.length;i++){
            int index=numbers2.indexOf(nums1[i]);
            if(index==numbers2.size()-1) result[i]=-1;
            else{
                boolean flag=false;
                while(index!=numbers2.size()){
                    if(numbers2.get(index)>nums1[i]){
                        flag=true;
                        result[i]=numbers2.get(index);
                        break;
                    }
                    index++;
                }
            if(!flag) result[i]=-1;
            }
        }
        return result;
    }
}