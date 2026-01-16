class Solution {
    public boolean dfs(int i,int j,char[][] board,String s, int ind){
        if(ind==s.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=s.charAt(ind)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='$';
        boolean down=dfs(i+1,j,board,s,ind+1);
        boolean up=dfs(i-1,j,board,s,ind+1);
        boolean right=dfs(i,j+1,board,s,ind+1);
        boolean left=dfs(i,j-1,board,s,ind+1);
        board[i][j]=temp;
        return down || up || right || left;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
}