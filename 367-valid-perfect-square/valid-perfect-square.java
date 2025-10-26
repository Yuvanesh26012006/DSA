class Solution {
    public boolean isPerfectSquare(int num) {
        // Handle the edge case of num = 1
        if (num == 1) {
            return true;
        }

        // Initialize the binary search boundaries
        long l = 1;
        long r = num;
 
        while (l <= r) {
            // Calculate mid
            long m = l + (r - l) / 2; // Avoid (l+r)/2 for large l,r
            long mSquared = m * m; // Use long to prevent overflow
 
            if (num == mSquared) {
                // Found the perfect square
                return true;
            } else if (mSquared < num) {
                // The root must be in the right half
                l = m + 1;
            } else {
                // The root must be in the left half
                r = m - 1;
            }
        }
 
        // Loop finished, no perfect square found
        return false;
    }
}