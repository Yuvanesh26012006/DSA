class Solution {
    public void backTrack(int n,StringBuilder sb,List<String> ans){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }
        if(sb.length()==0 || sb.charAt(sb.length()-1)=='1'){
            sb.append('0');
            backTrack(n,sb,ans);
            sb.deleteCharAt(sb.length()-1);

            sb.append('1');
            backTrack(n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        else{
             sb.append('1');
            backTrack(n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
       
    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
         backTrack(n,new StringBuilder(),ans);
         return ans;
        
    }
}