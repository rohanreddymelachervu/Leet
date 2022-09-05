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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(), right=new ListNode(), ltail=left, rtail=right;
        while(head!=null){
            if(head.val < x){
                ltail.next=head;
                ltail=ltail.next;
            }else{
                rtail.next=head;
                rtail=rtail.next;
            }
            head=head.next;
        }
        rtail.next=null;
        ltail.next=right.next;
        return left.next;
    }
}