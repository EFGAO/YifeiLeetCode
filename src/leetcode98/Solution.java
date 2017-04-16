package leetcode98;

/**
 * Created by GaoYifei on 4/11/17.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Recursive Solution
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MAX_VALUE, Long.MIN_VALUE);

    }
    public boolean valid(TreeNode root, long max, long min){
        if(root == null){
            return true;
        }
        if(root.val >= max || root.val <= min){
            return false;
        }
        return valid(root.left, root.val,min ) && valid(root.right, max, root.val);
    }
}