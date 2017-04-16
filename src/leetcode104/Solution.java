package leetcode104;

/**
 * Created by GaoYifei on 4/12/17.
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

// 递归算法

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            if(left >= right){
                return left + 1;
            }
            else{
                return right + 1;
            }
        }


    }
}
