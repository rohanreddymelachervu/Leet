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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead=new ListNode(0);
        ListNode l3=dummyHead;
        if(list1==null || list2==null) return (list1==null) ? list2 : list1;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                dummyHead.next=list1;
                list1=list1.next;
                dummyHead=dummyHead.next;
            }else{
                dummyHead.next=list2;
                list2=list2.next;
                dummyHead=dummyHead.next;
            }
        }
        while(list1!=null){
            dummyHead.next=list1;
            list1=list1.next;
            dummyHead=dummyHead.next;
        }
        while(list2!=null){
            dummyHead.next=list2;
            list2=list2.next;
            dummyHead=dummyHead.next;
        }
        return l3.next;
    }
}