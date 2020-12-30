package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import system.Match;
import system.TicTacException;
import system.TicTacPosition;
import system.TicTacShape;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// instantiate a Hash Match (class HashMatch)
		Match hashMatch = new Match();
		//using try catch to handle exceptions now
		try{
			while(true) {
				UI.clearScreen();
				System.out.println();
				//print shapes on the match
				UI.printBoard(hashMatch.getShapes());
				System.out.println();
				
				System.out.print("Please chose a position: ");
				TicTacPosition targetPosition = UI.readShapePosition(sc);
				TicTacShape hs = hashMatch.placingShapes(targetPosition);
			}
		}
		catch(TicTacException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			//next line for program wait press enter
			sc.nextLine();
		}
	}
}