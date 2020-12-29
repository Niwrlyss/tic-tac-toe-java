package boardgame;

public abstract class Shape {

	protected Position position;
	private Board board;

	//the piece inicialize = 0
	//pass just the board
	public Shape(Board board) {
		this.board = board;
		position = null;
	}
	//get of Board is protected now
	//because can be acessed by others classes in package
	protected Board getBoard() {
		return board;
	}
}