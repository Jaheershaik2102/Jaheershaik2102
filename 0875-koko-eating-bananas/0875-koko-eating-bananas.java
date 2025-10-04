import java.util.Arrays;

class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int min_k = high; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                min_k = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return min_k;
    }
    
    private long calculateTotalHours(int[] piles, int k) {
        long totalH = 0;
        for (int pile : piles) {
            totalH += (long)(pile + k - 1) / k; 
        }
        return totalH;
    }
}