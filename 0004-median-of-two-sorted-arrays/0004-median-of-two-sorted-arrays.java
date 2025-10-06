class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        
        int[] mergedArray = new int[totalLength];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }
        
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        
        if (totalLength % 2 == 1) {
            return mergedArray[totalLength / 2];
        } else {
            int mid1Index = totalLength / 2 - 1;
            int mid2Index = totalLength / 2;
            
            int mid1Value = mergedArray[mid1Index];
            int mid2Value = mergedArray[mid2Index];
            
            return (double) (mid1Value + mid2Value) / 2.0;
        }
    }
}