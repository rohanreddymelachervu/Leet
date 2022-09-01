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
    public void reorderList(ListNode head) {
        ListNode slow=head, fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null, next=null;
        while(second!=null){
            next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        second=prev; ListNode first=head;
        while(second!=null){
            ListNode firstNext=first.next, secondNext=second.next;
            first.next=second;
            second.next=firstNext;
            first=firstNext;
            second=secondNext;
        }
    }
}