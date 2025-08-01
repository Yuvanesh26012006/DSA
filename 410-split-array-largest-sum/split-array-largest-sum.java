class Solution {
    public static int MinimizedSum(int []arr,int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum=sum+arr[i];
            }
            else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
    public static int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            ans=MinimizedSum(nums,mid);
            if(ans>k){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}