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
    bool isSame=true;
    void same(TreeNode* p, TreeNode* q)
    {
        if(p==NULL or q==NULL){ isSame=false; return;}
        if(p->left!=NULL and q->left!=NULL) 
        {
            same(p->left,q->left); 
        }
        if(p->val!=q->val){ isSame=false; return;}
        if(p->right!=NULL and q->right!=NULL)
        {
            same(p->right,q->right);
        }
        if((p->right==NULL ^ q->right==NULL) or (p->left==NULL ^ q->left==NULL))
        {
            isSame=false; return;
        }
    }
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(p==NULL and q==NULL) return true;
        same(p,q);
        return isSame;
    }
};