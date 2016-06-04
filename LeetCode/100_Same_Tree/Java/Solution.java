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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if(p != null & q != null) {
            if(p.val == q.val) {
		// if they got the same value, and we have to check the subtree
                boolean leftCheck = isSameTree(p.left, q.left);
                boolean rightCheck = isSameTree(p.right, q.right);
                return leftCheck && rightCheck;  
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
