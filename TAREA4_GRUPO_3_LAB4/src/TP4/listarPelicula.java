package TP4;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
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
	
public listarPelicula(ArrayList<Pelicula> model) {
		
		Collections.sort(model, (x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre()));
		ListIterator<Pelicula> ListaModel=model.listIterator();
		DefaultListModel<Pelicula> listaPeli= new DefaultListModel<Pelicula>();
		while(ListaModel.hasNext())
		{
			listaPeli.addElement(ListaModel.next());
		}
		
		setLayout(null);
		
		JLabel lblPelicula = new JLabel("Peliculas");
		lblPelicula.setBounds(32, 130, 73, 14);
		add(lblPelicula);
		
		JList<Pelicula> list = new JList<Pelicula>(listaPeli);
		list.setBounds(98, 11, 322, 267);
		add(list);

	}
}
