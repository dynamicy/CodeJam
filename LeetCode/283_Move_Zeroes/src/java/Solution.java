package java;

class Solution {
    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length <= 0) {
            return;
        }

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}