package leetcode120;

import java.util.List;

/**
 * Created by GaoYifei on 4/8/17.
 */
// a bottom up procedure is better , only O(n) space and do not need to discuss different condition
public class Solution2 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++)
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
        }
        return dp[0];
    }
}