
/**
解题思路
此处撰写解题思路

pre是新的尾巴，cur是当前的元素，tmp是cur下一个元素
如果cur或tmp为null，那么直接返回cur就可以，说明这个链没有元素或就一个元素
pre是尾巴，cur指向head头，tmp指向cur的下一个元素
先将cur的next指向pre，即断链
然后，所有指针向后移动，pre指向cur，cur指向tmp，tmp指向tmp的next
直到cur的next为null时，就到了最顶端了，这时退出循环
然后将cur的next指向pre，这时最后一个元素也链了上去，这时返回cur即可

*/


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
