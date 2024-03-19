package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	//Screen Settings
	final int originalTileSize = 16; //16x16 tile default size of the character
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale; // 48x48 tile
	final int maxScreenCol = 16; //for column
	final int maxScreenRow = 12; //for rows
	final int screenWidth = tileSize * maxScreenCol; //for the width of the panel (768 px)
	final int screenHeight = tileSize * maxScreenRow; //for the height of the panel (576 px)
	
	public MainPanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.pink);
		this.setDoubleBuffered(true);
	}
}
