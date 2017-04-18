package leetcode75;

/**
 * Created by GaoYifei on 4/17/17.
 */
public class Solution {
    public void sortColors(int[] nums) {
        // Bubble Sort
        // for(int i = 0; i < nums.length - 1; i++){
        //     for(int j = 0; j < nums.length - 1; j++){
        //         if(nums[j] > nums[j + 1] ){
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }
        // }
        int red, white, blue;
        red = white = blue = 0;
        for(int num: nums){
            if(num == 0) red++;
            if(num == 1) white++;
            if(num == 2) blue++;
        }
        for(int i = 0; i < red; i++){
            nums[i] = 0;
        }
        for(int i = red; i < red + white; i++){
            nums[i] = 1;
        }
        for(int i = white + red; i < nums.length; i++){
            nums[i] = 2;
        }

    }
}
