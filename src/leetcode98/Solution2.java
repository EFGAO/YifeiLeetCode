package leetcode98;

/**
 * Created by GaoYifei on 4/11/17.
 */
// Iterative Solution

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution2 {
    // Iterative Solution using stack
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode pre = null;
        while(current != null || !stack.empty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(pre != null && pre.val >= current.val) return false;
            pre = current;
            current = current.right;

        }
        return true;
    }
}
