class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> h1=new HashMap<>();
        h1.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(h1.containsKey(prefixsum-k)){
                count+=h1.get(prefixsum-k);
            }
            h1.put(prefixsum,h1.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}