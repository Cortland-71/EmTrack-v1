package io.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WestHomePanel {
	
	public JPanel westHomePanel() {
		JPanel  westHomePanel = new JPanel();
		westHomePanel.setBorder(BorderFactory.createEtchedBorder(1));
		westHomePanel.setLayout(new BorderLayout());
		westHomePanel.setPreferredSize(new Dimension(200,0));
		westHomePanel.setBackground(HomeWindow.getSTD_BG());
		westHomePanel.add(titlePanel(), BorderLayout.NORTH);
		westHomePanel.add(recordsButtonPanel(), BorderLayout.CENTER);
		return  westHomePanel;
	}
	
	//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
	
	private JPanel titlePanel() {
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(HomeWindow.getHEAD_BG());
		titlePanel.add(recordsLabel());
		
		return titlePanel;
	}
	
	public JLabel recordsLabel() {
		HomeWindow.c.anchor = GridBagConstraints.NORTH;
		JLabel testLabel = new JLabel("Records");
		HomeWindow.setFont(testLabel, HomeWindow.getSTD_FONT(), 1, 15, Color.WHITE);
		testLabel.setForeground(Color.WHITE);
		return testLabel;
	}
	
	//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
	private List<JButton> recordButtons = new ArrayList<>();
	private String[] recordNames = {"Employee Detail", "Performance", "Personal Contacts"};
	
	private JPanel recordsButtonPanel() {
		JPanel recordsPanel = new JPanel();
		recordsPanel.setBackground(null);
		for (int i = 0; i < recordNames.length; i++) {
			recordButtons.add(getRecordButton(recordNames[i]));
			recordsPanel.add(recordButtons.get(i));
		}
		return recordsPanel;
	}
	
	
	private JButton getRecordButton(String name) {
		JButton recordButton = new JButton(name);
		recordButton.setName(name);
		recordButton.setPreferredSize(new Dimension(200,30));
		recordButton.setBackground(Color.GRAY);
		HomeWindow.setFont(recordButton, HomeWindow.getSTD_FONT(), 1, 12, Color.WHITE);
		return recordButton;
	}
	
	public void addActionListener(ActionListener l) {
		recordButtons.forEach(e->e.addActionListener(l));
	}
	
	
	
}
