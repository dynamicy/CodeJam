using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_237_Delete_Node_in_a_Linked_List
{
    public class Solution
    {
        public void DeleteNode(ListNode node)
        {
            if (null == node.next)
            {
            }
            else
            {
                node.val = node.next.val;
                node.next = node.next.next;
            }
        }
    }
}
