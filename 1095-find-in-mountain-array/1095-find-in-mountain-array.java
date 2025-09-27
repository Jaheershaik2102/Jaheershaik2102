class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index
        int peakIndex = findPeakIndex(mountainArr, n);
        
        // Step 2: Search in the increasing part (left side of peak)
        int leftResult = binarySearchIncreasing(mountainArr, target, 0, peakIndex);
        if (leftResult != -1) {
            return leftResult;
        }
        
        // Step 3: Search in the decreasing part (right side of peak)
        int rightResult = binarySearchDecreasing(mountainArr, target, peakIndex + 1, n - 1);
        return rightResult;
    }
    
    private int findPeakIndex(MountainArray mountainArr, int n) {
        int left = 0, right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);
            
            if (midVal < nextVal) {
                // Peak is on the right side
                left = mid + 1;
            } else {
                // Peak is on the left side
                right = mid;
            }
        }
        
        return left;
    }
    
    private int binarySearchIncreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    private int binarySearchDecreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            
            if (midVal == target) {
                return mid;
            } else if (midVal > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}