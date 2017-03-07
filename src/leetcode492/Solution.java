package leetcode492;

/**
 * Created by GaoYifei on 3/5/17.
 */

// 这个是我的最朴素的方法,效率非常低
public class Solution {
    public Solution() {
    }

    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int diff = Integer.MAX_VALUE;
        if(area == 1){
            res[0] = res[1] = 1;
            return res;
        }
        for(int i = 1; i <= area/2; i++){
            if(area % i == 0 && i <= area / i && (area/i - i) < diff){
                res[0] = area/i;
                res[1] = i;
                diff = area/i - i;
            }
        }
        return res;
    }
}