//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Jim = new Robot();
		for (int i = 0; i < 7; i++) {

			// 3. Ask the user what color they would like the robot to draw
			String uc = JOptionPane.showInputDialog(
					"What color would you like the robot to draw? \n\n Blue      Purple        Red         Gray       Green ");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (uc.equals("Blue")) {
				Jim.setPenColor(new Color(0, 0, 255));

			}
			else if (uc.equals("Red")) {
				Jim.setPenColor(new Color(255, 0, 0));

			}
			else if (uc.equals("Green")) {
				Jim.setPenColor(new Color(0, 255, 0));

			}
			else if (uc.equals("Purple")) {
				Jim.setPenColor(new Color(125, 0, 120));

			}
			else if (uc.equals("Gray")) {
				Jim.setPenColor(new Color(25, 25, 40, 20));

			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				Jim.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			Jim.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			Jim.setSpeed(10);
			Jim.sparkle();
			Jim.penDown();
			Jim.move(250);
			Jim.turn(-90);
			Jim.move(250);
			Jim.turn(-90);
			Jim.move(250);
			Jim.turn(-90);
			Jim.move(250);
			Jim.turn(-90);
			Jim.unSparkle();

		}
	}
}