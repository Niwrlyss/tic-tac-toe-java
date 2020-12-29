package system;

import boardgame.Position;
import boardgame.Board;
import shapes.x.o.Cross;

public class Match {
	//create a board because
	//hash have a board to play
	private Board board;

	//size of game : the match(here)
	public Match() {
		board = new Board(3, 3);
		initialize();	
	}

	public TicTacShape[][] getShapes() {
		TicTacShape[][] mat = new TicTacShape[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (TicTacShape)board.shape(i, j);
			}
		}
		return mat;
	}
	
	public void initialize() {
		board.placeShape(new Cross(board, ShapeColor.GREEN), new Position(0,2));
		board.placeShape(new Cross(board, ShapeColor.GREEN), new Position(1,2));
		board.placeShape(new Cross(board, ShapeColor.GREEN), new Position(2,2));
	}
}