public class Solution {
    public int titleToNumber(String str) {
        int result = 0;
        int count = str.length();
        for(char item : str.toCharArray()) {
            result += (item-64) * Math.pow(26, --count);
        }
        return result;  
    }
}
