class Solution {
     List<List<Integer>> ans=new ArrayList<>();
     public void backTrack(int ind,int target,int arr[],List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            backTrack(i+1,target-arr[i],arr,ds);
            ds.remove(ds.size()-1);
        }
     }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(0,target,candidates,new ArrayList<>());
        return ans;
    }
}