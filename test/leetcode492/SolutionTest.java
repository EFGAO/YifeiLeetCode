package leetcode492;

import leetcode492.*;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GaoYifei on 3/5/17.
 */
public class SolutionTest {
    leetcode492.Solution solution = new Solution();

    @Test
    public void testConstructRectangle() throws Exception {
        int[] ints = {2,2};

        assertArrayEquals(ints, solution.constructRectangle(4));
    }
}