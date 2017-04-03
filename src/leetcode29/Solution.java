package leetcode29;

/**
 * Created by GaoYifei on 3/13/17.
 */



/**
 * Created by GaoYifei on 3/13/17.
 */

// 解决了TLE的问题
public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == 0) return 0;
        int sign;
        if((dividend > 0 && divisor >0) ||(dividend < 0 && divisor < 0)){
            sign = 1;
        }
        else sign = -1;

        long remainder = Math.abs((long)dividend);
        long div = Math.abs((long)divisor);
        if(remainder < div){
            return 0;
        }

        // System.out.println("remainder" + remainder + "div" + div);
        long sum = div;
        long multiple = 1;
        long result = 0;
        while(remainder >= div){
            sum = div;
            multiple = 1;
            while(remainder >= sum + sum){
                sum = sum + sum;
                multiple = multiple + multiple;
                // remainder = remainder - sum;
            }
            remainder = remainder - sum;
            result += multiple;
        }

        // while(remainder >= div){
        //     remainder = remainder - div;
        //     multiple++;
        // }
        // System.out.println("multiple is " + multiple);
        if(result > Integer.MAX_VALUE){
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign == 1 ? (int)result: (int)-result;
    }
}
