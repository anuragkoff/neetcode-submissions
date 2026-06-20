class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int count=1;
        int max=1;

        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++) {
            if(nums[i]-nums[i-1] == 1) {
                count++;
            } else if(nums[i]-nums[i-1] == 0) {
                continue;
            } else {
                count = 1;
            }
            if(max<count) {
                max = count;
            }
        }
        return max;
    }
}
