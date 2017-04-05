package leetcode144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by GaoYifei on 4/4/17.
 */
// Iterative Method, Recursive Method is similar as inorderTraversal and postorderTraversal
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current != null || !stack.empty()){
            while(current != null){
                res.add(current.val);
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;
        }
        return res;
    }
}