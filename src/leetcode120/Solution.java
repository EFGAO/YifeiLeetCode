package leetcode120;

import java.util.List;

/**
 * Created by GaoYifei on 4/8/17.
 */

// Danymic Programming which use O(n^2) space
    // The procedure is top down
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp =  new int[len][len];
        dp[0][0] = triangle.get(0).get(0);
        int minimum = Integer.MAX_VALUE;
        for(int i = 1; i < len; i++){
            List<Integer> temp = triangle.get(i);
            for(int j = 0; j < temp.size(); j++){
                if(j == 0){
                    dp[i][j] = dp[i - 1][j] + temp.get(j);
                }
                else if(j == temp.size() - 1){
                    dp[i][j] = dp[i - 1][j - 1] + temp.get(j);
                }
                else{
                    dp[i][j] = Math.min(dp[i - 1][j] + temp.get(j), dp[i - 1][j - 1] + temp.get(j));
                }

            }
        }
        for(int i = 0; i < len; i++){
            minimum = Math.min(minimum, dp[len - 1][i]);
        }
        return minimum;
    }
}