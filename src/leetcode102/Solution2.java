package leetcode102;

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
public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            while(size != 0){
                temp.add(queue.peek().val);

                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                size--;
            }
            res.add(temp);
        }
        return res;
    }
}