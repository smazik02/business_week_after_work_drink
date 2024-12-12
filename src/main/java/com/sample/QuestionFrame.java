package com.sample;

import javax.swing.*;

public class QuestionFrame {
	
	public static String displayQuestion(String[] options, String question) {
		int selected = JOptionPane.showOptionDialog(null, question, "After-Work Drink", 0, 3, null, options, options[0]);
		if (selected == -1)
			return null;
		return options[selected];
	}
	
	public static void displaySummary(String string) {
		JOptionPane.showMessageDialog(null, string);
	}
	
}
