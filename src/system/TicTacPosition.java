package system;

import boardgame.Position;

public class TicTacPosition {

	private char column;
	private int row;

	public TicTacPosition(char column, int row) {
		if(column < 'a' && column >'c' || row < 1 && row>3 ) {
			throw new TicTacException("Error instantiating TicTacPosition. Valid values are from a1 to c3.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	//method converts shape position to matrix position
	protected Position toPosition() {
		return new Position(3-row, column - 'a');
	}
	//and matrix to shape position(invert method)
	protected static TicTacPosition fromPosition(Position position) {
		return new TicTacPosition((char)('a'+position.getColumn()), position.getRow()-3);
	}
	
	@Override
	public String toString () {
		return "" + column + row;
	}
}