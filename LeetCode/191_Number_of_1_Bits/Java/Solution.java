public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        String temp = Integer.toBinaryString(n);
        for(char str : temp.toCharArray()) {
            if(str == '1') {
                count++;
            }
        }
        return count;
    }
}
