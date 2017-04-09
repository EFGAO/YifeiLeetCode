package leetcode142;

/**
 * Created by GaoYifei on 4/7/17.
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution2 {
    //Floyd Tortoise and Hare Algorithm
    public ListNode detectCycle(ListNode head) {

        ListNode hare = head;
        ListNode tor  = head;
        Boolean hasCycle = false;
        while(tor != null && hare != null){
            if(hare.next == null) return null;
            hare = hare.next.next;
            tor = tor.next;
            if(hare == tor){
                hasCycle = true;
                break;
            }
        }
        if(hasCycle){
            tor = head;
            while(tor != hare){
                tor = tor.next;
                hare = hare.next;
            }
            return tor;
        }
        else{
            return null;
        }
    }
}