package leetcode206;

/**
 * Created by GaoYifei on 4/16/17.
 */
public class Solution2 {
    // Iterative Solution
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;

    }

}
