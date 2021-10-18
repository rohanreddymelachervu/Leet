# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy_head=ListNode(0)
        l3=dummy_head
        carry=0
        while(l1!=None or l2!=None):
            if(l1==None): l1_val=0
            else: l1_val=l1.val
            if(l2==None): l2_val=0
            else: l2_val=l2.val
            current_sum=l2_val+l1_val+carry
            carry=(int)(current_sum/10)
            last_digit=current_sum%10
            l3.next=ListNode(last_digit)
            if(l1!=None): l1=l1.next
            if(l2!=None): l2=l2.next
            l3=l3.next
        if(carry>0):
            l3.next=ListNode(carry)
            l3=l3.next
        return dummy_head.next