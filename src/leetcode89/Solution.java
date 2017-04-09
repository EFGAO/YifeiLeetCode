package leetcode89;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by GaoYifei on 4/7/17.
 */

// 关键是 要找到gray code 对称的规律
    //    000
//        001
//        011
//        010
//        110
//        111
//        101
//        100
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new LinkedList<Integer>();
        res.add(0);
        for(int i = 1; i < (1 << n); i = (i << 1)){
            for(int j = i - 1; j >= 0; j-- ){
                res.add(res.get(j) | i);
            }
        }
        return res;
    }
}
