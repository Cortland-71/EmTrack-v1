package io.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import io.view.east.EastEmployeeDetail;
import io.view.east.EastPerformance;
import io.view.east.EastPersonalContacts;

public class EastHomePanel {
	
	private CardLayout cardLayout = new CardLayout();
	private EastEmployeeDetail eastEmployeeDetail = new EastEmployeeDetail();
	private EastPerformance eastPerformance = new EastPerformance();
	private EastPersonalContacts eastPersonalContacts = new EastPersonalContacts();
	
	
	private JPanel eastHomePanel;
	public JPanel eastHomePanel() {
		eastHomePanel = new JPanel();
		eastHomePanel.setLayout(cardLayout);
		eastHomePanel.setPreferredSize(new Dimension(400,0));
		eastHomePanel.setBackground(new Color(192,192,192));
		eastHomePanel.setBorder(BorderFactory.createEtchedBorder(1));
		eastHomePanel.add(eastEmployeeDetail.employeeDetailPanel(), "employeeDetail");
		eastHomePanel.add(eastPerformance.performancePanel(), "performance");
		eastHomePanel.add(eastPersonalContacts.personalContactsPanel(), "personalContacts");
		return  eastHomePanel;
	}
	
	
	public CardLayout getCardLayout() {
		return this.cardLayout;
	}
	
	public JPanel getEastHomePanel() {
		return eastHomePanel;
	}

}
