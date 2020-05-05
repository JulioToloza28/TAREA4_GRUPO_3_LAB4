package TP4;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class listarPelicula extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public listarPelicula() {}
	
	public listarPelicula(DefaultListModel<Pelicula> model) {
		setLayout(null);
		
		JLabel lblPelicula = new JLabel("Peliculas");
		lblPelicula.setBounds(32, 130, 73, 14);
		add(lblPelicula);
		
		JList<Pelicula> list = new JList<Pelicula>(model);
		list.setBounds(98, 11, 322, 267);
		add(list);

	}
}
