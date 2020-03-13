package io.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NorthHomePanel {
	
	public JPanel northHomePanel() {
		JPanel northHomePanel = new JPanel();
		northHomePanel.setBackground(new Color(70,130,180));
		northHomePanel.add(testLabel());
		return northHomePanel;
	}
	
	public JLabel testLabel() {
		JLabel testLabel = new JLabel("EmTrack v1.0");
		testLabel.setFont(new Font("Arial", 0 , 23));
		testLabel.setForeground(Color.WHITE);
		return testLabel;
	}

}
