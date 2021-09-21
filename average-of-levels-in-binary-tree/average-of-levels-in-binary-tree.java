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
    List<Double> result=new ArrayList();
    Queue<TreeNode> q=new LinkedList();
    public void bfs(TreeNode root){
        q.add(root);
        while(q.isEmpty()==false){
            double size=q.size(); double sum=0;
            for(double i=0;i<size;i++){
                TreeNode temp=q.remove(); sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            sum/=size; result.add(sum);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        bfs(root);
        return result;
    }
}