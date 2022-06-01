package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class EjemploComboPlato extends JFrame {

	private JPanel contentPane;
	private JTextField txt_preciop1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploComboPlato frame = new EjemploComboPlato();
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
	public EjemploComboPlato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_preciop1 = new JTextField();
		txt_preciop1.setEditable(false);
		txt_preciop1.setBounds(441, 78, 201, 46);
		contentPane.add(txt_preciop1);
		
		JComboBox<Plato> cb_plato1 = new JComboBox<Plato>();
		cb_plato1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Plato pseleccionado = (Plato)cb_plato1.getSelectedItem();
			    double precio = pseleccionado.getPreciop();
			    txt_preciop1.setText(String.valueOf(precio));
			}
		});
		Plato p11 = new Plato("arroz", 4.0);
		Plato p12 = new Plato("Ensalada", 3.5);
		Plato p13 = new Plato("sopa", 3.0);
		cb_plato1.addItem(p11);
		cb_plato1.addItem(p12);
		cb_plato1.addItem(p13);
		
		
		cb_plato1.setBounds(114, 79, 201, 46);
		contentPane.add(cb_plato1);

		txt_preciop1.setColumns(10);
	}
}
