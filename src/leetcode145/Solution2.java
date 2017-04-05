package leetcode145;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by GaoYifei on 4/4/17.
 */
public class Solution2 {
    // Iterative solution which reverse the process the preorder
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                result.addFirst(current.val);  // Reverse the process of preorder
                current = current.right;             // Reverse the process of preorder
            } else {
                TreeNode node = stack.pop();
                current = node.left;           // Reverse the process of preorder
            }
        }
        return result;
    }
}