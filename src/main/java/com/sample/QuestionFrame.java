package com.sample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class QuestionFrame {
	
	public static void displayStartScreen() {
		JButton btn1 = new JButton(" HELL YEAH! ");
		btn1.setFont(new Font("Arial", Font.BOLD, 22));
		
		JButton btn2 = new JButton("    I guess...   ");
		btn2.setFont(new Font("Arial", Font.BOLD, 22));
		
		Object[] buttons = { btn1, btn2 };
		
		JLabel label = new JLabel("   After-Work Drink Chart   ");
		label.setFont(new Font("Arial", Font.BOLD, 32));
		
		JOptionPane pane = new JOptionPane(label, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, buttons, buttons[0]);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pane.setValue(1);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pane.setValue(1);
			}
		});
		
		JDialog dialog = pane.createDialog(null, "After-Work Drink");
		dialog.setVisible(true);
		
		if (pane.getValue() == null)
			System.exit(0);
	}
	
	public static String displayQuestion(String[] options, String question) {
		JLabel label = new JLabel(question);
		label.setFont(new Font("Arial", Font.BOLD, 24));
		
		JOptionPane pane = new JOptionPane(label, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
		
		JPanel panel = new JPanel();
		if (options.length > 2) {
			GridLayout layout = new GridLayout(options.length, 1);
			layout.setVgap(10);
			layout.setHgap(50);
			panel.setLayout(layout);
		}
		
		JButton[] buttons = new JButton[options.length];
		for (int i = 0; i < options.length; i++) {
			buttons[i] = new JButton(options[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
			final String option = options[i];
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					pane.setValue(option);
				}
			});
			panel.add(buttons[i]);
		}
		
		pane.add(panel);
		
		JDialog dialog = pane.createDialog(null, "After-Work Drink");
		dialog.setVisible(true);
		
		return (String) pane.getValue();
	}
	
	public static void displaySummary(String string) {
		JLabel label = new JLabel(string);
		label.setFont(new Font("Arial", Font.BOLD, 36));
		
		JOptionPane pane = new JOptionPane(label, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{});
		
		JButton button = new JButton("OK");
		button.setFont(new Font("Arial", Font.BOLD, 24));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pane.setValue(1);
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(button);
		pane.add(panel);
		
		JDialog dialog = pane.createDialog(null, "After-Work Drink");
		dialog.setVisible(true);
		
		System.exit(0);
	}
	
	public static void displaySummary(String string, int messageType) {
		JLabel label = new JLabel(string);
		label.setFont(new Font("Arial", Font.BOLD, 36));
		
		JOptionPane pane = new JOptionPane(label, JOptionPane.DEFAULT_OPTION, messageType, null, new Object[]{});
		
		JButton button = new JButton("OK");
		button.setFont(new Font("Arial", Font.BOLD, 24));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pane.setValue(1);
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(button);
		pane.add(panel);
		
		JDialog dialog = pane.createDialog(null, "After-Work Drink");
		dialog.setVisible(true);
		
		System.exit(0);
	}
	
}
