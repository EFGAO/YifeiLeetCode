package leetcode142;

import java.util.HashSet;

/**
 * Created by GaoYifei on 4/6/17.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
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
                return current.next;
            }

        }
        return null;
    }
}