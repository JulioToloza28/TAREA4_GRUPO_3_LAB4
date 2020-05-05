package TP4;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static DefaultListModel<Pelicula> Model;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaMenu() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPelicula = new JMenu("Pelicula");
		menuBar.add(mnPelicula);
		
		Model = new DefaultListModel<Pelicula>();
		
		JMenuItem mniAgregar = new JMenuItem("Agregar");
		mniAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				//para abrir el form agregar peliculas
				agregarPelicula panelPeliculas = new agregarPelicula(Model);
				contentPane.add(panelPeliculas);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPelicula.add(mniAgregar);
		
		JMenuItem mniListar = new JMenuItem("Listar");
		mniListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				listarPelicula panelListar=new listarPelicula(Model);
				contentPane.add(panelListar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPelicula.add(mniListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
