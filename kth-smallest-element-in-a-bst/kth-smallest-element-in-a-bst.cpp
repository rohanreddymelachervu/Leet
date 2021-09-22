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
    map<int,int> m;
    void traverse(TreeNode* root){
        if(!root) return;
        traverse(root->left);
        m[root->val]++;
        traverse(root->right);
    }
    int kthSmallest(TreeNode* root, int k) {        
        traverse(root);
        auto it=m.begin();
        for(int i=1;i<k;i++) it++;
        return it->first;
    }
};