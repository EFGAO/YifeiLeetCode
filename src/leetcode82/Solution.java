package leetcode82;

/**
 * Created by GaoYifei on 4/5/17.
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = head.next;
        while(next != null){

            if(cur.val == next.val){
                while(next != null && cur.val == next.val){
                    next = next.next;
                }
                if(next == null) break;  //  reach the end of linked list
                pre.next = next;
                cur = next;
                next = cur.next;
            }
            else{
                cur = cur.next;
                pre = pre.next;
                next = cur.next;
            }

        }
        return dummy.next;
    }
}