class Solution {
    
    public static void generate(int n,int ob,int cb, List<String> ans,String s){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(ob<n){
            generate(n,ob+1,cb,ans,s+"(");
        }
        if(cb<ob){
            generate(n,ob,cb+1,ans,s+")");
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<String>();
        generate(n,0,0,ans,"");
        return ans;
    }
}