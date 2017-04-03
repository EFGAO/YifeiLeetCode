package leetcode31;

import java.util.Arrays;

/**
 * Created by GaoYifei on 3/22/17.
 */
// 先找到从后往前第一个不是生序的数字 partition
    // 再找到从后往前第一个比partition打的数字 change
    // swap partition 和 change
    // 逆序partition 后的数字
    // 为什么这样就能得到next Permutation?
public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int partition = -1;
        int change = -1;
        int partitionIndex = 0;
        int changeIndex = 0;
        boolean flag = true;
        for(int i = len - 1; i > 0; i--){
            if(nums[i - 1] < nums[i]){
                partition = nums[i - 1];
                partitionIndex = i - 1;
                flag = false;
                break;
            }
        }
        for(int i = len - 1; i >= 0; i--){
            if(nums[i] > partition){
                change = nums[i];
                changeIndex = i;
                break;
            }
        }
        if(flag){
            Arrays.sort(nums);
            return;
        }
        // System.out.println("partition, change is"+ partition+ change);
        nums[partitionIndex] = change;
        nums[changeIndex] = partition;

        // System.out.println("partition index , changeindex is"+ partitionIndex + changeIndex);
        for(int i = partitionIndex + 1, j= 1; i <= len - j; i++,j++){
            int temp = nums[i];
            nums[i] = nums[len - j];
            nums[len - j] = temp;

        }
    }
}