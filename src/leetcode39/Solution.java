package leetcode39;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaoYifei on 3/31/17.
 */
public class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<List<Integer>>();
        // Arrays.sort(candidates); // 没必要排序
        List<Integer> temp = new ArrayList<Integer>();
        backstrack(candidates, target, temp, 0);
        return res;
    }
    private void backstrack(int[] candidates, int target, List<Integer> temp, int start){
        if(target == 0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        else if(target < 0){
            return;
        }
        else{
            for(int i = start; i < candidates.length; i++){
                // if (temp.contains(candidates[i])) continue;
                temp.add(candidates[i]);
                backstrack(candidates, target - candidates[i], temp, i);
                temp.remove(temp.size() - 1);
            }
        }

    }
}