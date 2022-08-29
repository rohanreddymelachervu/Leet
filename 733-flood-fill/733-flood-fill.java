class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int rows=image.length, cols=image[0].length;
        int newColor=color;
        int oldColor=image[sr][sc];
        dfs(image, rows, cols, sr, sc, oldColor, newColor);
        return image;
    }
    public void dfs(int[][] image, int rows, int cols, int i, int j, int oldColor, int newColor){
        if(i<0 || i>=rows || j<0 || j>=cols || image[i][j]!=oldColor) return;
        image[i][j]=newColor;
        dfs(image, rows, cols, i-1, j, oldColor, newColor);
        dfs(image, rows, cols, i+1, j, oldColor, newColor);
        dfs(image, rows, cols, i, j-1, oldColor, newColor);
        dfs(image, rows, cols, i, j+1, oldColor, newColor);
    }
}