public class Solution {
    public boolean isPowerOfTwo(int n) {
        /*
         * n>0, it's required
         * e.g. 8=1000, 7=0111
         * if 8 is power of 2, 1000&0111=0
         */
        return ((n & (n-1)) == 0) && (n > 0)? true:false;
    }
}
