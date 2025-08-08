class Solution {
    public static int FindOnes(int mat[][],int row){
        int count=0;
        for(int i=0;i<mat[row].length;i++){
            if(mat[row][i]==1){
                count++;
            }
        }
        return count;
    }
    public static int[] rowAndMaximumOnes(int[][] mat) {
    int maxones=-1;
    int row=-1;
        for(int i=0;i<mat.length;i++){
            int count=FindOnes(mat,i);
            if(count>maxones){
                maxones=count;
                row=i;
            }
            if(count==maxones && i<row){
                maxones=count;
                row=i;
            }
        }
        return new int[]{row,maxones};
    }
}