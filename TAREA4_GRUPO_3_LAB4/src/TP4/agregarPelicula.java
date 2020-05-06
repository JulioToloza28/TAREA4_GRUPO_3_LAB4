package TP4;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class agregarPelicula extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblIdnumero;
	private JComboBox<Categoria> cboGenero;
	private JButton btnAgregar;
	/**
	 * Create the panel.
	 */
	public agregarPelicula() {}
	
	public agregarPelicula(ArrayList<Pelicula> model) {
		setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setBounds(32, 49, 46, 14);
		add(lblId);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 84, 46, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(32, 123, 46, 26);
		add(lblGenero);
		
		
		lblIdnumero = new JLabel("");
		lblIdnumero.setBounds(134, 49, 46, 14);
		add(lblIdnumero);
		lblIdnumero.setText(String.valueOf(Pelicula.getCont()));
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 81, 207, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cboGenero= new JComboBox<Categoria>();
		cboGenero.setBounds(134, 126, 207, 20);
		cboGenero.addItem(new Categoria(-1, "Seleccione un genero"));
		cboGenero.addItem(new Categoria(0, "Terror"));
		cboGenero.addItem(new Categoria(1, "Accion"));
		cboGenero.addItem(new Categoria(2, "Suspenso"));
		cboGenero.addItem(new Categoria(3, "Romantica"));
		cboGenero.addItem(new Categoria(4, "Thriller"));
		add(cboGenero);
		
		btnAgregar = new JButton("Aceptar");
		btnAgregar.setBounds(170, 181, 89, 23);
		add(btnAgregar);
		//Boton agregar pelicula
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categoria CategoriaAux = new Categoria();
				CategoriaAux=(Categoria)cboGenero.getSelectedItem();
				//validacion de campos vacios y opcion de combobox que no debe seleccionarse
				try {
					if(txtNombre.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Complete el nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}else if(CategoriaAux.getId()==-1) {
						JOptionPane.showMessageDialog(null, "Debe seleccionar un genero", "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
						//Agrega la pelicula correctamente
					}else {
						model.add(new Pelicula(txtNombre.getText(),CategoriaAux));
						JOptionPane.showMessageDialog(null, "Pelicula agregada correctamente");
						lblIdnumero.setText(String.valueOf(Pelicula.getCont()));
						//Vacia los campos
						txtNombre.setText("");
						txtNombre.requestFocus();
						cboGenero.setSelectedIndex(0);
					}
				}
				catch(Exception Ex){
					JOptionPane.showMessageDialog(null, Ex.toString());
				}

			}
		});

	}
}
