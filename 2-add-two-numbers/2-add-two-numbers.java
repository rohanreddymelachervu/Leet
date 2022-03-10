/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode l3=result;
        int carry=0;
        while(l1!=null || l2!=null){
            int l1Val=(l1!=null) ? l1.val : 0;
            int l2Val=(l2!=null) ? l2.val : 0;
            int sum=l1Val+l2Val+carry;
            carry=sum/10;
            int lastDigit=sum%10;
            l3.next=new ListNode(lastDigit);
            l3=l3.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry!=0) l3.next=new ListNode(carry);
        return result.next;
    }
}