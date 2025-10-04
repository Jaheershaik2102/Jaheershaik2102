class Solution {
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> numMap = new java.util.HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(currentNum, i);
        }
        
        return new int[]{};
    }
}