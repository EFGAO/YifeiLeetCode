package leetcode412;

import java.util.List;

/**
 * Created by GaoYifei on 3/5/17.
 */
public class main {
    public static void main(String[] args){
        int testNum = 10;
        test(testNum);
    }
    private static void test(int testNum){
        Solution solution = new Solution();
        List<String> res = solution.fizzBuzz(testNum);
        for(String s: res){
            System.out.println(s);
        }
    }
}
