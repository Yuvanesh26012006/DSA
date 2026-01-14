class Solution {
    List<List<Integer>>  ans=new ArrayList<List<Integer>> ();
    public void picknotPick(int ind, List<Integer> ds,int arr[]){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i> ind && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            picknotPick(i+1,ds,arr);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
             Arrays.sort(nums);
             picknotPick(0,new ArrayList<>(),nums);
             return ans;
    }
}