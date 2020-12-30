package system;

import boardgame.Board;
import boardgame.Position;
import boardgame.Shape;
import shapes.x.o.Circle;
import shapes.x.o.Cross;

public class Match {
	// create a board because
	// hash have a board to play
	private Board board;
	private int turn;
	private ShapeColor currentPlayer;

	// size of game : the match(here)
	public Match() {
		board = new Board(3, 3);
		turn = 1;
		currentPlayer = ShapeColor.GREEN;
	}
	
	public int getTurn() {
		return turn;
	}
	public ShapeColor getCurrentPlayer() {
		return currentPlayer;
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
	//take a converted position and create a shape, X or O depending
	//of turn on target position(chosed by user)
	public TicTacShape placingShapes(TicTacPosition targetPosition) {
		Position target = targetPosition.toPosition();
		Shape s;
		if (turn %2 == 0) {
			s = new Circle(board, ShapeColor.BLUE);
			//remove increase turn here because it has
			//to be in method nextTurn
		} else {
			s = new Cross(board, ShapeColor.GREEN);
		}
		board.placeShape(s, target);
		//before return shape, next turn
		nextTurn();
		return (TicTacShape)s;
	}	
	
	private void nextTurn() {
		turn++;
		//if current player is green change to blue etc
		currentPlayer = (currentPlayer == ShapeColor.GREEN) ? ShapeColor.BLUE : ShapeColor.GREEN;
	}
}