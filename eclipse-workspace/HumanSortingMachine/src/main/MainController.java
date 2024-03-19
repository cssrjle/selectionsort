package main;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MainController {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Human Sorting Machine");
		
		MainPanel mainPanel = new MainPanel();
		window.getContentPane().add(mainPanel);
		
		JLabel gameLabel = new JLabel("HUMAN SORTING MACHINE");
		Font font = new Font("29LT Arapix", Font.BOLD, 24);
		gameLabel.setFont(font);
				
		mainPanel.add(gameLabel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

}
