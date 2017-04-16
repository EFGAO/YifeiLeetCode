package leetcode101;

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
public class Solution {
    // 可以同时用递归或者循环的方式
    public boolean isSymmetric(TreeNode root) {
        // 方法一 生成一个新的转置二叉树 然后比较是否相同
        //TreeNode invertRoot = invert(root);
        //return isSame(invertRoot, root);
        // 方法二 递归方法直接比较
        if(root == null){
            return true;
        }
        else{
            return sym(root.left, root.right);
        }


    }
    public boolean sym(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        else if(left == null && right != null){
            return false;
        }
        else if(right == null && left != null){
            return false;
        }
        else if(left.val != right.val){
            return false;
        }
        else{
            return sym(left.left, right.right) && sym(left.right, right.left);
        }
    }


    public TreeNode invert(TreeNode root){
        if(root == null){
            return null;
        }
        else{
            TreeNode invertRoot = new TreeNode(root.val);
            invertRoot.left = invert(root.right);
            invertRoot.right = invert(root.left);
            return invertRoot;
            // 下面的是在 in place 的情况 如果要生成新的 就需要上述方法 新建一个二叉树
            // TreeNode temp = root.left;
            // root.left = root.right;
            // root.right = temp;
            // root.left = invert(root.left);
            // root.right = invert(roolt.right);
        }

    }

    public boolean isSame(TreeNode root, TreeNode root2){
        if(root == null && root2 == null){
            return true;
        }
        else if(root == null || root2 == null){
            return false;
        }
        else if(root.val != root2.val){
            return false;
        }
        else if(root.val == root2.val){
            return isSame(root.left,root2.left) && isSame(root.right, root2.right);
        }
        else{
            return false;
        }
    }
}
