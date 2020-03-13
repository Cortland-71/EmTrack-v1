package io.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeWindow {
	
	public static GridBagConstraints c = new GridBagConstraints();
	private NorthHomePanel northHomePanel = new NorthHomePanel();
	private WestHomePanel westHomePanel = new WestHomePanel();
	private EastHomePanel eastHomePanel = new EastHomePanel();
	
	private static final Color STD_BG = new Color(220,220,220);
	private static final Color HEAD_BG = new Color(198,0,26);
	private static final String STD_FONT = "Corbel";
	
	public HomeWindow() {
		JFrame homeFrame = new JFrame("EmTrack v1.0");
		homeFrame.setSize(1440, 900);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setLocationRelativeTo(null);
		homeFrame.setContentPane(homePanel());
		homeFrame.setVisible(true);
	}
	
	private JPanel homePanel() {
		JPanel homePanel = new JPanel();
		homePanel.setLayout(new BorderLayout());
		homePanel.setBackground(STD_BG);
		homePanel.add(northHomePanel.northHomePanel(), BorderLayout.NORTH);
		homePanel.add(westHomePanel.westHomePanel(), BorderLayout.WEST);
		homePanel.add(eastHomePanel.eastHomePanel(), BorderLayout.EAST);
		
		return homePanel;
	}
	
	public static void setFont(JComponent com, String font, int type, int size, Color fg) {
		com.setForeground(fg);
		com.setFont(new Font(font, type, size));
	}
	
	public NorthHomePanel getNorthHomePanel() {
		return this.northHomePanel;
	}
	
	public WestHomePanel getWestHomePanel() {
		return this.westHomePanel;
	}
	
	public EastHomePanel getEastHomePanel() {
		return this.eastHomePanel;
	}
	
	public static Color getSTD_BG() {
		return STD_BG;
	}
	
	public static Color getHEAD_BG() {
		return HEAD_BG;
	}
	
	public static String getSTD_FONT() {
		return STD_FONT;
	}
}
