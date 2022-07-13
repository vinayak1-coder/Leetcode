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
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = head, next = null;
        while(curr!=null){
            next = curr.next;
            if(next==null) break;
            if(next.val==curr.val){
                while(next!=null && next.val==curr.val){
                    next = next.next;
                    curr = curr.next;  
                }
                prev.next = next;
                curr.next = null;
                curr = next; 
            }
            else{
                prev = curr;
                curr = next;
            }
        }
        return dummy.next;
    }
}