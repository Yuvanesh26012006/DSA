class Solution {
    public static int Divisor(int[] arr,int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/mid);
        }
        return (int)sum;

    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int div=Divisor(nums,mid);
            if(div<=threshold){
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