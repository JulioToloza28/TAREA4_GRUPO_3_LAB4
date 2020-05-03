package TP4;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;

public class listarPelicula extends JPanel {

	/**
	 * Create the panel.
	 */
	public listarPelicula() {
		setLayout(null);
		
		JLabel lblPelicula = new JLabel("Peliculas");
		lblPelicula.setBounds(32, 130, 73, 14);
		add(lblPelicula);
		
		JList list = new JList();
		list.setBounds(98, 11, 322, 267);
		add(list);

	}
}
