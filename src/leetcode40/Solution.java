package leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GaoYifei on 3/31/17.
 */
public class Solution {
    List<List<Integer>> res;
    // boolean [] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        // used = new boolean[candidates.length];
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
                if(i > start && candidates[i] == candidates[i - 1]) continue; // 这句是关键 第二次遍历到相同的数字，则略过

                temp.add(candidates[i]);
                backstrack(candidates, target - candidates[i], temp, i + 1);
                temp.remove(temp.size() - 1);

            }
        }

    }
}
