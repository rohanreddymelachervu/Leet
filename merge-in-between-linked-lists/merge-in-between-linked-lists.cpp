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
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        auto* temp=list1; auto* temp1=list1;
        for(int i=1;i<a;i++) temp=temp->next;
        for(int j=0;j<b;j++) temp1=temp1->next;
        temp->next=list2;
        while(temp->next!=nullptr) temp=temp->next;
        temp->next=temp1->next;
        return list1;
    } 
};