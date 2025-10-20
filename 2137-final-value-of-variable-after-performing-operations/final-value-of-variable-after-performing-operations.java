class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String s:operations){
            if(s.equals("--X" )|| s.equals("X--")){
                ans=ans-1;
            }
            else{
                ans=ans+1;
            }
        }
        return ans;
    }
}