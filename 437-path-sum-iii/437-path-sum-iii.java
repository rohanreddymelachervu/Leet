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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> map=new HashMap<>();
        int res=solve(root, map, targetSum, 0);
        return res;
    }
    public int solve(TreeNode root, HashMap<Long,Integer> map, long target, long sum){
        if(root==null) return 0;
        sum += root.val;
        int res=0;
        if(sum==target) res++;
        if(map.containsKey(sum-target)){
            res += map.get(sum-target);
        }
        map.put(sum, map.getOrDefault(sum,0)+1);
        int left=solve(root.left, map, target, sum);
        int right=solve(root.right, map, target, sum);
        map.put(sum, map.getOrDefault(sum,0)-1);
        return res += left + right;
    }
}