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
 *
 *     TreeNode(int x)
 *     { val = x;

 }
 * }
 */
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if((p != null && q == null) || (p == null && q != null)){
            return false;
        }

        else if(p.val == q.val){
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        }
        else{
            return false;
        }
    }
}
