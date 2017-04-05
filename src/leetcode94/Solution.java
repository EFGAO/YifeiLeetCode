package leetcode94;

/**
 * Created by GaoYifei on 4/4/17.
 */

import java.util.ArrayList;
import java.util.List;

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
    // List 可以定义为全局变量，也可以作为traverse的参数传递
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }
    private void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}