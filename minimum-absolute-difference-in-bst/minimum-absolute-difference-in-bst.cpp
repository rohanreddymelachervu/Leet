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
    int minDiff=INT_MAX; int prev=INT_MAX;
    void traverse(TreeNode* root){
        if(root==NULL) return;
        traverse(root->left);
        minDiff=min(minDiff,abs(root->val-prev));
        prev=root->val;
        traverse(root->right);
        
    }
    int getMinimumDifference(TreeNode* root) {
        traverse(root);
        return minDiff;
    }
};