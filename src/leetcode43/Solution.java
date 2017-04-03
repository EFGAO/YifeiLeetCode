package leetcode43;

/**
 * Created by GaoYifei on 3/29/17.
 */
public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] temp = new int[len1 + len2];
        String res = new String();
        for(int i = len1 - 1; i >=0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int startIndex = i + j;
                int endIndex = i + j + 1;
                int sum = temp[endIndex] + product;
                temp[startIndex] += sum / 10;
                temp[endIndex] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i: temp){
            if(!(sb.length() == 0 && i == 0))
                sb.append(i);
        }
        return sb.length() == 0 ? "0" : sb.toString();

    }

}