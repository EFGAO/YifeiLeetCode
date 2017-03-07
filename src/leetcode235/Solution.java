package leetcode235;

/**
 * Created by GaoYifei on 3/6/17.
 */
// 对于BST来说 ，第一个遇到的 p 和 q 之间的数字 就是他们的LCA
    // 可以涌过递归和迭代两种方法 实现
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return root;
        }
    }
}