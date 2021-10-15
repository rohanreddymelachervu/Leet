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
    int findSecondMinimumValue(TreeNode* root) {
        traverse(root);
        auto it=m.begin();
        if(m.size()==1) return -1;
        else{
            it++; return it->first;
        }
    }
};