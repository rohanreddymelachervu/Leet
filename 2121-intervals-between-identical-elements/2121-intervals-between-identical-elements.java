class Solution {
    public long[] getDistances(int[] arr) {
        long[] res = new long[arr.length];
        HashMap<Integer, Long> countMap = new HashMap<>(), sumMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            res[i] += (long)((countMap.getOrDefault(arr[i], 0L)*i*1L - (sumMap.getOrDefault(arr[i], 0L))));
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0L)+1);
            sumMap.put(arr[i], sumMap.getOrDefault(arr[i],0L)+i);
        }
        sumMap.clear();
        countMap.clear();
        for(int i=arr.length-1; i>=0; i--){
            res[i] += (long)(sumMap.getOrDefault(arr[i], 0L) - countMap.getOrDefault(arr[i], 0L)*i*1L);
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0L)+1);
            sumMap.put(arr[i], sumMap.getOrDefault(arr[i],0L)+i);
        }
        return res;
    }
}