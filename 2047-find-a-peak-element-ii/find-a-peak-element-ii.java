class Solution {
    public static int FindMaxElementRow(int[][]mat,int n,int m,int col){
        int maxRow=-1;
        int maxElement=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>maxElement){
                maxElement=mat[i][col];
                maxRow=i;
            }
        }
        return maxRow;

    }
    public static int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=FindMaxElementRow(mat,n,m,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}