using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_104_Maximum_Depth_of_Binary_Tree
{
    public class Solution
    {
        public int MaxDepth(TreeNode root)
        {
            int nLeftDepth = 0;
            int nRightDepth = 0;
            if (null == root)
                return 0;
            else if (null == root.left && null == root.right)
                return 1;
            else
            {
                nLeftDepth = MaxDepth(root.left);
                nRightDepth = MaxDepth(root.right);
                return ((nLeftDepth >= nRightDepth) ? nLeftDepth : nRightDepth) + 1;
            }
        }
    }
}
