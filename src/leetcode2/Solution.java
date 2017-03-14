package leetcode2;

/**
 * Created by GaoYifei on 3/8/17.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode current;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int carry = 0;
        while(cur1 != null && cur2 != null){
            current = new ListNode(0);
            int num1 = cur1.val;
            int num2 = cur2.val;
            int sum = num1 + num2 + carry;
            int val = sum % 10;
            carry = sum / 10;

            current.val = val;

            pre.next = current;
            pre = current;

            cur1 = cur1.next;
            cur2 = cur2.next;

        }
        while(cur1 != null){
            int sum = cur1.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            current = new ListNode(val);

            pre.next = current;
            pre = current;

            cur1 = cur1.next;
        }
        while(cur2 != null){
            int sum = cur2.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            current = new ListNode(val);

            pre.next = current;
            pre = current;

            cur2 = cur2.next;
        }
        if(carry != 0){
            current = new ListNode(carry);

            pre.next = current;
            pre = current;
        }
        return dummy.next;

    }
}