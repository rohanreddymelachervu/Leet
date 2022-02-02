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
    HashMap<Integer,Integer> hm=new HashMap<>();
    public void traverse(TreeNode root){
        if(root==null) return;
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        traverse(root.left);
        traverse(root.right);
    }
    public int[] findMode(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return new int[] {root.val};
        traverse(root);
        List<Integer> result=new ArrayList<>(); int max=Integer.MIN_VALUE;
        for(int num : hm.keySet()){
            max=Math.max(max,hm.get(num));
        }
        for(int num : hm.keySet()){
            if(hm.get(num)==max) result.add(num);
        }
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
    }
}