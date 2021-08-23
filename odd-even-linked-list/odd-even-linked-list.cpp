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
    ListNode* oddEvenList(ListNode* head) {
        if(head==NULL or head->next==NULL) return head;
        auto *odd=head; auto *even=head->next; auto *temp=even;
        while(1)
        {
            if(odd->next==NULL) break;
            odd->next=odd->next->next;
            if(even->next==NULL) break;
            even->next=even->next->next;
            even=even->next; odd=odd->next;
        }
        odd->next=temp;
        return head;
    }
};