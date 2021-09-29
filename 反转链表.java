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
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;

        ListNode cur = head;
        if(cur == null || cur.next == null){
            return cur;
        }
        ListNode tmp = head.next;

        while(cur.next != null){
            cur.next = pre;
            pre = cur;
            cur = tmp;
            tmp = tmp.next;
        }
        cur.next = pre;
        return cur;
    }
}
