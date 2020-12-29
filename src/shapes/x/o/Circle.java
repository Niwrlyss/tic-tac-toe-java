package shapes.x.o;

import boardgame.Board;
import system.TicTacShape;
import system.ShapeColor;

//Circle is a type of Shape,so is a subclass of Shape
public class Circle extends TicTacShape{

	public Circle(Board board, ShapeColor color) {
		super(board, color);
	}
	//I need convert Circle for String
	//O is shape on the board
	@Override
	public String toString() {
		return "O";
	}
}
