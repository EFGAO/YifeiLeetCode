package leetcode55;

/**
 * Created by GaoYifei on 4/3/17.
 */
public class Solution2 {
    //Greedy Solution
    public boolean canJump(int[] nums) {
        int lastJump = nums.length - 1;
        for(int i = nums.length - 1; i >=0; i--){
            if(i + nums[i] >= lastJump){
                lastJump = i;
            }
        }
        return lastJump == 0;
    }
}
