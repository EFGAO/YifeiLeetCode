package leetcode101;

/**
 * Created by GaoYifei on 4/11/17.
 */

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
    // Iterative Solution
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> L = new Stack<TreeNode>();
        Stack<TreeNode> R = new Stack<TreeNode>();
        if(root == null) return true;
        L.push(root.left);
        R.push(root.right);
        while(!R.empty() && !L.empty()){
            TreeNode left = L.pop();
            TreeNode right = R.pop();
            if(left == null && right != null){
                return false;
            }
            else if(right == null && left != null){
                return false;
            }
            else if(right == null && left == null){
                continue;
            }
            if(left.val != right.val){
                return false;
            }
            else{
                L.push(left.left);
                L.push(left.right);
                R.push(right.right);
                R.push(right.left);

            }

        }
        return true;
    }
}