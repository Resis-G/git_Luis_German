package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaArrayList2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txt_nombre;
    private JTextField txt_telefono;
    private JTextField txt_curso;
    private JTextField txt_precio;
    private JLabel lblErrorPrecio;
    private JTextField txt_buscar;
    private JButton btn_buscar;
    private JButton btn_restaurar;
	/**
	 * Launch the application.
	 */
    
    private void actualizarTabla(ArrayList<Alumno2> alumnosEncontrados) {
    /*	for(int i=0; i< tableModel.getRowCount(); i++)
		{
		    tableModel.removeRow(i);
		}
    */	
    	tableModel.getDataVector().removeAllElements();
    	for (Alumno2 a : alumnosEncontrados) {
			String nombre = a.getNombre();
			String telefono = a.getTelefono();
			String curso = a.getCurso();
			double precio = a.getPrecioMatricula();
			Object[] data = {nombre,telefono,curso,precio};
			tableModel.addRow(data);
		}
		
	}

	private ArrayList<Alumno2> buscarAlumnos(String texto, ArrayList<Alumno2> alumnos) {
		ArrayList<Alumno2> encontrados = new ArrayList<Alumno2>();
		for(Alumno2 a: alumnos)
		{
			if(a.getCurso().equalsIgnoreCase(texto))
			{
				encontrados.add(a);
			}
		}
		return encontrados;
	}
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaArrayList2 frame = new VentanaArrayList2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaArrayList2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(143, 353, 573, 87);
		contentPane.add(scroll);
		//---------------------------------------------------
		ArrayList<Alumno2> alumnos = new ArrayList<Alumno2>();
		alumnos.add(new Alumno2("pepe1","1345","1dam",10.0));
		alumnos.add(new Alumno2("pepe2","2345","2dam",20.0));
		alumnos.add(new Alumno2("pepe3","3345","1dam",30.0));
		alumnos.add(new Alumno2("pepe4","4345","2dam",40.0));
		alumnos.add(new Alumno2("pepe5","5345","1dam",50.0));
		alumnos.add(new Alumno2("pepe6","6345","2dam",60.0));
		//----------------------------------------------------
		String[] headers = {"NOMBRE","TELEFONO","CURSO","PRECIO"};
		tableModel.setColumnIdentifiers(headers);  
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setBounds(191, 58, 114, 23);
		contentPane.add(lblNombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_nombre.setBounds(340, 57, 352, 25);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelefono.setBounds(191, 112, 114, 23);
		contentPane.add(lblTelefono);
		
		txt_telefono = new JTextField();
		txt_telefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(340, 111, 352, 25);
		contentPane.add(txt_telefono);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurso.setBounds(191, 169, 114, 23);
		contentPane.add(lblCurso);
		
		txt_curso = new JTextField();
		txt_curso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_curso.setColumns(10);
		txt_curso.setBounds(340, 168, 352, 25);
		contentPane.add(txt_curso);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio.setBounds(191, 219, 114, 23);
		contentPane.add(lblPrecio);
		
		txt_precio = new JTextField();
		txt_precio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_precio.setColumns(10);
		txt_precio.setBounds(340, 218, 352, 25);
		contentPane.add(txt_precio);
		//---------------------------------------------------
		lblErrorPrecio = new JLabel("");
		lblErrorPrecio.setBounds(703, 228, 125, 13);
		contentPane.add(lblErrorPrecio);
		//-----------------------------------------------------
		JButton btnNewButton = new JButton("A\u00F1adir Alumno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				lblErrorPrecio.setText("");
				// primero recojo todos los datos y los valido
				String nombre = txt_nombre.getText();
				String telefono = txt_telefono.getText();
				String curso = txt_curso.getText();
				double precio = Double.valueOf(txt_precio.getText());
				//-------------------------------------------
				if(nombre.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "debes escribir un nombre");
				    return; 
				}
				//------------------------------------------
				Alumno2 a = new Alumno2(nombre, telefono, curso, precio);
				alumnos.add(a);
				//-----------------------------------------
				actualizarTabla(alumnos);
				Object[] data = {nombre,telefono,curso,precio};
				tableModel.addRow(data);
				//----------------------------------------
				limpiarPantalla();
				JOptionPane.showMessageDialog(null, "alumno añadido correctamente");

				}
				catch(NumberFormatException e2)
				{
					// e2.printStackTrace();
					//JOptionPane.showMessageDialog(null, "escribe el precio correctamente");
				    lblErrorPrecio.setText("escribe bien el precio");
				    lblErrorPrecio.setForeground(new Color(255,0,0));
				}
			}

			private void limpiarPantalla() {
				txt_nombre.setText("");
				txt_telefono.setText("");
				txt_curso.setText("");
				txt_precio.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(448, 269, 244, 39);
		contentPane.add(btnNewButton);
		
		txt_buscar = new JTextField();
		txt_buscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_buscar.setBounds(143, 463, 262, 32);
		contentPane.add(txt_buscar);
		txt_buscar.setColumns(10);
		
		btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt_buscar.getText();
				ArrayList<Alumno2> alumnosEncontrados = buscarAlumnos(texto, alumnos);
			    actualizarTabla(alumnosEncontrados);
			}
		});
		btn_buscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_buscar.setBounds(470, 468, 141, 27);
		contentPane.add(btn_buscar);
		
		btn_restaurar = new JButton("restaurar");
		btn_restaurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarTabla(alumnos);
			}
		});
		btn_restaurar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_restaurar.setBounds(640, 471, 141, 27);
		contentPane.add(btn_restaurar);
		
		
        actualizarTabla(alumnos);
	}
}
