class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length(), tl = t.length();
        if(sl != tl) {
            return false;
        }

        int[] flag = new int[26];

        for(int i = 0; i<sl; i++) {
            flag[s.charAt(i) - 'a']++;
            flag[t.charAt(i) - 'a']--;
        }

        for(int n: flag) {
            if (n!=0) {
                return false;
            }
        }

        return true;
        
    }
}
