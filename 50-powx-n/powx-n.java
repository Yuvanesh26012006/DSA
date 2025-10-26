class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
    
        if (n == Integer.MIN_VALUE) {
            return myPow(1 / x, -(n + 1)) * (1 / x);
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double result = 1.0;
        double current = x;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= current;
            }

            current *= current;
            n = n >> 1;
        }
        
        return result;
    }
}