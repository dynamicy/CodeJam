public class Solution {
    public int maxDepth(TreeNode root) {
        /**
         * If it's empty
         */
        if(root == null) {
            return 0;
        }

        /**
         * Find the maximum depth of left and right
         */
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);

        if(maxDepthLeft > maxDepthRight) {
            return maxDepthLeft + 1;
        }
        else {
            return maxDepthRight + 1;
        }
    }
}
