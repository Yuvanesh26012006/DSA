class Solution {
    Boolean dp[];
    public boolean check(int ind,String s,Set<String> word){
        if(ind==s.length()){
            return true;
        }
        if(dp[ind]!=null){
            return dp[ind];
        }
        for(int i=ind+1;i<=s.length();i++){
            String sub=s.substring(ind,i);
            if(word.contains(sub)){
                if(check(i,s,word)){
                    return dp[ind]=true;
                }
            }
        }
        return dp[ind]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
            dp=new Boolean[s.length()];
            Set<String> set=new HashSet<>(wordDict);
            return check(0,s,set);
        
    }
}