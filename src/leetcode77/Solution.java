package leetcode77;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaoYifei on 4/4/17.
 */
// a backtracking problem similar as Permutation
public class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        backtracking(1, n, k, temp);
        return res;
    }
    private void backtracking(int start, int n, int k, List<Integer> temp){
        if(temp.size() == k){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i = start; i <= n; i++){
            temp.add(i);
            backtracking(i + 1, n, k, temp);
            temp.remove(temp.size() - 1);
        }


    }
}
