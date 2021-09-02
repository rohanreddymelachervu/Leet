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
    int sum=0;
    void isLeft(TreeNode* root,bool left)
    {
        if(root==NULL) return;
        if(left and root->left==NULL and root->right==NULL)
        {
            sum+=root->val; 
        }
        if(root->left!=NULL) isLeft(root->left,true);
        if(root->right!=NULL) isLeft(root->right,false);
    }
    int sumOfLeftLeaves(TreeNode* root) {
        isLeft(root,false);
        return sum;
    }
};