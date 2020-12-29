package system;

import boardgame.Board;
import boardgame.Shape;

public class TicTacShape extends Shape{

	private ShapeColor color;
	private int moveCount;
	
	public TicTacShape(Board board, ShapeColor color) {
		super(board);
		this.color = color;
	}
	public ShapeColor getColor() {
		return color;
	}
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount ++;
	}
	public void decreaseMoveCount() {
		moveCount --;
	}
}