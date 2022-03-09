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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head; 
        HashMap<Integer,Integer> map=new HashMap<>();
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        temp=head;
        ListNode result=new ListNode(0);
        ListNode newNode=result;
        while(temp!=null){
            if(map.get(temp.val)>1){
                temp=temp.next;
            }else{
                newNode.next=new ListNode(temp.val);
                newNode=newNode.next;
                temp=temp.next;
            }
        }
        return result.next;
    }
}