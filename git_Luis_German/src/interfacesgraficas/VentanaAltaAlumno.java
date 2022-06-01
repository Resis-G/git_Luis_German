package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class VentanaAltaAlumno extends JFrame {

	private JPanel contentPane = null;
	private JTextField txt_nombre = null;
	private JTextField txt_telefono = null;
	private JCheckBox cb_acepto = null;
	private JCheckBox cb_local = null;
	private JRadioButton rb1dam = null;
	private JRadioButton rb2dam = null;
	private ButtonGroup bg_curso = null;
	private double precioMatricula  = 0.0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaAlumno frame = new VentanaAltaAlumno();
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
	public VentanaAltaAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setBounds(138, 10, 91, 42);
		contentPane.add(lblNombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_nombre.setBounds(294, 15, 297, 42);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelefono.setBounds(138, 90, 91, 42);
		contentPane.add(lblTelefono);
		
		txt_telefono = new JTextField();
		txt_telefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(294, 95, 297, 42);
		contentPane.add(txt_telefono);
		
		cb_acepto = new JCheckBox("Acepto las condiciones");
		cb_acepto.setFont(new Font("Tahoma", Font.BOLD, 20));
		cb_acepto.setBounds(138, 312, 392, 21);
		
		cb_local = new JCheckBox("Soy de Sese\u00F1a");
		cb_local.setFont(new Font("Tahoma", Font.BOLD, 20));
		cb_local.setBounds(138, 253, 392, 21);
		contentPane.add(cb_local);
		
		contentPane.add(cb_acepto);
		
		JButton btnAceptar = new JButton("Dar de Alta");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_nombre.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "debes escribir un nombre");
					return;
				}
				if(txt_telefono.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "debes escribir un telefono");
					return;
				}
				if(cb_acepto.isSelected())
				{
					if(!rb1dam.isSelected() && !rb2dam.isSelected())
					{
						JOptionPane.showMessageDialog(null, "debes seleccionar un curso");
						return;
					}
					JOptionPane.showMessageDialog(null, "dando de alta al usuario");
                    
					String textoNombre = txt_nombre.getText();
                    String textoTelefono = txt_telefono.getText();
                    String textoCurso = "";
                    if(rb1dam.isSelected())
                    {
                       textoCurso ="1dam";   
                       precioMatricula = 50.0;
                    }
                    else if(rb2dam.isSelected())
                    {
                        textoCurso ="2dam"; 
                        precioMatricula = 60.0;
                     }
                    //-------------------------------
                    if(cb_local.isSelected())
                    {
                    	precioMatricula = precioMatricula * 0.90;
                    }
                    
                    
					Alumno2 nuevoAlumno = new Alumno2(textoNombre, textoTelefono, textoCurso, precioMatricula);
					// el nuevo alumno se guardaría en la base de datos
					JOptionPane.showMessageDialog(null, " SE HA CREADO CORRECTAMENTE EL ALUMNO CON LOS SIGUIENTES DATOS \n" + nuevoAlumno.toString());

					if(cb_local.isSelected())
                    {
    					JOptionPane.showMessageDialog(null, "obtienes un descuento del 10%");
                    }
				}
				else {

					JOptionPane.showMessageDialog(null, "debes aceptar los términos");
					return;
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(415, 361, 175, 42);
		contentPane.add(btnAceptar);
		
		bg_curso = new ButtonGroup();
		
		rb1dam = new JRadioButton("1DAM");
		bg_curso.add(rb1dam);
		rb1dam.setFont(new Font("Tahoma", Font.BOLD, 20));
		rb1dam.setBounds(352, 185, 103, 21);
		contentPane.add(rb1dam);
		
		rb2dam = new JRadioButton("2DAM");
		rb2dam.setFont(new Font("Tahoma", Font.BOLD, 20));
		rb2dam.setBounds(491, 185, 103, 21);
		bg_curso.add(rb2dam);
		contentPane.add(rb2dam);
		
		

	}
}
