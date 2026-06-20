class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        int product = 1;
        int zero = 0;

        for(int num: nums) {
            if(num!=0) {
                product*=num;
            } else {
                zero++;
            }
        }

        if (zero>1) {
            return new int[len];
        }

        for(int i=0; i<len; i++) {
            if (nums[i]!=0 && zero>0){
                arr[i] = 0;
            } else {
                if(nums[i]==0) {
                    arr[i] = product;
                } else{
                    arr[i] = product/nums[i];
                }
            }
        }

        return arr;
    }
}  
