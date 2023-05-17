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
    public int pairSum(ListNode head) {

        if (head == null) { 
            return 0;
        }
        if (head.next == null) { 
            return head.val;
        }

        ListNode prev = null; 
        ListNode curr = findMid(head); 
        ListNode next; 

        while (curr != null) { 

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev; 
        ListNode left = head; 

        int max = Integer.MIN_VALUE;

        while (right != null) { 

            max = Math.max(left.val + right.val, max);
            right = right.next;
            left = left.next;
        }

        return max;

    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head;
        while (fast != null && fast.next != null) { 
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }

}