class Solution {
    public int majorityElement(int[] nums) {
        int key=nums.length/2;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            int ele=nums[i];
            for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==ele){
                        count++;
                    }
            }
            if(count>key){
                return ele;
            }
        }
        return -1;
    }
}