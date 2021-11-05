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
        auto *fast=head,*slow=head;
        for(int i=1;i<n;i++) fast=fast->next;
        ListNode *prev=NULL;
        while(fast->next){
            prev=slow;
            slow=slow->next;
            fast=fast->next;
        }
        if(!prev){
            return head->next;
        }
        prev->next=slow->next;
        slow->next=NULL;
        delete slow;
        return head;
    }
};