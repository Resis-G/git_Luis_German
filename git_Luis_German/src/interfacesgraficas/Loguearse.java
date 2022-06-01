package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loguearse extends JFrame {

	private JPanel contentPane;
	private JTextField txt_usuario;
	private JPasswordField txt_clave;
	
	private final String usuario ="pepe";
	private final String clave = "1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loguearse frame = new Loguearse();
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
	public Loguearse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 417);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo_usuario = new JLabel("Usuario:");
		lbl_titulo_usuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_usuario.setBounds(112, 61, 96, 37);
		contentPane.add(lbl_titulo_usuario);
		
		txt_usuario = new JTextField();
		txt_usuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_usuario.setBounds(272, 47, 352, 46);
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
		txt_clave = new JPasswordField();
		txt_clave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_clave.setColumns(10);
		txt_clave.setBounds(272, 132, 352, 46);
		contentPane.add(txt_clave);
		
		JLabel lbl_titulo_clave = new JLabel("Clave:");
		lbl_titulo_clave.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_clave.setBounds(112, 146, 96, 37);
		contentPane.add(lbl_titulo_clave);
		
		JButton btn_entrar = new JButton("Entrar");
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_usuario = txt_usuario.getText();
				String texto_clave = String.valueOf(txt_clave.getPassword());
				if(texto_usuario.equalsIgnoreCase(usuario) &&
				   texto_clave.equals(clave))
				{
					JOptionPane.showMessageDialog(null, "bienvenido");
				}
				else {
					JOptionPane.showMessageDialog(null, "usuario o clave incorrecta");
				}
			}
		});
		btn_entrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_entrar.setBounds(270, 225, 152, 46);
		contentPane.add(btn_entrar);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "nos vemos otro dia");
				 System.exit(0); // sale de la aplicacion
				// dispose();
			}
		});
		btn_salir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_salir.setBounds(472, 225, 152, 46);
		contentPane.add(btn_salir);
	}
}
