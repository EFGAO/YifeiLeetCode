package leetcode34;

/**
 * Created by GaoYifei on 3/22/17.
 */
// O(n)的 时间复杂度 还不够优化
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target && res[0] == -1){
                // System.out.println("res[0] is" + i);
                res[0] = i;
            }
            if(res[0] != -1 && nums[i] != target){
                res[1] = i - 1;
                break;
            }
            else if(res[1] == -1 && i == nums.length - 1){
                res[1] = i;
            }
        }
        if(res[0] == -1 || res[1] == -1){
            res[0] = res[1] = -1;
            return res;
        }
        return res;
    }
}