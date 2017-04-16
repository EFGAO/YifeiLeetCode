package leetcode102;

/**
 * Created by GaoYifei on 4/12/17.
 */
// Solution By using list

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> order = new ArrayList<List<Integer>>();
        List<Integer> intList = new  ArrayList<Integer>();
        List<TreeNode> nodeList = new  ArrayList<TreeNode>();
        List<TreeNode> tempList = new  ArrayList<TreeNode>();

        if(root == null){

            return order;
        }
        tempList.add(root);
        intList.add(root.val);
        order.add(intList);
        intList = new ArrayList<Integer>();
        while(!tempList.isEmpty()){
            nodeList.clear();
            // System.out.println("一次循环");
            for(TreeNode t: tempList){
                // System.out.println(t.val);
                if(t != null){
                    if(t.left != null){
                        //System.out.println(t.val + "left is " + t.left.val);
                        intList.add(t.left.val);
                        // System.out.println(intList.get(0));
                        nodeList.add(t.left);
                    }
                    if(t.right != null){
                        // System.out.println(t.val + "right is " + t.right.val);
                        intList.add(t.right.val);
                        nodeList.add(t.right);
                    }


                }

            }

            if(!intList.isEmpty())
                order.add(intList);
            intList = new  ArrayList<Integer>();
            tempList.clear();
            tempList.addAll(nodeList);

        }
        return order;


    }
}