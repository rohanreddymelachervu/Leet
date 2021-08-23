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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp=new ListNode(0); temp->next=head;
        auto *fast=temp; auto *slow=temp;
        for(int i=0;i<n;i++) 
        {
            fast=fast->next;
        }
        while(fast!=NULL and fast->next!=NULL)
        {
            slow=slow->next; fast=fast->next;
        }
        slow->next=slow->next->next;
    return temp->next;
    }
};