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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cuadrado extends JFrame {

	private JPanel contentPane;
	private JTextField txt_numero;
    private JLabel lb_resultado;
	/**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrado frame = new Cuadrado();
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
	public Cuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_numero = new JTextField();
		txt_numero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_numero.setBounds(325, 51, 201, 51);
		contentPane.add(txt_numero);
		txt_numero.setColumns(10);
		
		JLabel lb_numero = new JLabel("Numero");
		lb_numero.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lb_numero.setBounds(200, 41, 95, 60);
		contentPane.add(lb_numero);
		
		JButton bt_cuadrado = new JButton("Calcular Cuadrado");
		bt_cuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						String texto = txt_numero.getText();
						double numero = Double.valueOf(texto);
						double resultado = numero * numero;
						lb_resultado.setText(String.valueOf(resultado));
				    }
				catch (Exception e1)
				{
					// e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "debes escribir un numero");
				}
			}
		});
		bt_cuadrado.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		bt_cuadrado.setBounds(325, 139, 201, 40);
		contentPane.add(bt_cuadrado);
		
		lb_resultado = new JLabel("Cuadrado del numero");
		lb_resultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_resultado.setBounds(297, 224, 229, 121);
		contentPane.add(lb_resultado);
	}
}
