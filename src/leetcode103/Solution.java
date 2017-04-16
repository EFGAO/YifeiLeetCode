package leetcode103;

/**
 * Created by GaoYifei on 4/12/17.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        queue.offer(root);
        boolean zig = true;
        while(!queue.isEmpty()){

            int size = queue.size();

            List<Integer> temp = new LinkedList<Integer>();
            while(size != 0){


                TreeNode node = queue.poll();
                if(zig) temp.add(node.val);
                else temp.add(0, node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                size--;
            }
            zig = zig? false : true;
            res.add(temp);
        }
        return res;
    }
}