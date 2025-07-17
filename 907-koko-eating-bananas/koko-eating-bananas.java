class Solution {
    public static int getTime(int[]arr,int speed){
        double ans=0;
        for(int i:arr){
            ans=ans+Math.ceil((double)i/speed);
        }
        return (int)ans;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=-1;
        for(int i:piles){
            if(i>max){
                max=i;
            }
        }
        int low=1;
        int high=max;
        int ans=-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqTime=getTime(piles,mid);
            if(reqTime<=h){
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