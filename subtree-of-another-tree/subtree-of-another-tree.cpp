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
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        if(root==NULL) return false;
        else if(isSame(root,subRoot)) return true;
        else return isSubtree(root->left,subRoot) or isSubtree(root->right,subRoot);
    }
    bool isSame(TreeNode* root, TreeNode* subRoot){
        if(root==NULL or subRoot==NULL) return root==NULL and subRoot==NULL;
        else if(root->val==subRoot->val) return isSame(root->left,subRoot->left) and isSame(root->right,subRoot->right);
        else return false;
    }
};