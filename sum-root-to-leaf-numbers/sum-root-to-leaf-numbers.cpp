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
    void traverse(TreeNode* root,string temp){
        if(root==NULL) return;
        if(root->left) traverse(root->left,temp+to_string(root->val));
        if(root->right) traverse(root->right,temp+to_string(root->val));
        if(!root->left and !root->right){
            sum+=stoi(temp+to_string(root->val));
            return;
        }
    }
    int sumNumbers(TreeNode* root) {
        traverse(root,"");
        return sum;
    }
};