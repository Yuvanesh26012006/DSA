class Solution {
	public static int getDays(int i,int arr[]) {
		int days=1;
		int load=0;
		for(int j:arr) {
			if(load+j>i) {
				days=days+1;
				load=j;
			}
			else {
				load+=j;
			}
		}
		return days;
	}
    public static int shipWithinDays(int[] weights, int days) {
	       int max=Integer.MIN_VALUE;
	       for(int i:weights) {
	    	   if(i>max) {
	    		   max=i;
	    	   }
	       }
	       int sum=0;
	       for(int i:weights) {
	    	   sum+=i;
	       }
	       int low=max;
	       int high=sum;
	       int ans=-1;
	       while(low<=high) {
	    	   int mid=low+(high-low)/2;
	    	   int reqDays=getDays(mid,weights);
	    	   if(reqDays<=days) {
	    		   ans=mid;
	    		   high=mid-1;
	    	   }
	    	   else {
	    		   low=mid+1;
	    	   }
	       }    
           return ans;    
    }
}