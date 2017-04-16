package leetcode26;

/**
 * Created by GaoYifei on 4/11/17.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 1;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] < nums[i+1]){
                nums[index] = nums[i + 1];
                index++;
            }
            else {

                length--;

            }
        }
        return length;

    }
}