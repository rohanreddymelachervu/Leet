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
    unordered_map<int,int> m; vector<int> result;
    void traverse(TreeNode* root)
    {
        if(root==NULL) return;
        m[root->val]++;
        traverse(root->left);
        traverse(root->right);
    }
    vector<int> findMode(TreeNode* root) {
        traverse(root);
        int max=INT_MIN; int key;
        auto it=m.begin();
        while(it!=m.end())
        {
            if(it->second>max){ 
                max=it->second; key=it->first;
            }
            it++;
        }
        result.push_back(key);
        it=m.begin();
        while(it!=m.end())
        {
            if(it->second==max and it->first!=key) result.push_back(it->first);
            it++;
        }
        return result;
    }
};