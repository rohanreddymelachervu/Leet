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
    public ListNode mergeNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(stack.isEmpty() || stack.peek()==0){
                stack.push(temp.val);
            }else if(temp.val==0){
                while(stack.peek()!=0){
                    sum+=stack.pop();
                }
                dummy.next=new ListNode(sum);
                dummy=dummy.next;
                sum=0;
            }else{
                stack.push(temp.val);
            }
            temp=temp.next;
        }
        return res.next;
    }
}