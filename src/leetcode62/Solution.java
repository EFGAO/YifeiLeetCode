package leetcode62;

/**
 * Created by GaoYifei on 4/8/17.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        // if(m == 0 && n == 0){
        //     return 0;
        // }
        // else if(m == 0 || n == 0){
        //     return 1;
        // }

        int[][] mark = new int[m][n]; // means the number of paths to m*n grid

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == 0){
                    mark[i][j] = 1;
                }
                else{
                    mark[i][j] = mark[i - 1][j] + mark[i][j - 1];
                }


            }
        }
        return mark[m - 1][n - 1];
    }
}