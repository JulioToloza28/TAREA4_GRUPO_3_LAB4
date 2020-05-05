package TP4;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Container;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class agregarPelicula extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public agregarPelicula() {}
	
	public agregarPelicula(DefaultListModel<Pelicula> model) {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(32, 49, 46, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 84, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(32, 123, 46, 26);
		add(lblGenero);
		
		
		JLabel lblIdnumero = new JLabel("");
		lblIdnumero.setBounds(134, 49, 46, 14);
		add(lblIdnumero);
		Pelicula pelicula = new Pelicula();
		lblIdnumero.setText(String.valueOf(pelicula.getId()));
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 81, 207, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox<Categoria> cboGenero = new JComboBox<Categoria>();
		cboGenero.setBounds(134, 126, 207, 20);
		cboGenero.addItem(new Categoria(-1, "Seleccione un genero"));
		cboGenero.addItem(new Categoria(0, "Terror"));
		cboGenero.addItem(new Categoria(1, "Accion"));
		cboGenero.addItem(new Categoria(2, "Suspenso"));
		cboGenero.addItem(new Categoria(3, "Romantica"));
		cboGenero.addItem(new Categoria(4, "Thriller"));
		add(cboGenero);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(32, 181, 89, 23);
		add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categoria CategoriaAux = new Categoria();
				CategoriaAux=(Categoria)cboGenero.getSelectedItem();
				
				try {
					if(txtNombre.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Complete el nombre");
						return;
					}else if(CategoriaAux.getId()==-1) {
						JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
						return;
					}else {
						Pelicula peli = new Pelicula(txtNombre.getText(),CategoriaAux);
						model.addElement(peli);
						JOptionPane.showMessageDialog(null, "Pelicula agregada correctamente");
	
					}
				}
				catch(Exception Ex){
					JOptionPane.showMessageDialog(null, Ex.toString());
				}
				

			}
		});

	}

	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
}
