class Solution {

    private long calculateTotalHours(int[] piles, int k) {
        long totalH = 0;
        for (int pile : piles) {
            totalH += (long)(pile + k - 1) / k;
        }
        return totalH;
    }

    private int findMax(int[] piles) {
        int maxi = 0;
        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }
        return maxi;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = findMax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalH = calculateTotalHours(piles, mid);
            
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}