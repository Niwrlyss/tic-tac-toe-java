package application;

import java.util.Scanner;

import system.Match;
import system.TicTacPosition;
import system.TicTacShape;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// instantiate a Hash Match (class HashMatch)
		Match hashMatch = new Match();

		while(true) {
			//print shapes on the match
			System.out.println();
			UI.printBoard(hashMatch.getShapes());
			
			System.out.print("Please chose a position: ");
			TicTacPosition targetPosition = UI.readShapePosition(sc);
			System.out.println();
			TicTacShape hs = hashMatch.placingShapes(targetPosition);
			
		}
	}
}
