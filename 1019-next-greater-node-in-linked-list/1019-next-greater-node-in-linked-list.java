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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head; int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] result=new int[size]; int counter=0;
        temp=head;
        while(temp!=null){
            ListNode tempNext=temp.next;
            int val1=temp.val;
            while(tempNext!=null){
                if(tempNext.val>val1){
                    result[counter++]=tempNext.val;
                    break;
                }
                tempNext=tempNext.next;
            }
            if(tempNext==null){
                result[counter++]=0;
            }
            temp=temp.next;
        }
        return result;
    }
}