/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean dfs(TreeNode root, HashMap<Integer,Integer> map, int target){
        if(root==null) return false;
        if(map.containsKey(target - root.val)){
            return true;
        }
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        boolean left = dfs(root.left, map, target);
        boolean right = dfs(root.right, map, target);
        return left || right;
    } 
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return dfs(root, map, k);
    }
}