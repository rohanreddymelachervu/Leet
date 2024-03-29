/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


struct TreeNode* invertTree(struct TreeNode* root){
    if(root==NULL) return NULL;
    struct TreeNode* left=invertTree(root->left);
    struct TreeNode* right=invertTree(root->right);
    root->right=left;
    root->left=right;
    return root;
}