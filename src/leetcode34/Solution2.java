package leetcode34;

/**
 * Created by GaoYifei on 3/22/17.
 */
// binary search 但是并不是最优解
    // 先用binary search找到一个数字 再向两边扩展
public class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low)/2;
        int index = -1;
        int[] res = {-1, -1};
        if(nums.length == 0) return res;
        while(low <= high){
            if(nums[mid] < target){
                low = mid + 1;
                mid = low + (high - low)/2;
            }
            else if(nums[mid] > target){
                high = mid - 1;
                mid = low + (high - low)/2;
            }
            else{
                index = mid;
                break;
            }
        }
        // System.out.println("index is " + index);
        if(index != -1){
            while(index < nums.length && nums[index] == target){
                index++;
            }
            res[1] = index - 1;
            index = mid;
            // System.out.println("index is "+ index);
            while(index >= 0 && nums[index] == target ){
                index--;
            }
            res[0] = index + 1;
        }
        return res;
    }
}