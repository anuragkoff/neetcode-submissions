class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        // System.out.print(str);

        while(end>start) {
            while(!Character.isLetterOrDigit(s.charAt(start)) && start<end) {
                start++;
            }
            while(!Character.isLetterOrDigit(s.charAt(end)) && start<end) {
                end--;
            }
            if(start>end || (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
