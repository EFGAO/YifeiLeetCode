package leetcode206;

/**
 * Created by GaoYifei on 4/16/17.
 */
// Recursive Solution
public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode newHead;

        if(head == null || head.next == null){
            return head;
        }
        newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
