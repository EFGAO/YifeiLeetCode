package leetcode143;

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode mid = p1.next;
        p1.next = null;
        ListNode midHead = reverse(mid);
        p1 = head;
        p2 = midHead;
        merge(p1, p2);

    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    // 这个是难点，merge两个linked list one by one
    public void merge(ListNode p1, ListNode p2){
        ListNode cur1 = p1;
        ListNode cur2 = p2;
        while(cur1 != null && cur2 != null){
            ListNode next1 = cur1.next;
            cur1.next = cur2;
            // if(cur2 == null) break;
            ListNode next2 = cur2.next;
            cur2.next = next1;
            cur2 = next2;
            cur1 = next1;

        }
    }
}
