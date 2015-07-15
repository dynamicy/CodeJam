using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_136_Single_Number
{
    public class Solution
    {
        public int SingleNumber(int[] nums)
        {
            int nNow = nums[0];
            for (int i = 1; i < nums.Length; ++i)
                nNow = nNow ^ nums[i];

            return nNow;
        }
    }
}
