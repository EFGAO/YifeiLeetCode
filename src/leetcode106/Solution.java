package leetcode106;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
    }
    public TreeNode build(int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder){
        if(postEnd < 0 || inStart > inEnd) return null;
        TreeNode newNode = new TreeNode(postorder[postEnd]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == newNode.val){
                index = i;
            }
        }
        newNode.right = build(postEnd - 1, index + 1, inEnd, inorder, postorder);
        newNode.left = build(postEnd - (inEnd - index) - 1, inStart, index - 1, inorder, postorder);
        return newNode;
    }

}