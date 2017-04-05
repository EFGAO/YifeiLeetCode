package leetcode145;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaoYifei on 4/4/17.
 */
public class Solution {
    // simple recursive solution
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        traverse(root,res);
        return res;

    }
    private void traverse(TreeNode root, List<Integer> list){
        if(root == null) return;
        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
    }
}