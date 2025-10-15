class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        
        // Step 1: Preprocess the longest increasing subarray lengths
        int[] inc = new int[n];
        inc[n - 1] = 1;  // The last element is always a strictly increasing subarray of length 1.
        
        // Fill in the inc array
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                inc[i] = inc[i + 1] + 1;
            } else {
                inc[i] = 1;
            }
        }
        
        // Step 2: Use binary search to find the maximum k
        int left = 1, right = n / 2, result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if two adjacent strictly increasing subarrays of length mid exist
            if (canFindAdjacentSubarrays(inc, mid)) {
                result = mid;  // Update the result if it's possible to find two subarrays of length mid
                left = mid + 1; // Try to find a larger k
            } else {
                right = mid - 1; // Try to find a smaller k
            }
        }
        
        return result;        
    }
    private boolean canFindAdjacentSubarrays(int[] inc, int k) {
        for (int i = 0; i < inc.length - 2 * k + 1; i++) {
            // Check if two adjacent subarrays of length k exist
            if (inc[i] >= k && inc[i + k] >= k) {
                return true;
            }
        }
        return false;
    }
}