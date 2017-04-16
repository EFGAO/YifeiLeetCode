package leetcode74;

/**
 * Created by GaoYifei on 4/10/17.
 */
// binary search solution
public class Solution2 {
    // Treat as a sorted list instead of a Matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row * col - 1;
        int mid = low + (high - low) / 2;

        while(low <= high){
            int newRow = mid / col;
            int newCol = mid % col;
            if(matrix[newRow][newCol] == target){
                return true;
            }
            else if(matrix[newRow][newCol] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
        return false;
    }
}