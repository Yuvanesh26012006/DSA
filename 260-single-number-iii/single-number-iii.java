class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }

        // Get rightmost set bit
        int diffBit = xor & (-xor);

        int num1 = 0, num2 = 0;
        for (int i : nums) {
            if ((i & diffBit) != 0) {
                num1 ^= i;
            } else {
                num2 ^= i;
            }
        }

        return new int[]{num1, num2};
    }
}