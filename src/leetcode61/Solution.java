package leetcode61;

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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null) return head;
        ListNode cur = head;
        ListNode newHead = null;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        k = k % len;
        if(k == 0) return head;
        cur = head;
        int num = 1;
        while(num <= len){
            ListNode temp = cur.next;
            if(num == len - k){
                cur.next = null;
            }
            if(num == len - k + 1){
                newHead = cur;
            }
            if(num == len){
                cur.next = head;
            }
            cur = temp;
            num++;

        }
        return newHead;
    }
}