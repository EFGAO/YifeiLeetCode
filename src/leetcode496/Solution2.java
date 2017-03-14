package leetcode496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by GaoYifei on 3/7/17.
 */
public class Solution2 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < nums.length; i++){
            int j;
            while(!stack.isEmpty() && stack.peek() < nums[i]){
                j = i;
                map.put(stack.pop(), nums[j]);
                j--;

            }
            stack.push(nums[i]);
        }
        int[] res = new int[findNums.length];
        for(int j = 0; j < findNums.length; j++){
            res[j] = map.getOrDefault(findNums[j], -1);
        }
        return res;

    }
}