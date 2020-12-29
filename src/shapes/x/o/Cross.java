package shapes.x.o;

import boardgame.Board;
import system.TicTacShape;
import system.ShapeColor;

public class Cross extends TicTacShape{

	public Cross(Board board, ShapeColor color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "X";
	}
}
