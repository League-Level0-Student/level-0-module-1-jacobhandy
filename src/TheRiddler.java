import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
		int score = 0;
		String  answer = JOptionPane.showInputDialog("There was a plane crash and single person died. Who surrvived?").toLowerCase();
		if(answer.equals("all married couples")) { 
			score=score+1;
			JOptionPane.showMessageDialog(null, "Correct!!!! The score is " + score + "!");
			
		} else {
			score=score-1;
			JOptionPane.showMessageDialog(null, "INCORRECT!!! The score is " + score + "!");
		
		}
	
	String answer2 = JOptionPane.showInputDialog("If a cat can jump 5 feet high, then why can't it jump through a window that is 3 feet high?").toLowerCase();
	if(answer2.equals("because the window is closed")){
		 score = score + 1;
		JOptionPane.showMessageDialog(null, "Correct!!! The score is " + score + "!");
	}else {
		JOptionPane.showMessageDialog(null, "Incorrect!!!");
	}
}}

