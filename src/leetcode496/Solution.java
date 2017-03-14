package leetcode496;

/**
 * Created by GaoYifei on 3/7/17.
 */

// O(mn) 的 BruteForce的方法

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        boolean flag;
        int[] res = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++){
            flag = false;
            for(int j = 0; j < nums.length; j++){
                if(findNums[i] == nums[j]){
                    flag = true;
                }
                if(flag && nums[j] > findNums[i]){
                    res[i] = nums[j];
                    break;
                }
                if(j == nums.length - 1 && res[i] == 0){
                    res[i] = -1;
                }
            }
        }
        return res;

    }
}