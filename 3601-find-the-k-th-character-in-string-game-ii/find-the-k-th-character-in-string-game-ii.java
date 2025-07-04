class Solution {
    
    char next(char c){
        int next = (c-'a'+1)%26;
        return (char) (next+'a');
    }

    
    int getLowerPower2(long num){
        long p = 1;
        int x = 0;
        while(p*2 < num){
            p *= 2;;
            x++;
        }
        return x;
    }
    char solve(long k,int[] op){
        
        if(k == 1)     return 'a';

       
        int l = getLowerPower2(k);

        long p = ((long) 1<<l);
        
        if(op[l]==0)
            return solve(k-p,op);
        
        return next(solve(k-p,op));
    }
    public char kthCharacter(long k, int[] operations) {
        return solve(k,operations);
    }
}