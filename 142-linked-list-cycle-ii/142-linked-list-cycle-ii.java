/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;
        slow=fast=head;
        while(fast!= null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        while(head !=slow){
            slow=slow.next;
            head = head.next; 
        }
        return head;
    }
}