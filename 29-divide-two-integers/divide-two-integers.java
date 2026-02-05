class Solution {
    public int divide(int dividend, int divisor) {


        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = true;
        if (dividend < 0 && divisor > 0) sign = false;
        if (dividend > 0 && divisor < 0) sign = false;

        long n = Math.abs((long) dividend);
        long q = Math.abs((long) divisor);

        int ans = 0;

        while (n >= q) {
            int count = 0;

         
            while (n >= (q << (count + 1))) {
                count++;
            }

            n -= (q << count);
            ans += (1 << count);
        }

        return sign ? ans : -ans;
    }
}

