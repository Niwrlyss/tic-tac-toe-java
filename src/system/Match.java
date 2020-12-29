package system;

import boardgame.Board;
import shapes.x.o.Cross;

public class Match {
	// create a board because
	// hash have a board to play
	private Board board;

	// size of game : the match(here)
	public Match() {
		board = new Board(3, 3);
		initialize();
	}

	public TicTacShape[][] getShapes() {
		TicTacShape[][] mat = new TicTacShape[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (TicTacShape) board.shape(i, j);
			}
		}
		return mat;
	}
	// tic-tac toe positions start with null
	// 'm using a method to test place shapes
	public void placeNewShape(char column, int row, TicTacShape shape) {
		board.placeShape(shape, new TicTacPosition(column, row).toPosition());
	}

	public void initialize() {
		//now I don't need chose position of matrix (1..2..)
		//I can use my own positions because conversation
		placeNewShape('b', 3,new Cross(board, ShapeColor.GREEN));
		placeNewShape('b', 2,new Cross(board, ShapeColor.GREEN));
		placeNewShape('b', 1,new Cross(board, ShapeColor.GREEN));
	}
}