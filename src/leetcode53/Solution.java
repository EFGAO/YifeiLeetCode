package leetcode53;

/**
 * Created by GaoYifei on 4/7/17.
 */

//  找到子问题是关键
    //  以index 0,1,2,3,4,5结尾的subarray 构成了 所有的subarray的情况
public class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len]; //  以i结尾的subarray 最大值  //dp[i] means the maximum subarray ending with A[i];
        int max = nums[0];
        dp[0] = nums[0];

        int start = 0;
        for(int i = 1; i < len; i++){
            if(dp[i - 1] < 0) dp[i] = nums[i];
            else dp[i] = dp[i - 1] + nums[i];
            max = Math.max(dp[i], max);
            // if(dp[i] > max) max = dp[i];

        }

        return max;
    }
}