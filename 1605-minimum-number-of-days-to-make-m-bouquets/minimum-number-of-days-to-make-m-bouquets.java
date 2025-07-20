
class Solution {
    public static boolean possible(int arr[],int currentDay,int m,int k){
        int count=0;
        int bcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=currentDay){
                count++;
            }
            else{
                bcount+=(count/k);
                count=0;
            }
        }
        bcount+=(count/k);
        return bcount>=m;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        for(int i:bloomDay){
            if(i<min){
                min=i;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:bloomDay){
            if(i>max){
                max=i;
            }
        }
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}