package tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void setupBoard() {
        Board board = new Board();
        board.setupBoard();

        assertNotNull(board.getBoard());

    }
}