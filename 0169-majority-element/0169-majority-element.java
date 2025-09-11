class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int ele = nums[0];

        
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                ele = nums[i];
                count = 1;
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        
        
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                count1++;
            }
        }

        if (count1 > n / 2) {
            return ele;
        }

        return -1; 
    }
}
