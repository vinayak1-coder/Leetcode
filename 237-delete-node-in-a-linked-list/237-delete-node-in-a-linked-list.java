/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode head =node;
        ListNode prev = node;
        while(head.next != null){
            swap(head,head.next);
            prev= head;
            head=head.next;
            
        }
        prev.next=null;
    }
        public void swap(ListNode head,ListNode next){
            int temp = head.val;
            head.val = next.val;
            next.val = temp;
        }
}