package leetcode55;

/**
 * Created by GaoYifei on 4/1/17.
 */
// BackTracking Solution Time Limit Exceed
    // 最好想的 但是效率最低
/*
This is the inefficient solution where we try every single jump
        pattern that takes us from the first position to the last.
        We start from the first position and jump to every index that is
        reachable. We repeat the process until last index is reached.
        When stuck, backtrack.
*/
public class Solution {
    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }
    public boolean canJumpFromPosition(int pos, int[] nums){
        if(pos == nums.length - 1) return true;
        int maxDistance = Math.min(pos + nums[pos], nums.length - 1);
        for(int i = pos + 1; i <= maxDistance; i++){
            if(canJumpFromPosition(i, nums)) return true;
        }
        return false;

    }
}