package leetcode94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by GaoYifei on 4/4/17.
 */
public class Solution2 {
    // iterative solution using stack
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode current = root;
        while(current != null || !stack.empty()){
            while(current != null){
                System.out.println("push" + current.val);
                stack.push(current);
                current = current.left;

            }
            current = stack.pop();
            System.out.println("pop" + current.val);
            res.add(current.val);
            current = current.right;

        }
        return res;
    }
}
