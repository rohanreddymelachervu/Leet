class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result=new int[2];
        int totalA=0,totalB=0;
        Set<Integer> setB=new HashSet();
        for(int a : aliceSizes) totalA+=a;
        for(int b : bobSizes){
            totalB+=b;
            setB.add(b);
        }
        int delta=(totalB-totalA)/2;
        for(int a : aliceSizes){
            if(setB.contains(delta+a)){
                result[0]=a;
                result[1]=delta+a;
                return result;
            }
            
        }
        return null;
    }
}