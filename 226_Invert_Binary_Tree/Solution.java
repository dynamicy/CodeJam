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
    public TreeNode invertTree(TreeNode root) {
        if(root != null) {
            swapTree(root);
        }
        return root;
    }
    /**
     * Use a tree travsal, then swap its children
     */
    public void swapTree(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null) {
            swapTree(root.left);
        }
        if(root.right != null) {
            swapTree(root.right);
        }
    }
}
