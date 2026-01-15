class Solution {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public void backTrack(int start,int n,int k,List<Integer> ds){
        if(k==ds.size()){
            if(n==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            return;
        }
        for(int i=start;i<=9;i++){
            if (n - i < 0) break; 
            ds.add(i);
            backTrack(i+1,n-i,k,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(1,n,k,new ArrayList<>());
        return ans;
    }
}