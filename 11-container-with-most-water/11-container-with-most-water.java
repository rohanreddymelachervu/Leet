class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE, l=0, r=height.length-1;
        while(l<=r){
            int lHeight=height[l], rHeight=height[r], minHeight=Math.min(lHeight, rHeight);
            maxArea=Math.max(maxArea, (r-l)*minHeight);
            if(lHeight<rHeight) l++;
            else r--;
        }
        return maxArea;
    }
}