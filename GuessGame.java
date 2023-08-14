package codessoftweek1;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO CODESOFT GUESSING GAME");
		Scanner sc = new Scanner(System.in);
		String play = "Yes";
		System.out.println("ENTER YOUR NAME: ");
		// ENTER THE NAME IN CAPITAL LETTERS
		String name = sc.next();
		while (play.equalsIgnoreCase("yes")) {

		Random rand = new Random();
		int randNum = rand.nextInt(100);
		int guess = 0;
		int tries = 0;

		while (guess != randNum) {
			System.out.println("GUESS A NUMBER BETWEEN 1 TO 100: ");
			guess = sc.nextInt();
			tries++;
			if (guess < 0) {
				System.out.println("PLEASE ENTER THE VALID NUMBER: ");
			}

			if (guess == randNum) {
				System.out.println("WOW YOU WON THE GAME :)");
				System.out.println("IT ONLY TOOK" + " " + tries + " " + "guesses!");
				System.out.println("WOULD LIKE PLAY AGAIN ?: YES/NO ");
				play = sc.next();

			} else if (guess > randNum) {
				System.out.println("THE NUMBER IS TOO HIGH");
			} else {
				System.out.println("THE NUMBER IS TOO LOW");
			}
		}
	}
	System.out.println("THANK YOU FOR PLAYING " + name);
		sc.close();

	}

}
