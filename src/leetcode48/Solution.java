package leetcode48;

/**
 * Created by GaoYifei on 4/8/17.
 */
public class Solution {
    // out of place solution
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        int rotate[][] = new int[len][len];

        for(int j = len - 1,a = 0; j >= 0; j--,a++){
            for(int i = 0,b = 0; i < len; i++,b++){
                rotate[i][j] = matrix[a][b];
            }
        }
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                // System.out.println(rotate[i][j]);
                matrix[i][j] = rotate[i][j];
            }
        }

    }
}