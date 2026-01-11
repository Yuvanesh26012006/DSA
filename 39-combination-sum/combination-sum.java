class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    	public  void backTrack(int ind,List<Integer> ds,int k,int arr[]) {
		if(ind==arr.length) {
			if(k==0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		
		if(arr[ind]<=k) {
			ds.add(arr[ind]);
			backTrack(ind,ds,k-arr[ind],arr);
			ds.remove(ds.size()-1);
		}
		
		backTrack(ind+1,ds,k,arr);
		
	}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(0,new ArrayList<>(),target,candidates);
        return ans;
    }
}