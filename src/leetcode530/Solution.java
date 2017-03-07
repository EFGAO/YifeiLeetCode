package leetcode530;

/**
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

 1
 \
 3
 /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 Note: There are at least two nodes in this BST.
 */




public class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode preNode;
    public int getMinimumDifference(TreeNode root) {
        inorderTraverse(root);
        return min;



    }
    public void inorderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraverse(root.left);
        if(preNode != null){
            min = Math.min(min, root.val - preNode.val);
        }
        preNode = root;
        inorderTraverse(root.right);
    }
}