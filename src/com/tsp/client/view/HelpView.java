package com.tsp.client.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.tsp.client.controller.StartupController;

public class HelpView extends JFrame {

	private static final long serialVersionUID = -1888740049672958695L;

	public HelpView(StartupController controller) {
		setTitle("Help");
		setSize(350,500);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel controlLabel = new JLabel("Controls: ");
		controlLabel.setPreferredSize(new Dimension(325,20));
		add(controlLabel);
		
		JTextArea controlText = new JTextArea();
		controlText.setBackground(null);
		controlText.setFocusable(false);
		controlText.setPreferredSize(new Dimension(325,50));
		controlText.setText("Arrow Keys: Move Character \n" +
				"W/A/S/D: Attack");
		add(controlText);
		
		JLabel characterLabel = new JLabel("Character Legend: ");
		characterLabel.setPreferredSize(new Dimension(325,20));
		add(characterLabel);
		
		JTextArea characterText = new JTextArea();
		characterText.setBackground(null);
		characterText.setFocusable(false);
		characterText.setPreferredSize(new Dimension(325,150));
		characterText.setText("@ Player \n" +
				"# Wall \n" + 
				"\u25B2 Stairs Up\n" +
				"\u25BC Stairs Down\n" +
				"\u263A Smiley1\n" +
				"\u263B Smiley2\n" +
				"\u2639 Frowny");
		add(characterText);
		
		JLabel howToLabel = new JLabel("How to Play: ");
		howToLabel.setPreferredSize(new Dimension(325,20));
		add(howToLabel);
		
		JTextArea howToText = new JTextArea();
		howToText.setWrapStyleWord(true);
		howToText.setBackground(null);
		howToText.setLineWrap(true);
		howToText.setFocusable(false);
		howToText.setPreferredSize(new Dimension(325,200));
		howToText.setText("-> Games may be played with up to 8 players\n" +
				"-> At the start, all players are placed around a\n     randomly generated, multi-level dungeon\n" +
				"-> Walk over stairs to travel between floors\n" +
				"-> Eliminate all other players to win\n");
		add(howToText);
	}
}
