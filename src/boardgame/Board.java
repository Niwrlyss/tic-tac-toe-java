package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Shape[][] shapes;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		shapes = new Shape[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// return matrix in row/column x,x
	public Shape shape(int row, int column) {
		return shapes[row][column];
	}

	// return shape by position
	public Shape shape(Position position) {
		return shapes[position.getRow()][position.getColumn()];
	}

	// to place shape I need a Shape and a Position
	public void placeShape(Shape shape, Position position) {
		// I need acess the matrix(shapes)by position and
		// make it receive the local shape
		shapes[position.getRow()][position.getColumn()] = shape;
		// the shape is not null now, it's on this position
		shape.position = position;
	}
}