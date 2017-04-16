package leetcode74;

/**
 * Created by GaoYifei on 4/10/17.
 */
public class Solution {
    // brute force solution is easy
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
