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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> result; double temp=0; int count=0;
        if(root==NULL) return result;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            temp=0;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode* curr_node=q.front(); q.pop();
                temp+=curr_node->val;
                if(curr_node->left!=NULL) q.push(curr_node->left);    
                if(curr_node->right!=NULL) q.push(curr_node->right);
            }
            temp/=size;
            result.push_back(temp);
        }
        return result;
    }
};