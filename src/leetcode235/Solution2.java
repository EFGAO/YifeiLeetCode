package leetcode235;

/**
 * Created by GaoYifei on 3/6/17.
 */
public class Solution2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while((root.val > p.val && root.val > q.val) || (root.val < p.val && root.val < q.val)){
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return root;
    }
}