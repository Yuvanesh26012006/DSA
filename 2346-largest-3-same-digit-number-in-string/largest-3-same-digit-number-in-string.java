class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        for(int i=0;i<=num.length()-3;i++){
             if(check(num.substring(i,i+3))){
                    int n=Integer.parseInt(num.substring(i,i+3));
                    max=Math.max(n,max);
             }
        }
        String ans=String.valueOf(max);
        return max==-1?"":String.format("%03d", max);



    }
    private boolean check(String s){
          if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2)){
            return true;
          }
          return false;
    }
}