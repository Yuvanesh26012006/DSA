class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2L * n + 1) / 6;
        long actualSum = 0;
        long actualSquareSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = grid[i][j];
                actualSum += val;
                actualSquareSum += (long) val * val;
            }
        }
        long diffSum = actualSum - expectedSum;                  
        long diffSquareSum = actualSquareSum - expectedSquareSum; 
        long sumRM = diffSquareSum / diffSum; 
        int repeated = (int) ((diffSum + sumRM) / 2);
        int missing = (int) (sumRM - repeated);
        return new int[]{repeated, missing};
    }
}
