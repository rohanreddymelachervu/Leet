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
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==NULL) return NULL;
        if(head->next==NULL) return head;
        auto *temp=head; temp=temp->next; auto *fast=head;
        auto *slow=head; int size=0;
        while(fast!=NULL) 
        {
            size++; fast=fast->next;
        }
        cout<<size<<endl;
        int final_k=k%size;
        for(int i=0;i<final_k;i++)
        {
            slow=head; temp=head->next;
            while(temp->next!=NULL)
            {
                slow=slow->next; temp=temp->next;
            } 
            temp->next=head;
            head=temp;
            slow->next=NULL;
        }
        return head;
    }
};