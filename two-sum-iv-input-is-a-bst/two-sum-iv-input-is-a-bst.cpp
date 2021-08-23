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
    unordered_map<int , int> m;
    bool flag = false;
    void dfs(TreeNode* root ,int k){
        if(root == NULL)return;
        if(m[k - root->val]!=0){
            flag = true;
            return;
        }        
        else{
            m[root->val]++;
        }
        dfs(root->left , k);
        dfs(root->right , k);
        
    }
    bool findTarget(TreeNode* root, int k) {
       dfs(root,k);
       return flag; 
    }
};