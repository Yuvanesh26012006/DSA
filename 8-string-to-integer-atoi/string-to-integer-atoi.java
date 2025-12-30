class Solution {
    public static int skipWhiteSpace(String s,int i){
        if(i>=s.length() || s.charAt(i)!=' '){
            return checkSign(s,i);
        }
        return skipWhiteSpace(s,i+1);
    }
    public static int checkSign(String s,int i){
        int sign=1;
        if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        
        return processDigits(s, i, 0, sign);
    }
    public static int processDigits(String s, int i, long num, int sign){
        if(i>=s.length()){
            return clamp(num*sign);
        }
        char res=s.charAt(i);
        if(res<'0' || res>'9'){
            return clamp(num*sign);
        }
       long newNum=num*10+(res-'0');
        
        if(sign ==1 && newNum> Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(sign ==-1 && -newNum<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return processDigits(s, i + 1, newNum, sign);
    }
    public static int clamp(long val){
        if(val> Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(val<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)val;
    }
    public static int myAtoi(String s) {
        int ans=skipWhiteSpace(s,0);
        return ans;
    }
}