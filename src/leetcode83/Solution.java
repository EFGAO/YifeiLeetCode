package leetcode83;

/**
 * Created by GaoYifei on 4/5/17.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode next = head.next;
        while(next != null){
            if(current.val == next.val){
                current.next = next.next;
                next = current.next;
            }
            else{
                current = next;
                next = next.next;
            }

        }
        return head;
    }
}
