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
        List<Integer> arrList=new ArrayList<>();
        for(ListNode temp=head;temp!=null;temp=temp.next){
            arrList.add(temp.val);
        }
        int[] result=new int[arrList.size()];
        int counter=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arrList.size();i++){
            while(!stack.isEmpty() && arrList.get(stack.peek())<arrList.get(i)) result[stack.pop()]=arrList.get(i);
            stack.push(i);
            
        }
        return result;
    }
}