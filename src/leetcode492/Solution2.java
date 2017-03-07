package leetcode492;

/**
 * Created by GaoYifei on 3/5/17.
 */

//The W is always less than or equal to the square root of area
//so we start searching at sqrt(area) till we find the result

    // 宽最大是 area的平方根,而且越接近平方根,越和长的差值越小,所以从平方根向下求索才是好方法
public class Solution2 {
    public int[] constructRectangle(int area) {
        int widthMax = (int)Math.sqrt(area);
        while(area % widthMax != 0) widthMax--;
        return new int[]{area/widthMax, widthMax};
    }
}