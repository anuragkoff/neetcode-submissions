class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i=0; i<ans.length; i++) {
            int a = i-n >= 0? i-n : i;

            ans[i] = nums[a];
        }

        return ans;
    }
}