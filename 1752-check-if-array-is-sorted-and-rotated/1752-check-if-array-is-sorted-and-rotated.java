class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breakCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breakCount++;
            }
            
            if (breakCount > 1) {
                return false;
            }
        }

        return true;
    }
}