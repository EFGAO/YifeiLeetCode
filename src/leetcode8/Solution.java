package leetcode8;

/**
 * Created by GaoYifei on 3/11/17.
 */
public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        boolean start = false;
        int signal = 1;
        long sum = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(!start && c == ' '){
                // go on
            }
            else if(!start && !Character.isDigit(c) && c != '-' && c != '+'){
                return 0;
            }
            else if(c == '-'){
                if(start) return 0;
                start = true;
                signal = -1;
                continue;
            }
            else if(c == '+'){
                if(start) return 0;
                start = true;
                signal = 1;
                continue;
            }
            else if(start && !Character.isDigit(c)){
                break;
            }
            else if(!start && Character.isDigit(c)){
                start = true;
                sum = sum * 10 + (c - '0');
                // System.out.println("sum: " + sum);
                if(sum > Integer.MAX_VALUE ){
                    // System.out.println("exceed");
                    return signal == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            }

            else if(start && Character.isDigit(c)){
                sum = sum * 10 + (c - '0');
                // System.out.println("sum: " + sum);
                if(sum > Integer.MAX_VALUE){
                    // System.out.println("exceed");
                    return signal == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            }

        }

        // System.out.println("Return last");
        return (int)sum * signal;
    }
}