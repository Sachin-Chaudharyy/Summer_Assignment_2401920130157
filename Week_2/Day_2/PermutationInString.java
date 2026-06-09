class Solution {
  public boolean permutation(String s1, String s2) {
    if(s1.length() > s2.length()) {
      return false;
    }
    int need[] = new int[26];
    int window[] = new int[26];
    for(int i=0; i<s1.length(); i++) {
      need[s1.charAt(i)-'a']++;
      window[s2.charAt(i)-'a']++;
    }
    int match = 0;
    for(int i=0; i<26; i++) {
      if(need[i] == window[i]) {
        match++;
      }
    }
    int left = 0;
    for(int right=s1.length(); right<s2.length(); right++) {
      if(match == 26) {
        return true;
      }
      int ridx = s2.charAt(right)-'a';
      window[ridx]++;
      if(window[ridx] == need[ridx]) {
        match++;
      } else if(window[ridx] == need[ridx]+1) {
        match--;
      }
      int lidx = s2.charAt(left)-'a';
      window[lidx]--;
      if(window[lidx] == need[lidx]) {
        match++;
      } else if(window[lidx] == need[lidx]-1) {
        match--;
      }
      left++;
    }
    return match == 26;
  }
}
