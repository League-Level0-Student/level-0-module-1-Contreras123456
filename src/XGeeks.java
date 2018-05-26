//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String superpower = "Ice Cream Magnetic";
String superpower2 = "Flying";
		// 2. Ask the user to enter a name. Store their answer in a variable.
 
String answer = JOptionPane.showInputDialog("Type in a name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
 if(answer.equals("Henry")){
 		JOptionPane.showMessageDialog(null, "Henry's superpowers is ice cream magnetic");
	}

	else if(answer.equals("Another")) { 
		JOptionPane.showMessageDialog(null, "Flying");
}
	else {
		JOptionPane.showMessageDialog(null, "Wrong");
	}
}
}