class Solution {
    public String decodeString(String s) {
        Stack<Integer> sti = new Stack<>();
        Stack<StringBuilder> sts = new Stack<>();

        StringBuilder currentStr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                sti.push(num);
                sts.push(currentStr);
                num = 0;
                currentStr = new StringBuilder();
            } else if (c == ']') {
                int n = sti.pop();
                StringBuilder previous = sts.pop();
                for (int i=0; i<n ; i++) {
                    previous.append(currentStr);
                }
                currentStr = previous;
            } else {
                currentStr.append(c);
            }
        }
        return currentStr.toString();
    }
}
