import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int a = 5;
int b = 6;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
JOptionPane.showMessageDialog(null,"Correct!" +b);
if(answer == "Kirby") {
	
}
		// 5. Otherwise, say "wrong" and tell them the answer

 else {
	 JOptionPane.showMessageDialog(null,"Wrong. The answer is Kirby");	
}
		// 6. Add some more riddles
JOptionPane.showInputDialog("I'm tall when i'm young and short when i'm old. What am I?");
		// 2. Make a pop up to show the score.
		JOptionPane.showInputDialog("Why?"+a);
	}
}

