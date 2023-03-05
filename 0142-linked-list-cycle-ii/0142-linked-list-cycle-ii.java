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
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast = fast.next; 
        }
        return fast;
    }
}