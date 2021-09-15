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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head; ListNode even=head.next; ListNode tempOdd=odd; ListNode tempEven=even;
        while(true){
            if(odd.next==null) break;
            odd.next=odd.next.next;
            if(even.next==null) break;
            even.next=even.next.next;
            odd=odd.next; even=even.next;
        }
        odd.next=tempEven;
        return tempOdd;
    }
}