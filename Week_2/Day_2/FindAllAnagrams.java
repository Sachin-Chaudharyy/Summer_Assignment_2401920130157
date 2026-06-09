class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()){
            return list;
        }
        int need[] = new int[26];
        int window[] = new int[26];
        for(int i=0; i<p.length(); i++){
            need[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;
        }
        int match = 0;
        for(int i=0; i<26; i++){
            if(need[i] == window[i]){
                match++;
            }
        }
        if(match == 26){
            list.add(0);
        }
        int left = 0;
        for(int right=p.length(); right<s.length(); right++){
            int ridx = s.charAt(right)-'a';
            window[ridx]++;
            if(window[ridx] == need[ridx]){
                match++;
            }else if(window[ridx] == need[ridx]+1){
                match--;
            }
            int lidx = s.charAt(left)-'a';
            window[lidx]--;
            if(window[lidx] == need[lidx]){
                match++;
            }else if(window[lidx] == need[lidx]-1){
                match--;
            }
            left++;
            if(match == 26){
                list.add(left);
            }
        }
        return list;
    }
}
