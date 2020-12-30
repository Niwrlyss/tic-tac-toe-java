package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import system.TicTacShape;
import system.TicTacPosition;
import system.ShapeColor;

public class UI {
	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

			//special codes to reset text and print on console
			//ANSI_RESET = reset color
			public static final String ANSI_RESET = "\u001B[0m";
			public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
			public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";	
			public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
			
			public static void clearScreen() {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
			
			public static TicTacPosition readShapePosition(Scanner sc) {
				try {
					String s = sc.nextLine();
					char column = s.charAt(0);
					
					int row = Integer.parseInt(s.substring(1));
					return new TicTacPosition(column, row);
				}
				catch (RuntimeException e) {
					throw new InputMismatchException("Error reading ShapePosition. Valid values are from a1 to c3.");
				}
			}
			
	//printBoard = Hash shapes(X,O)
	//because I wanna show the shapes
	//on the main program([][] of shapes)
	public static void printBoard (TicTacShape[][] shapes) {
		//first print number of line
		//matrix = 0,1,3 not 3,2,1 so:
		for(int i = 0; i<shapes.length;i++) {
			System.out.print(WHITE_BOLD_BRIGHT+(3 - i) + ANSI_RESET+ " ");
			for(int j = 0;j<shapes.length;j++) {
				//inside this for, print shape in i, j
				printShape(shapes[i][j]);
			}
			//break line in final before first for ends
			System.out.println();
		}
		//now print letters of columns
		System.out.println(WHITE_BOLD_BRIGHT+"   a  b  c" + ANSI_RESET);
	}
	//print board first create a auxiliar
	//method printing just 1 shape(X,O)
	private static void printShape(TicTacShape shape) {
		//if shape = null there's no shape on position
		//if shape = shape there's a shape and print
		if(shape == null) {
			System.out.print(WHITE_BOLD_BRIGHT +"| |"+ANSI_RESET);
		} else {
			if(shape.getColor() == ShapeColor.GREEN) {
				System.out.print(WHITE_BOLD_BRIGHT +"|"+GREEN_BOLD_BRIGHT  + shape + ANSI_RESET+WHITE_BOLD_BRIGHT +"|");
			} else {
				System.out.print(WHITE_BOLD_BRIGHT +"|"+BLUE_BOLD_BRIGHT + shape + ANSI_RESET+WHITE_BOLD_BRIGHT +"|");
			}
		}
	}
}