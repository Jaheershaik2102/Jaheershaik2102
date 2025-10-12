class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentScore = 0;

        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }

        int maxScore = currentScore;
        
        for (int i = 1; i <= k; i++) {
            int leftIndexToRemove = k - i;
            
            int rightIndexToAdd = n - i;

            currentScore = currentScore - cardPoints[leftIndexToRemove] + cardPoints[rightIndexToAdd];

            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}