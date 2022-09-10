class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        var n=arr.length;
        Arrays.sort(arr, (p,q) -> p[0]==q[0] ? p[1]-q[1] : q[0]-p[0]);
        int max=Integer.MIN_VALUE, result=0;
        for(var i=0; i<n; i++){
            max=Math.max(max, arr[i][1]);
            if(arr[i][1]<max) result++;
        }
        return result;
    }
}