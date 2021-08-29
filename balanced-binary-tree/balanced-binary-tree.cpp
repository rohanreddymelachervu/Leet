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
    bool isBalanced(TreeNode* root) {
        if(root==NULL) return true;
        return height(root)!=-1;
    }
     int height(TreeNode* root)
    {
        if(root==NULL) return 0;
        int left=height(root->left);
        int right=height(root->right);
        int diff=abs(left-right);
        if(diff>1 or left==-1 or right==-1) return -1;
        return 1+max(left,right);
    }
};