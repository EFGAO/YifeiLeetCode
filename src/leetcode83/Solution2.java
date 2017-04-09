package leetcode83;

/**
 * Created by GaoYifei on 4/5/17.
 */
// more clean and consice
public class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=head;
        while(dummy.next!=null){
            if(dummy.next.val==dummy.val){
                dummy.next=dummy.next.next;
            }else dummy=dummy.next;
        }
        return head;
    }
}