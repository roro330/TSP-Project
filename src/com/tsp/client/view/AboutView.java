package com.tsp.client.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.tsp.client.controller.StartupController;

public class AboutView extends JFrame {

	public AboutView(StartupController controller) {
		setTitle("About");
		setSize(350,250);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER));
	
		JLabel teamLabel = new JLabel("Team Sexy: ");
		teamLabel.setPreferredSize(new Dimension(325,20));
		add(teamLabel);
		
		JTextArea teamText = new JTextArea();
		teamText.setBackground(null);
		teamText.setFocusable(false);
		teamText.setPreferredSize(new Dimension(325,100));
		teamText.setText("-> Adam Weidner\n" +
				"-> Tim Bradt\n" +
				"-> Matthew Mansfield\n" +
				"-> Tyler Schenk\n");
		add(teamText);
		
		JTextArea aboutText = new JTextArea();
		aboutText.setWrapStyleWord(true);
		aboutText.setBackground(null);
		aboutText.setLineWrap(true);
		aboutText.setFocusable(false);
		aboutText.setPreferredSize(new Dimension(325,200));
		aboutText.setText("This game was developed in the Fall of 2013 at Michigan Technological University.\n\n" +
				"Thanks for playing!");
		add(aboutText);
	}
}
