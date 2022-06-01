package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorTemperaturas2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_gradosc;
	private JTextField txt_gradosf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperaturas2 frame = new ConversorTemperaturas2();
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
	public ConversorTemperaturas2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_gradosc = new JTextField();
		txt_gradosc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					// todo lo que ponga aquí se hace cuando libero la tecla
					String texto = txt_gradosc.getText();
					if(! texto.isEmpty())
					{
					   double gradosc = Double.valueOf(texto);
					   double gradosf = (gradosc * 9.0/5.0) + 32.0;
					   txt_gradosf.setText(String.valueOf(gradosf));
					}
					else {
						txt_gradosf.setText(""); // la parte derecha se pone en blanco
					}
				    }
				catch(NumberFormatException e1)
				{
				    // e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"debes poner un numero");
				}
				
			}
		});
		txt_gradosc.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_gradosc.setBounds(67, 88, 231, 58);
		contentPane.add(txt_gradosc);
		txt_gradosc.setColumns(10);
		
		JLabel lbl_titulo_gradosc = new JLabel("GRADOS CENTIGRADOS");
		lbl_titulo_gradosc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_titulo_gradosc.setBounds(55, 37, 255, 45);
		contentPane.add(lbl_titulo_gradosc);
		
		JLabel lbl_titulo_gradosf = new JLabel("GRADOS FARENHEIT");
		lbl_titulo_gradosf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_titulo_gradosf.setBounds(417, 37, 255, 45);
		contentPane.add(lbl_titulo_gradosf);
		
		JLabel lbl_titulo_igual = new JLabel("=");
		lbl_titulo_igual.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_titulo_igual.setBounds(337, 108, 44, 45);
		contentPane.add(lbl_titulo_igual);
		
		txt_gradosf = new JTextField();
		txt_gradosf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					// todo lo que ponga aquí se hace cuando libero la tecla
					String texto = txt_gradosf.getText();
					if(! texto.isEmpty())
					{
						double gradosf = Double.valueOf(texto);
						double gradosc = (gradosf -32) * 5.0/9.0;
						txt_gradosc.setText(String.valueOf(gradosc));
					}
					else {
						txt_gradosc.setText(""); // la parte izquierda se pone en blanco
					}
			    }
				catch(NumberFormatException e1)
				{
					// e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"debes poner un numero");
				}
			}
		});
		txt_gradosf.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_gradosf.setColumns(10);
		txt_gradosf.setBounds(412, 88, 231, 58);
		contentPane.add(txt_gradosf);
	}
}
