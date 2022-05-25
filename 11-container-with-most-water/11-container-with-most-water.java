class Solution {
    public int maxArea(int[] height) {
        int maxArea=0, l=0, r=height.length-1;
        while(l<r){
            int lh=height[l], rh=height[r];
            int minHeight=Math.min(lh,rh);
            maxArea=Math.max(maxArea,(minHeight*(r-l)));
            if(lh<rh) l++;
            else r--;
        }
        return maxArea;
    }
}