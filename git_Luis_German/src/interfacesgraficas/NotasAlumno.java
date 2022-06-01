package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class NotasAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_nota1;
	private JTextField txt_nota2;
	private JTextField txt_nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasAlumno frame = new NotasAlumno();
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
	public NotasAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titulo_nombre = new JLabel("Nombre");
		lbl_titulo_nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_nombre.setBounds(117, 107, 97, 30);
		contentPane.add(lbl_titulo_nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_nombre.setBounds(275, 107, 369, 34);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lbl_titulo_nota1 = new JLabel("Nota1");
		lbl_titulo_nota1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_nota1.setBounds(117, 171, 97, 30);
		contentPane.add(lbl_titulo_nota1);
		
		txt_nota1 = new JTextField();
		txt_nota1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_nota1.setColumns(10);
		txt_nota1.setBounds(275, 171, 369, 34);
		contentPane.add(txt_nota1);
		
		JLabel lbl_titulo_nota2 = new JLabel("Nota2");
		lbl_titulo_nota2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_nota2.setBounds(117, 235, 97, 30);
		contentPane.add(lbl_titulo_nota2);
		
		txt_nota2 = new JTextField();
		txt_nota2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_nota2.setColumns(10);
		txt_nota2.setBounds(275, 235, 369, 34);
		contentPane.add(txt_nota2);
		
		JLabel lbl_titulo_3 = new JLabel("Nota3");
		lbl_titulo_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_3.setBounds(117, 301, 97, 30);
		contentPane.add(lbl_titulo_3);
		
		txt_nota3 = new JTextField();
		txt_nota3.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_nota3.setColumns(10);
		txt_nota3.setBounds(275, 301, 369, 34);
		contentPane.add(txt_nota3);
		
		JLabel lbl_titulo_media = new JLabel("Media");
		lbl_titulo_media.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo_media.setBounds(117, 379, 97, 30);
		contentPane.add(lbl_titulo_media);
		
		JLabel lbl_resultado_media = new JLabel("0.0");
		lbl_resultado_media.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_resultado_media.setBounds(275, 379, 369, 30);
		contentPane.add(lbl_resultado_media);
		
		JButton btn_calcular = new JButton("Calcular");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texton1 = txt_nota1.getText();
				String texton2 = txt_nota2.getText();
				String texton3 = txt_nota3.getText();
				double n1 = Double.valueOf(texton1);
				double n2 = Double.valueOf(texton2);
				double n3 = Double.valueOf(texton3);
				double[] misnotas = new double[3];
				misnotas[0] = n1;
				misnotas[1] = n2;
				misnotas[2] = n3;
				String nombre = txt_nombre.getText();
				Alumno a1 = new Alumno(nombre,misnotas);
				double media = a1.calcularMedia();
				DecimalFormat df = new DecimalFormat("#.00");
				lbl_resultado_media.setText(String.valueOf(df.format(media)));
			}
		});
		btn_calcular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_calcular.setBounds(477, 419, 168, 42);
		contentPane.add(btn_calcular);
	}
}
