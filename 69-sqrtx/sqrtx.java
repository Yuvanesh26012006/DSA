class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if((int)mid*mid<=x){
                ans=(int)mid;
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return ans;

    }
}