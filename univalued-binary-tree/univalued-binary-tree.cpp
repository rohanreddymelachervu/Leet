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
    bool isSame=true;
    void traverse(TreeNode* root, int val){
        if(root==NULL) return;
        if(root->val!=val){
            isSame=false; return;
        }
        if(root->left!=NULL) traverse(root->left,root->val);
        if(root->right!=NULL) traverse(root->right,root->val);
    }
    bool isUnivalTree(TreeNode* root) {
        if(root==NULL) return true;
        traverse(root,root->val);
        return isSame;
    }
};