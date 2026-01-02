class Solution {
    public static String check(String s,int n){
        int i;
        for(i=0;i<n-1;i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                return "";
            }
        }
      
        return s;
    }
    public static List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            if(sb.length()<n){
                  
                while(sb.length()<n){
                    
                    
                    sb.insert(0,'0');
                }
               
               
            }
             else{
                     
            }
            String s=sb.toString();
            String ans=check(s,n);
            if(!ans.equals("")){
                l.add(ans);
            }
            
        }      
        return l;  
    }
}