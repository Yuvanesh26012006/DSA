class Solution {
    public static int FirstOccurence(int[]nums,int target){
        int first=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;

    }
    public static int LastOccurence(int[]nums,int target){
        int Last=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                Last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return Last;

    }
    public static int[] searchRange(int[] nums, int target) {
        int first=FirstOccurence(nums,target);
        int Last=LastOccurence(nums,target);
        return new int[]{first,Last};
    }
}