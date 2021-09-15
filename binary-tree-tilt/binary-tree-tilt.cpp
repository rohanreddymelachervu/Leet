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
    int diff=0;
    int traverse(TreeNode* root){
        if(root==NULL) return 0;
        if(root->left==NULL and root->right==NULL) return root->val;
        int left=traverse(root->left); int right=traverse(root->right);
        diff+=abs(left-right);
        return left+right+root->val;
    }
    int findTilt(TreeNode* root) {
        traverse(root);
        return diff;
    }
};