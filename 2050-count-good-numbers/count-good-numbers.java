class Solution {
    static final long mod=1000000007;
   public static long power(long x, long n) {
        if (n == 0) return 1;

        long half = power(x, n / 2);

        half = half % mod; 

        if (n % 2 == 0) {
            return (half * half) % mod;
        } else {
            return ((half * half) % mod * (x % mod)) % mod;
        }
    }
    public static int countGoodNumbers(long n) {
        long oddcount=n/2;
        long evencount=n-oddcount;
        long p1=power(4,oddcount);
        long p2=power(5,evencount);
        return (int)((p1*p2)%mod);
    }
}