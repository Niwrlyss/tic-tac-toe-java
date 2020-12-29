package application;

import system.TicTacShape;

public class UI {
	// printBoard = Hash shapes(X,O)
	// because I wanna show the shapes
	// on the main program([][] of shapes)
	public static void printBoard(TicTacShape[][] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.print((3 - i) + " ");
			for (int j = 0; j < shapes.length; j++) {
				// inside this for, print shape in i, j
				printShape(shapes[i][j]);
			}
			// break line in final before first for ends
			System.out.println();
		}
		// now print letters of columns
		System.out.println("   a  b  c");
	}

	// print board first create a auxiliar
	// method printing just 1 shape
	// if shape = null there's no shape on position
			// if shape = shape there's a shape and print
	private static void printShape(TicTacShape shape) {
		if (shape == null) {
			System.out.print("|-|");
		} else {
			System.out.println("|" + shape + "|");
		}
	}
}