package io.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

import io.view.HomeWindow;

public class WestButtonController implements ActionListener {
	private HomeWindow homeWindow;
	
	public WestButtonController(HomeWindow homeWindow) {
		this.homeWindow = homeWindow;
		this.homeWindow.getWestHomePanel().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(((JComponent)e.getSource()).getName().equals("Employee Detail")) {
			getWindowForEastPanel("employeeDetail");
		} else if(((JComponent)e.getSource()).getName().equals("Performance")) {
			getWindowForEastPanel("performance");
		} else if(((JComponent)e.getSource()).getName().equals("Personal Contacts")) {
			getWindowForEastPanel("personalContacts");
		}
	}
	
	private void getWindowForEastPanel(String name) {
		homeWindow.getEastHomePanel().getCardLayout()
		.show(homeWindow.getEastHomePanel().getEastHomePanel(), name);
	}
}
