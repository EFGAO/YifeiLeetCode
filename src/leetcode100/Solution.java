package leetcode100;

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
    // 可以判断数字是否一致 但是结构不可以
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean left = true;
        boolean right = true;
        if(p != null && q != null){

            if(p.left != null && q.left != null){
                // System.out.println("进入左孩子递归");
                left = isSameTree(p.left, q.left);
                //System.out.println("退出左孩子递归");
            }
            if(p.right != null && q.right != null){
                // System.out.println("进入右孩子递归");
                right = isSameTree(p.right, q.right);
                // System.out.println("退出右孩子递归");
            }
            if((p.left != null && q.left == null) || (p.left == null && q.left != null) ||
                    (p.right != null && q.right == null) || (p.right == null && q.right != null)){
                //System.out.println("结构有差异");
                return false;
            }
            if(p.val == q.val){
                // 在结构没有差异的情况下，value 一致的condition
                if(p.left != null && p.right != null){
                    // System.out.println("两个孩子比较");
                    return left && right;
                }
                else if(p.right == null && p.left != null ){
                    //System.out.println("左孩子比较");
                    return left;
                }
                else if(p.left == null && p.right != null){
                    //System.out.println("右孩子比较");
                    return right;
                }
                else{
                    // System.out.println("叶子节点");
                    return true;

                }

            }
            else{
                // 结点value 不同
                return false;
            }

        }
        else{
            if(p == null && q == null){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
