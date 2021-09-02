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
    vector<string> result; 
    void traverse(TreeNode* root,string temp)
    {
        if(root==NULL) return;
        if(root->left==NULL and root->right==NULL)
        {
            result.push_back(temp+"->"+to_string(root->val));
            return;
        }
        if(root->left!=NULL)
        {
            traverse(root->left,temp+"->"+to_string(root->val));
        }
        if(root->right!=NULL)
        {
            traverse(root->right,temp+"->"+to_string(root->val));
        }
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        traverse(root,""); int pos=0;
        for(auto i : result)
        {
            string temp=i.substr(2);
            result[pos++]=temp;
        }
        return result;
    }
};