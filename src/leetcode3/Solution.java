package leetcode3;

import java.util.HashSet;

/**
 * Created by GaoYifei on 3/10/17.
 */
// 笨方法 O(n^2) 复杂度 没有用到two pointer 而是用了两次循环
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        String res = "";
        int start = 0;
        int len = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                len++;
            }
            else{
                if(len > max){
                    max = len;
                    res = s.substring(start, i);
                    // System.out.println("substring is" + res);
                }
                len = 1;
                start++;
                i = start;
                set.clear();
                set.add(s.charAt(i));

            }
            // 最后一个字符
            if(i == s.length() - 1){

                if(len > max){
                    max = len;
                    res = s.substring(start);
                    // System.out.println("substring is" + res);
                }
            }
        }
        return max;
    }
}