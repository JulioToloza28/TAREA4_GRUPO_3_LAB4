package TP4;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class agregarPelicula extends JPanel {
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public agregarPelicula() {
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
		
		JLabel lblIdnumero = new JLabel("idNumero");
		lblIdnumero.setBounds(134, 49, 46, 14);
		add(lblIdnumero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 81, 120, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cboGenero = new JComboBox();
		cboGenero.setBounds(134, 126, 120, 20);
		add(cboGenero);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(32, 181, 89, 23);
		add(btnAgregar);

	}
}
