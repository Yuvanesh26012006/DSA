class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> s1=new HashSet<>();
        for(int i:nums){
            s1.add(i);
        }
        for(int i:nums){
            if(s1.contains(original)){
             original=original*2;
            }
        
        }
        return original;
    }
}