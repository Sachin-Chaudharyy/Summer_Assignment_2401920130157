class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        for (int right = 0; right < chars.length; right++) {
            if (chars[right] == ' ') {
                reverse(chars, left, right - 1);
                left = right + 1;
            }
        }
        
        reverse(chars, left, chars.length - 1);
        return new String(chars);
    }
    
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
