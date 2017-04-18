package sort;

/**
 * Created by GaoYifei on 4/17/17.
 */
public class InsertSort {
    public void sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    // 往后顺位
                    for(int k = i; k > j; k--){
                        nums[k] = nums[k - 1];
                    }
                    nums[j] = temp;
                }
            }
        }
    }
}
