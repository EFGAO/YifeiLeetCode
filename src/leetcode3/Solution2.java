package leetcode3;

import java.util.HashMap;

/**
 * Created by GaoYifei on 3/10/17.
 */

// 用two pointer 的方式来实现一个滑动窗口
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // String res = "";
        if(s.length() == 0) return 0;
        int max = 0;
        for(int i = 0, j = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i)) + 1);

            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}