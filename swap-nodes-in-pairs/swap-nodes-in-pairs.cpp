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
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if(head==NULL or head->next==NULL) return head;
        auto *cur=head->next;
        ListNode* temp=NULL;
        auto *prev=head;
        head=cur;
        prev->next=cur->next;
        cur->next=prev;
        while(prev->next!=NULL and prev->next->next!=NULL)
        {
            temp=prev;
            prev=prev->next;
            cur=prev->next;
            prev->next=cur->next;
            cur->next=prev;
            temp->next=cur;
        }
    return head;
    }
};