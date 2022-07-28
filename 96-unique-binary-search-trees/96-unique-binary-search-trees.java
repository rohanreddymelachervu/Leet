class Solution {
    public int numTrees(int n) {
        List<Integer> numTree=new ArrayList<>(Collections.nCopies(n+1,1));
        for(int i=2;i<n+1;i++){
            int total=0;
            for(int j=1;j<i+1;j++){
                int left=j-1;
                int right=i-j;
                total+=numTree.get(left)*numTree.get(right);
            }
            numTree.set(i,total);
        }
        return numTree.get(n);
    }
}