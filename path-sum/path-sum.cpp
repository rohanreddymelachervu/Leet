/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution { 
public:
    bool isSame=false;
    void traverse(TreeNode* root,int curr_sum,int targetSum){
        if(!root) return;
        traverse(root->left,curr_sum+root->val,targetSum);
        traverse(root->right,curr_sum+root->val,targetSum);
        if(!root->left and !root->right){
            curr_sum+=root->val;
            if(curr_sum==targetSum) isSame=true;
        }
    }
    bool hasPathSum(TreeNode* root, int targetSum) {
        traverse(root,0,targetSum);
        return isSame;
    }
};