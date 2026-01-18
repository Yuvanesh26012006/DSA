class Solution {
    List<List<String>> ans = new ArrayList<List<String>>();

    public boolean isSafe(int row, int col, char[][] board, int n) {
        int dr = row;
        int dc = col;
        while (dr >= 0 && dc >= 0) {
            if (board[dr][dc] == 'Q') {
                return false;
            }
            dr--;
            dc--;
        }
        dr = row;
        dc = col;
        while (dc >= 0) {
            if (board[dr][dc] == 'Q') {
                return false;
            }
            dc--;
        }
        dr = row;
        dc = col;
        while (dr < n && dc >= 0) {
            if (board[dr][dc] == 'Q') {
                return false;
            }
            dr++;
            dc--;
        }
        return true;
    }

    public void solve(int col, char[][] board, int n) {

        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, board, n);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, board, n);
        return ans;

    }
}