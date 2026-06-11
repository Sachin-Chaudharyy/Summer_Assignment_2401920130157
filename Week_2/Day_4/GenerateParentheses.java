class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, n, new StringBuilder(), 0, 0);
        return res;
    }
    public void generate(List<String> res, int n, StringBuilder sb, int open, int closed) {
        if (sb.length() == 2 * n) {
            res.add(sb.toString());
            return;
        }
        if (open < n) {
            generate(res, n, sb.append('('), open + 1, closed);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (open > closed) {
            generate(res, n, sb.append(')'), open, closed + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
