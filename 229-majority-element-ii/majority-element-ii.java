class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int element1=-1;
        int count1=0;
        int element2=-1;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=element2){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }
            else if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
            

        }
        int cnt1=0;
        int cnt2=0;
        for(int i:nums){
            if(i==element1){
                cnt1++;
            }
        }
        for(int i:nums){
            if(i==element2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3 && !ans.contains(element1)){
            ans.add(element1);
        }
        if(cnt2>nums.length/3 && !ans.contains(element2)){
            ans.add(element2);
        }
        return ans;
    }

}