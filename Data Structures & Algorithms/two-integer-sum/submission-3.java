class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            int r = target-nums[i];

            if(sum.containsKey(r)) {
                return new int[]{sum.get(r), i};
            }

            sum.put(nums[i], i);
        }
        return new int[0];
    }
}
