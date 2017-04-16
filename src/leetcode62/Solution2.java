package leetcode62;

/**
 * Created by GaoYifei on 4/9/17.
 */
// m space 的解法, 因为没必要维护m* n的dp 详见li fighter solution
public class Solution2 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[m];
        for(int i = 0; i < m; i++){
            dp[i] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[m - 1];
    }
}