package leetcode141;

/**
 * Created by GaoYifei on 4/5/17.
 */

import java.util.HashSet;

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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode current = head;
        HashSet<ListNode> hash = new HashSet();
        hash.add(current);
        while(current.next != null){
            if(!hash.contains(current.next)){
                hash.add(current.next);
                current = current.next;
            }
            else{
                return true;
            }

        }
        return false;
    }
}