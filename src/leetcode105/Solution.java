package leetcode105;

/**
 * Created by GaoYifei on 4/13/17.
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, 0, inorder.length - 1, preorder, inorder);
    }
    public TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart >= preorder.length || inStart > inEnd){
            return null;
        }
        TreeNode newNode = new TreeNode(preorder[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++ ){
            if(inorder[i] == newNode.val){
                index = i;
            }
        }
        newNode.left = build(preStart + 1, inStart, index - 1, preorder, inorder);
        newNode.right = build(preStart + (index - inStart) + 1, index + 1, inEnd, preorder, inorder);
        return newNode;
    }

}