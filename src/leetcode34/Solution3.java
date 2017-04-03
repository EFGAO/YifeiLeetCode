package leetcode34;

/**
 * Created by GaoYifei on 3/22/17.
 */
public class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target){
                end = mid - 1;
            }
            else{
                start = start + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        res[0] = index;

        index = -1;
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            if(nums[mid] == target) index = mid;
        }
        res[1] = index;

        return res;

    }
}
