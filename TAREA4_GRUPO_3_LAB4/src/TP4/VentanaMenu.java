package TP4;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static ArrayList<Pelicula> Lista;
	private JMenuBar menuBar;
	private JMenu mnPelicula;
	private JMenuItem mniAgregar;
	private JMenuItem mniListar;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaMenu() {
		setResizable(false);
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPelicula = new JMenu("Pelicula");
		menuBar.add(mnPelicula);
		
		Lista = new ArrayList<Pelicula>();
		
		mniAgregar = new JMenuItem("Agregar");
		mniAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				//para abrir el panel agregar peliculas
				agregarPelicula panelPeliculas = new agregarPelicula(Lista);
				contentPane.add(panelPeliculas);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPelicula.add(mniAgregar);
		
		//para abrir el panel listar peliculas
		mniListar = new JMenuItem("Listar");
		mniListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				listarPelicula panelListar=new listarPelicula(Lista);
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
