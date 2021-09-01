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
    string result="";
    void traverse(TreeNode* root)
    {
        if(root==NULL) return;
        if(root->left!=NULL)
        {
            result+="("+to_string(root->left->val);
            traverse(root->left);
            result+=")";
        }
        else if(root->left==NULL and root->right!=NULL) result+="()";
        if(root->right!=NULL)
        {
            result+="("+to_string(root->right->val);
            traverse(root->right);
            result+=")";
        }
    }
    string tree2str(TreeNode* root) { 
        if(root==NULL) return "";
        result+=to_string(root->val);
        traverse(root);
        return result;
    }
};