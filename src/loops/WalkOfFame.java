
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setWindowSize(2000, 1000);
		rob.setX(50);
rob.setY(500);
		rob.setSpeed(25);
		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.
		int sS = (30);

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
		int space =0;
		for (int i = 0; i < 10; i++) {
			rob.setRandomPenColor();
			rob.penDown();
			
			for (int j = 0; j < 5; j++) {
				rob.move(sS);
				rob.turn(144);

			}
			rob.penUp();
			rob.setX(150+10*i+space);
			space+=150;
		sS=(sS+5*i);
		}

	}

}
