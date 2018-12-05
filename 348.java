class TicTacToe {
    int n;
    int[] rows;
    int[] cols;
    int diag;
    int antiDiag;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
        diag = 0;
        antiDiag = 0;

    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int addNum = player == 1 ? 1 : -1;
        rows[row] += addNum;
        cols[col] += addNum;
        if(row == col) diag += addNum;
        if(row + col + 1 == n) antiDiag += addNum;

        if(Math.abs(rows[row]) == n || Math.abs(cols[col]) == n ||
            Math.abs(diag) == n || Math.abs(antiDiag) == n)
            return player;
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */