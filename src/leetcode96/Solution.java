package leetcode96;

/**
 * Created by GaoYifei on 4/3/17.
 */
public class Solution {
    // Danamic Programming
    public int numTrees(int n) {
        // record all the unique patterns for the tree has 1 to n number
        int[] nums = new int[n + 1];
        if(n == 0) return 1;
        nums[0] = 1;
        nums[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                // for example
                // for tree n = 3 root could be 1, 2 ,3
                // when root is 1, the subtree would be 0 and 2
                // when root is 2, the subtree would be 1 and 1
                // when root is 3, the subtree would be 2 and 0
                // also notice the 4,5,6,7 subtree pattern number is same as 1,2,3,4 that is the trick
                nums[i] = nums[i] + (nums[i - j - 1] * nums[j]);
            }

        }
        return nums[n];
    }
}