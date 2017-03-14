package leetcode5;

/**
 * Created by GaoYifei on 3/11/17.
 */
public class Solution {
    private int maxLen = 0;
    private int startIndex = 0;

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            extendPalindrome(s, i, i);    // for odd length palindrome

        }
        for(int i = 0; i < s.length() - 1; i++){
            extendPalindrome(s, i, i+ 1); // for even length palindrome
        }
        return s.substring(startIndex, startIndex + maxLen);
    }
    private void extendPalindrome(String s, int start, int end){
        // while it is palindrome , extend it as long as possible
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        start++;
        end--;
        int len = end - start + 1;
        if(len > maxLen){
            maxLen = len;
            startIndex = start;
        }
    }
}