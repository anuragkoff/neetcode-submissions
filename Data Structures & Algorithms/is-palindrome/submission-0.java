class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0, j=result.length()-1;
        System.out.print(result);

        while(j>i) {
            if(result.charAt(i)!=result.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}
