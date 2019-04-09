//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(1000);

		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 11; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String numb = JOptionPane.showInputDialog("Guess a number between one and 1000");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int n = Integer.parseInt(numb);
			// 5. if the guess is correct
			if (n == random) {
				JOptionPane.showMessageDialog(null, "You won in "+ i  +" tries. The number was " + random);
				System.exit(0);
			}
			// 6. Win
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			// 7. if the guess is high
			if (n > random) {
				JOptionPane.showMessageDialog(null, "Your guess was too high. Try again");

			}
			// 8. Tell them it's too high
			// 9. if the guess is low
			if (n < random) {
				JOptionPane.showMessageDialog(null, "Your guess was too low. Try again");

			}
			if (i==10) {
				JOptionPane.showMessageDialog(null, "You have ran out of guesses you lose.");
				
			}
			// 10. Tell them it's too low

		} // 13. Tell them they lose

	}

}
