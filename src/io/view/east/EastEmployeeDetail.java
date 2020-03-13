package io.view.east;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import io.view.HomeWindow;

public class EastEmployeeDetail {
	public JPanel employeeDetailPanel() {
		JPanel employeeDetailPanel = new JPanel();
		employeeDetailPanel.setLayout(new BorderLayout());
		employeeDetailPanel.setBackground(null);
		employeeDetailPanel.add(northEmployeeDetailPanel(), BorderLayout.NORTH);
		employeeDetailPanel.add(centerEmployeeDetailPanel(), BorderLayout.CENTER);
		return employeeDetailPanel;
	}
	
	//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
	private JPanel northEmployeeDetailPanel() {
		JPanel northEmployeeDetailPanel = new JPanel();
		northEmployeeDetailPanel.setLayout(new GridBagLayout());
		northEmployeeDetailPanel.setBackground(HomeWindow.getHEAD_BG() );
		northEmployeeDetailPanel.add(employeeDetailTitleLabel(), HomeWindow.c);
		northEmployeeDetailPanel.add(newButton(), HomeWindow.c);
		northEmployeeDetailPanel.add(saveButton(), HomeWindow.c);
		northEmployeeDetailPanel.add(cancelButton(), HomeWindow.c);
		northEmployeeDetailPanel.add(printButton(), HomeWindow.c);
		return northEmployeeDetailPanel;
	}
	
	private JLabel employeeDetailTitleLabel() {
		HomeWindow.c.gridwidth = 4;
		HomeWindow.c.insets = new Insets(10,0,10,0);	
		JLabel employeeDetailTitleLabel = new JLabel("Employee Detail");
		HomeWindow.setFont(employeeDetailTitleLabel, HomeWindow.getSTD_FONT(), 1, 15, Color.WHITE);
		return employeeDetailTitleLabel;
	}
	

	private JButton newButton;
	private JButton newButton() {
		HomeWindow.c.insets = new Insets(0,0,10,0);
		HomeWindow.c.gridwidth = 1;
		HomeWindow.c.gridx = 0;
		HomeWindow.c.gridy = 1;
		newButton = new JButton("New");
		newButton.setPreferredSize(new Dimension(40,30));
		return newButton;
	}
	
	private JButton saveButton;
	private JButton saveButton() {
		HomeWindow.c.gridwidth = 1;
		HomeWindow.c.insets = new Insets(0,10,10,5);
		HomeWindow.c.gridx = 1;
		HomeWindow.c.gridy = 1;
		saveButton = new JButton("Save");
		saveButton.setPreferredSize(new Dimension(40,30));
		return saveButton;
	}
	
	private JButton cancelButton;
	private JButton cancelButton() {
		HomeWindow.c.insets = new Insets(0,5,10,10);
		HomeWindow.c.gridwidth = 1;
		HomeWindow.c.gridx = 2;
		HomeWindow.c.gridy = 1;
		cancelButton = new JButton("Cancel");
		cancelButton.setPreferredSize(new Dimension(40,30));
		return cancelButton;
	}
	
	private JButton printButton;
	private JButton printButton() {
		HomeWindow.c.insets = new Insets(0,0,0,0);
		HomeWindow.c.gridwidth = 1;
		HomeWindow.c.gridx = 3;
		HomeWindow.c.gridy = 1;
		printButton = new JButton("Print");
		printButton.setPreferredSize(new Dimension(40,30));
		return printButton;
	}
	//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
	
	private JPanel centerEmployeeDetailPanel() {
		JPanel centerEmployeeDetailPanel = new JPanel();
		centerEmployeeDetailPanel.setLayout(new GridBagLayout());
		centerEmployeeDetailPanel.setBackground(HomeWindow.getSTD_BG());
		centerEmployeeDetailPanel.add(salutationBox(), HomeWindow.c);
		return centerEmployeeDetailPanel;
	}
	
	private JComboBox<String> salutationBox;
	private JComboBox<String> salutationBox() {
		HomeWindow.c.insets = new Insets(0,0,0,0);
		HomeWindow.c.gridwidth = 0;
		HomeWindow.c.gridx = 0;
		HomeWindow.c.gridy = 0;
		HomeWindow.c.anchor = GridBagConstraints.NORTH;
		salutationBox = new JComboBox<>();
		salutationBox.setPreferredSize(new Dimension(100,20));
		return salutationBox;
	}
	
}
