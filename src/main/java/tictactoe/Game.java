package tictactoe;

import java.util.Random;

public class Game {
    private Board board;
    private Random random;
    
    public Game(){
        initializeGame();
        
    }

    private void initializeGame() {
        this.board = new Board();
        this.board.setupBoard();

    }
}
