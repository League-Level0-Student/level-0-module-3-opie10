//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String a	=JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			if (a.equals ("No")) {
				JOptionPane.showMessageDialog(null, "You are CRAZY!!!!!!!!!!!!");
			return;
			}
			else if(a.equals ("no")) {
			
				JOptionPane.showMessageDialog(null, "You are CRAZY!!!!!!!!!!!!");
				return;
			}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
			else if (a.equals("Yes")) {
				String h	=JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, h + " is much better with bananas!");
			return;
			}
			else if (a.equals("yes")) {
				String h	=JOptionPane.showInputDialog("What is your favorite hobby");
			JOptionPane.showMessageDialog(null, h + " is much better with bananas!");
			return;
			}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
			else {
				JOptionPane.showMessageDialog(null, "You are bananas!");
			return;
			}
	}

}

