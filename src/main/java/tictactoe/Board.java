package tictactoe;


import java.util.List;

public class Board {
    private List<Cell> emptyCells;
    private Player[][] board;

    public Board() {
        this.board = new Player[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    }

    public void setupBoard() {
        for(int i = 0; i < Constants.BOARD_SIZE; i++){
            for(int j = 0; j < Constants.BOARD_SIZE; j++){
                board[i][j] = Player.NONE;
            }
        }
    }

    public boolean isRunning(){

        if(isWinning(Player.COMPUTER)) {
            return false;
        }

        if (isWinning(Player.USER)) {
            return false;
        }

        return true;

    }

    private boolean isWinning(Player player) {

        if (checkDiagnols(player)) return true;

        for(int i = 0 ; i < Constants.BOARD_SIZE; i++){
            // Check rows
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }

            // Check col
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                return true;
            }
        }

        return false;
    }

    private boolean checkDiagnols(Player player) {
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }


    public Player[][] getBoard() {
        return board;
    }

    public void setBoard(Player[][] board) {
        this.board = board;
    }
}
