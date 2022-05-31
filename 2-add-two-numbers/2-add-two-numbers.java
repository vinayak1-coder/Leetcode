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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode res = new ListNode();
        ListNode cur = res;
        int rem = 0;
        while(l1!= null || l2 != null){
            int l = 0, r = 0;
            if(l1 != null) l = l1.val;
            if(l2 != null) r = l2.val;
            
            int temp = l + r + rem;
            cur.val = temp % 10;
            
            rem = temp / 10;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(l1 != null || l2 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        if(rem != 0){
            cur.next = new ListNode();
            cur.next.val = rem;
        }
        return res;
    }
}