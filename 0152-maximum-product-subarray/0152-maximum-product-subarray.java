class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentMax = nums[0];
        int currentMin = nums[0];
        int overallMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            int tempMax = currentMax;

            currentMax = Math.max(nums[i], Math.max(nums[i] * tempMax, nums[i] * currentMin));

            currentMin = Math.min(nums[i], Math.min(nums[i] * tempMax, nums[i] * currentMin));
            
            overallMax = Math.max(overallMax, currentMax);
        }

        return overallMax;
    }
}