class Solution {
    public void backTrack(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        backTrack(ind+1,nums,ds,ans);
        ds.remove(ds.size()-1);
        backTrack(ind+1,nums,ds,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<List<Integer>>();
       backTrack(0,nums,new ArrayList<Integer>(),ans); 
       return ans;
    }
}