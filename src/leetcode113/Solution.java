package leetcode113;

/**
 * Created by GaoYifei on 4/16/17.
 */

import java.util.LinkedList;
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> path = new LinkedList<Integer>();
        findPath(root, sum, result, path);
        return result;
    }
    public void findPath(TreeNode root, int sum, List<List<Integer>> result, List<Integer> path){
        if(root == null) {

            return;
        }

        path.add(root.val);
        findPath(root.left, sum - root.val, result, path);
        findPath(root.right, sum - root.val, result, path);

        if(root.left == null && root.right == null){

            if(sum == root.val){
                result.add(new LinkedList<Integer>(path));

            }

        }
        path.remove(path.size() - 1);
    }
}
