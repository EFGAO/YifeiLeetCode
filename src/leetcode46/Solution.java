package leetcode46;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaoYifei on 3/29/17.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backstracking(res, temp, nums);
        return res;
    }
    private void backstracking(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            // System.out.println("temp is" + temp);
            res.add(new ArrayList(temp));
            return;
        }
        for(int num: nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            backstracking(res, temp, nums);
            temp.remove(temp.size() - 1);
        }

    }
}
