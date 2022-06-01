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
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorDias extends JFrame {

	private JPanel contentPane;
	private JTextField txt_dias;
    private JTextPane txt_resultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDias frame = new ConversorDias();
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
	public ConversorDias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo_dias = new JLabel("Numero de D\u00EDas");
		lbl_titulo_dias.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_titulo_dias.setBounds(131, 58, 180, 43);
		contentPane.add(lbl_titulo_dias);
		
		txt_dias = new JTextField();
		txt_dias.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_dias.setBounds(389, 58, 281, 43);
		contentPane.add(txt_dias);
		txt_dias.setColumns(10);
		
		JButton btn_calcular = new JButton("Calcular");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String texto = txt_dias.getText();
					if(texto.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "debes escribir algo");
						return;
					}
					int total_dias = Integer.valueOf(texto);
					int anyos = total_dias / 365;
					int dias_restantes = total_dias % 365;
					int meses = dias_restantes/ 31;
					int dias = dias_restantes % 31;
				//--------------------------------------
					String texto_anyos = String.valueOf(anyos);
					String texto_meses = String.valueOf(meses);
					String texto_dias = String.valueOf(dias);
				//--------------------------------------
					String textoResultado =  texto + " dias equivalen a \n" + texto_anyos + " año/s \n" + texto_meses + " mes/es \n" + texto_dias + " dia/s \n"; 
					txt_resultado.setText(textoResultado);
				}
				catch(NumberFormatException e1)
				{
					// e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "debes poner un numero");
				}
			}
		});
		btn_calcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_calcular.setBounds(131, 179, 159, 33);
		contentPane.add(btn_calcular);
		
		txt_resultado = new JTextPane();
		txt_resultado.setBounds(389, 179, 281, 91);
		contentPane.add(txt_resultado);
	}
}
