//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot jim = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String d =JOptionPane.showInputDialog("How dizzy do you want the robot to be on a scale of one to ten?");
 // 1. Use the dance method to make the robot spin.
int dd = Integer.parseInt(d);
 dance(dd);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			jim.setSpeed(100);
			jim.turn(360);
		}
	}
}

