package leetcode147;

/**
 * Created by GaoYifei on 4/17/17.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode cur = head;
        ListNode next;
        // iterate through all nodes
        while(cur != null){
            next = cur.next;
            ListNode p = newHead;
            // check from newHead where the insert position is
            while(p.next != null && p.next.val < cur.val){
                p = p.next;
            }
            // insert the value
            cur.next = p.next;
            p.next = cur;

            cur = next;

        }
        return newHead.next;
    }
}