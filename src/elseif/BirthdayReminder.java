
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "	June 20th";
		String dadsBirthday = "June 10th";
		String myBirthday = "June 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String b = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		
		// 4. if user asked for "mom"
			//print mom's birthday
if (b.equals ("mom")) { 
	JOptionPane.showMessageDialog(null, momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
else if (b.equals ("dad")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
 else if (b.equals ("you")) {
	 JOptionPane.showMessageDialog(null, myBirthday);
	
	 }
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
 else { 
	 JOptionPane.showMessageDialog(null, "Sorry I do not know who you are talking about, you have come to the wrong house\n *slams door in your face*");
 }
	} 
}

