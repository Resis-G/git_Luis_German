package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;

public class VentanaArrayList extends JFrame {

	private JPanel contentPane;
    private JTextPane txt_alumnos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaArrayList frame = new VentanaArrayList();
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
	public VentanaArrayList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txt_alumnos = new JTextPane();		
		txt_alumnos.setFont(new Font("Tahoma", Font.BOLD, 20));
		JScrollPane scroll = new JScrollPane(txt_alumnos);
		scroll.setBounds(101, 64, 900, 87);
		contentPane.add(scroll);
		//---------------------------------------------------
		ArrayList<Alumno2> alumnos = new ArrayList<Alumno2>();
		alumnos.add(new Alumno2("pepe1","1345","1dam",10.0));
		alumnos.add(new Alumno2("pepe2","2345","1dam",20.0));
		alumnos.add(new Alumno2("pepe3","3345","1dam",30.0));
		alumnos.add(new Alumno2("pepe4","4345","1dam",40.0));
		alumnos.add(new Alumno2("pepe5","5345","1dam",50.0));
		alumnos.add(new Alumno2("pepe6","6345","1dam",60.0));
		//----------------------------------------------------
		
        actualizarPanel(alumnos);

	}

	private void actualizarPanel(ArrayList<Alumno2> alumnos) {
		String textoPanel = "";
		for (Alumno2 a : alumnos) {
			textoPanel = textoPanel + a.toString() + "\n"; 
		}
		txt_alumnos.setText(textoPanel);
	}
}
