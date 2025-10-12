class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = nums[0];
        int currMax = 0;
        int minSoFar = nums[0];
        int currMin = 0;

        for (int n : nums) {
            totalSum += n;
            currMax = Math.max(n, currMax + n);
            maxSoFar = Math.max(maxSoFar, currMax);
            currMin = Math.min(n, currMin + n);
            minSoFar = Math.min(minSoFar, currMin);
        }

        if (maxSoFar < 0) {
            return maxSoFar;
        }

        return Math.max(maxSoFar, totalSum - minSoFar);
    }
}