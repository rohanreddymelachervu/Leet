/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
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
    ListNode* mid(ListNode* head){
        auto* fast=head; auto* slow=head; auto* prev=head;
        while(fast!=NULL and fast->next!=NULL){
            prev=slow;
            slow=slow->next; fast=fast->next->next;
        }
        if(prev!=NULL) prev->next=NULL;
        return slow;
    }
    TreeNode* sortedListToBST(ListNode* head) {
        if(head==NULL) return NULL;
        auto* middle=mid(head);
        TreeNode* root=new TreeNode(middle->val);
        if(head==middle) return root;
        root->left=sortedListToBST(head);
        root->right=sortedListToBST(middle->next);
        return root;
    }
};