package leetcode144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by GaoYifei on 4/4/17.
 */
// another iterative solution with stack, more clear and straghitforward
public class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null) return res;

        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop();
            res.add(current.val);
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);

        }
        return res;
    }
}
