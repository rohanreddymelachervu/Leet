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
    void inorder(TreeNode* root,map<int,int>&m)
    {
        if(!root)
            return;
        inorder(root->left,m);
        m[root->val]++;
        inorder(root->right,m);
    }
    vector<int> findMode(TreeNode* root) {
        map<int,int>m;
        vector<int>ans;
        inorder(root,m);
        int max=INT_MIN;
        for(auto it:m)
        {
            if(it.second>max)
                max=it.second;
        }
        for(auto it:m)
        {
            if(it.second==max)
            {
                ans.push_back(it.first);
            }
        }
        return ans;
        

    }
};