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
    ListNode* deleteDuplicates(ListNode* head) {
        map<int,int> m;
        auto* temp=head;
        while(temp!=nullptr){
            m[temp->val]++;
            temp=temp->next;
        }
        temp=head;
        ListNode* newNode=new ListNode(0);
        auto* result=newNode;
        while(temp!=nullptr){
            auto mit=m.find(temp->val);
            if(mit->second>1){
                temp=temp->next;
            } else{
                newNode->next=new ListNode(temp->val);
                newNode=newNode->next;
                temp=temp->next;
            }
        }
        return result->next;
    }
};