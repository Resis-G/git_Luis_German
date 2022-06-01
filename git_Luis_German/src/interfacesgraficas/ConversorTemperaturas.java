package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorTemperaturas extends JFrame {

	private JPanel contentPane;
	private JTextField txt_gradosc;
	private JLabel lb_kelvin;
	private JLabel lb_farenheit;
	//---------------------------------------
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperaturas frame = new ConversorTemperaturas();
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
	public ConversorTemperaturas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_gradosc = new JTextField();


		txt_gradosc.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_gradosc.setBounds(113, 45, 186, 52);
		contentPane.add(txt_gradosc);
		txt_gradosc.setColumns(10);
		
		lb_kelvin = new JLabel("grados kelvin");
		lb_kelvin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_kelvin.setBounds(113, 143, 186, 34);
		contentPane.add(lb_kelvin);
		
		JButton bt_convertir = new JButton("Convertir");
		bt_convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String texto = txt_gradosc.getText();
				double numero = Double.valueOf(texto);
				double kelvin = numero + 273.0;
				double farenheit = numero * 9.0/5.0 + 32.0;
				lb_farenheit.setText(String.valueOf(farenheit));
				lb_kelvin.setText(String.valueOf(kelvin));
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "escribe bien el numero");
				}
			}
		});
		bt_convertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt_convertir.setBounds(440, 235, 197, 52);
		contentPane.add(bt_convertir);
		
		JLabel lb_titulo_c = new JLabel("\u00BAC");
		lb_titulo_c.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_titulo_c.setBounds(316, 63, 56, 34);
		contentPane.add(lb_titulo_c);
		
		JLabel lb_titulo_k = new JLabel("\u00BAK");
		lb_titulo_k.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_titulo_k.setBounds(316, 158, 56, 34);
		contentPane.add(lb_titulo_k);
		
		JLabel lb_titulo_f = new JLabel("\u00BAF");
		lb_titulo_f.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_titulo_f.setBounds(316, 242, 56, 34);
		contentPane.add(lb_titulo_f);
		
		lb_farenheit = new JLabel("grados Farenheit");
		lb_farenheit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_farenheit.setBounds(113, 242, 186, 34);
		contentPane.add(lb_farenheit);
	}
}
