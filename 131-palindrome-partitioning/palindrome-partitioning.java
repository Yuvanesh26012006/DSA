class Solution {
    List<List<String>> ans=new ArrayList<List<String>>();
    public boolean isPalindromic(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public void backTrack(int ind,List<String> ds,String s){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindromic(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                backTrack(i+1,ds,s);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        backTrack(0,new ArrayList<>(),s);
        return ans;
    }
}