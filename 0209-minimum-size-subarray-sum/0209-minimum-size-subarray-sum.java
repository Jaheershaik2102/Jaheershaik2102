class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int r = 0; r < nums.length; r++) {
            currentSum += nums[r];

            while (currentSum >= target) {
                minLen = Math.min(minLen, r - l + 1);

                currentSum -= nums[l];
                l++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}