package leetcode141;

/**
 * Created by GaoYifei on 4/5/17.
 */

//Use two pointers, walker and runner.
//        walker moves step by step. runner moves two steps at time.
//        if the Linked List has a cycle walker and runner will meet at some
//        point.
    // 我们可以证明walker 和 runner 一定会相遇 如果存在cycle的话
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}