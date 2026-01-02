class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:nums){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        int key=nums.length/2;
        for(int i:h1.keySet()){
            if(h1.get(i)==key){
                return i;
            }
        }
        return -1;
    }
}