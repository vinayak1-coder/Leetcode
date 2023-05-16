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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp1 = head;
        while(temp1!=null && temp1.next != null){
           int val = temp1.val;
            temp1.val = temp1.next.val;
            temp1.next.val = val;
            temp1 = temp1.next.next;
        }
        return head;
    }
}