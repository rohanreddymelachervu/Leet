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
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> result;
        if(root==NULL) return result;
        queue<TreeNode*> q; 
        q.push(root);
        while(!q.empty())
        {
            int size=q.size();
            vector<int> temp;
            for(int i=0;i<size;i++)
            {
                auto *curr_node=q.front();
                temp.push_back(curr_node->val);
                q.pop();
                if(curr_node->left!=NULL) q.push(curr_node->left);
                if(curr_node->right!=NULL) q.push(curr_node->right);
            }
        result.push_back(temp);
        }
        return result;
    }
};