package leetcode48;

/**
 * Created by GaoYifei on 4/8/17.
 */
public class Solution2 {
    // In Place solution
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // First Step: Reverse the Matrix Up to Down
        for(int i = 0; i < len/2; i++){
            for(int j = 0; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - i - 1][j];
                matrix[len - i - 1][j] = temp;
            }
        }
        // for(int i = 0; i < len; i++){
        //     for(int j = 0; j < len; j++){
        //         System.out.println(matrix[i][j]);
        //     }
        // }

        // Second Step: Symmtric Swap
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


    }
}
