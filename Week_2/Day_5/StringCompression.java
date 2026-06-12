class Solution {
    public int compress(char[] chars) {
        int read = 0, write = 0;
        while(read < chars.length){
            int i = read;
            while(i < chars.length && chars[i] == chars[read]){
                i++;
            }
            int count = i-read;
            chars[write++] = chars[read];
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[write++] = c;
                }
            }
            read = i;
        }
        return write;
    }
}
