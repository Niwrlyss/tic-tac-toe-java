package application;

import system.Match;

public class Program {

	public static void main(String[] args) {
		// instantiate a Hash Match (class HashMatch)
		Match hashMatch = new Match();

		// print shapes on the match but after
		System.out.println();
		UI.printBoard(hashMatch.getShapes());
	}

}
