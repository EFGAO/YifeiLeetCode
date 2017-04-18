package leetcode112;

/**
 * Created by GaoYifei on 4/16/17.
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
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;

        boolean left;
        boolean right;
        if(root.left != null){
            left = hasPathSum(root.left, sum - root.val);
            if(left)
                return true;
        }
        if(root.right != null){
            right = hasPathSum(root.right, sum - root.val);
            if(right)
                return true;
        }
        if(root.right == null && root.left == null){
            if(root.val == sum){
                return true;
            }

        }
        return false;
    }



}
