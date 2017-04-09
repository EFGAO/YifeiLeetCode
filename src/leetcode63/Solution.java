package leetcode63;

/**
 * Created by GaoYifei on 4/9/17.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int dp[][] = new int[row][col];
        boolean rowFlag = false;
        boolean colFlag = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    if(i == 0) rowFlag = true;
                    if(j == 0) colFlag = true;
                }
                else if(i == 0 || j == 0){

                    if(j == 0){
                        if(colFlag) dp[i][j] = 0;
                        else dp[i][j] = 1;
                    }
                    if(i == 0){
                        if(rowFlag) dp[i][j] = 0;
                        else dp[i][j] = 1;
                    }
                }
                else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }

            }
        }
        // System.out.println("colFlag" + colFlag + "rowFlag" + rowFlag);
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < col; j++){
        //         System.out.println(dp[i][j]);
        //     }
        // }
        return dp[row - 1][col - 1];
    }
}