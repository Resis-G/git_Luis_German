package interfacesgraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_preciop1;
	private JTextField txt_preciop2;
	private JTextField txt_preciop3;
    private JLabel lbl_resultado1;
    private JLabel lbl_resultado2;
    
    private JComboBox<Plato> cb_plato1;
    private JComboBox<Plato> cb_plato2;
    private JComboBox<Plato> cb_plato3;
    
    private Plato plato1Seleccionado;
    private Plato plato2Seleccionado;
    private Plato plato3Seleccionado;

	/**
	 * Launch the application.
	 */
    
    public void updateUI()
    {
    	if(plato1Seleccionado == null || plato2Seleccionado==null || plato3Seleccionado==null)
    	{
    		return;
    	}
    	try {
			// primero hay que recoger todos los datos
			String nombre = txt_nombre.getText();
			String nombrep1 = plato1Seleccionado.getNombrep();
			String nombrep2 = plato2Seleccionado.getNombrep();
			String nombrep3 = plato3Seleccionado.getNombrep();
			double preciop1 = plato1Seleccionado.getPreciop();
			double preciop2 = plato2Seleccionado.getPreciop();
			double preciop3 = plato3Seleccionado.getPreciop();
			//-------------------------------------------------
			// ahora se realizan los calculos----------------------
			Menu m1= new Menu(nombre,nombrep1,nombrep2, nombrep3, preciop1, preciop2, preciop3);
			double precioSinIva = m1.calcularTotalSinIva();
			double precioConIva = m1.calcularTotalConIva();
			// ------------ ahora se muestran los resultados------
			DecimalFormat df = new DecimalFormat("#.00");
			
			lbl_resultado1.setText(String.valueOf(df.format(precioSinIva)));
			lbl_resultado2.setText(String.valueOf(df.format(precioConIva)));
			}
			catch(NumberFormatException e1)
			{
				JOptionPane.showMessageDialog(null,"algún número está mal escrito, revísalo");
				lbl_resultado1.setText("0.0");
				lbl_resultado2.setText("0.0");
			}	
    }
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_nombre = new JLabel("Nombre");
		lb_nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_nombre.setBounds(113, 48, 138, 35);
		contentPane.add(lb_nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_nombre.setBounds(295, 48, 323, 35);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lbl_plato1 = new JLabel("plato1");
		lbl_plato1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_plato1.setBounds(113, 175, 138, 35);
		contentPane.add(lbl_plato1);
		
		JLabel lbl_plato2 = new JLabel("plato2");
		lbl_plato2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_plato2.setBounds(113, 260, 138, 35);
		contentPane.add(lbl_plato2);
		
		JLabel lbl_plato3 = new JLabel("plato3");
		lbl_plato3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_plato3.setBounds(113, 343, 138, 35);
		contentPane.add(lbl_plato3);
		
		JLabel lblNombreDePlato = new JLabel("Nombre de Plato");
		lblNombreDePlato.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombreDePlato.setBounds(295, 128, 323, 35);
		contentPane.add(lblNombreDePlato);
		
		JLabel lblPrecioDelPlato = new JLabel("Precio del Plato");
		lblPrecioDelPlato.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecioDelPlato.setBounds(660, 128, 323, 35);
		contentPane.add(lblPrecioDelPlato);
		
		txt_preciop1 = new JTextField();
		txt_preciop1.setEditable(false);
		txt_preciop1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_preciop1.setColumns(10);
		txt_preciop1.setBounds(660, 175, 323, 35);
		contentPane.add(txt_preciop1);
		
		txt_preciop2 = new JTextField();
		txt_preciop2.setEditable(false);
		txt_preciop2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_preciop2.setColumns(10);
		txt_preciop2.setBounds(660, 260, 323, 35);
		contentPane.add(txt_preciop2);
		
		txt_preciop3 = new JTextField();
		txt_preciop3.setEditable(false);
		txt_preciop3.setFont(new Font("Tahoma", Font.BOLD, 20));
		txt_preciop3.setColumns(10);
		txt_preciop3.setBounds(660, 343, 323, 35);
		contentPane.add(txt_preciop3);
		
		JLabel lbl_precio_sin_iva = new JLabel("precio sin iva");
		lbl_precio_sin_iva.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_precio_sin_iva.setBounds(113, 424, 161, 35);
		contentPane.add(lbl_precio_sin_iva);
		
		JLabel lbl_precio_Con_iva = new JLabel("precio con iva");
		lbl_precio_Con_iva.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_precio_Con_iva.setBounds(113, 469, 152, 35);
		contentPane.add(lbl_precio_Con_iva);
		
		lbl_resultado1 = new JLabel("0.0");
		lbl_resultado1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_resultado1.setBounds(299, 424, 312, 35);
		contentPane.add(lbl_resultado1);
		
		lbl_resultado2 = new JLabel("0.0");
		lbl_resultado2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_resultado2.setBounds(295, 469, 312, 35);
		contentPane.add(lbl_resultado2);
		
		JButton btn_calcular = new JButton("Calcular Precio");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateUI();			
				}
		});
		btn_calcular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_calcular.setBounds(660, 421, 288, 40);
		contentPane.add(btn_calcular);
		
		cb_plato1 = new JComboBox<Plato>();
		cb_plato1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// este código se haría cuando cambie de item
				plato1Seleccionado = (Plato)cb_plato1.getSelectedItem();
				String texto = String.valueOf(plato1Seleccionado.getPreciop());
				txt_preciop1.setText(texto);
				updateUI();
			}
		});
		Plato p11 = new Plato("arroz", 3.23);
		cb_plato1.addItem(p11);
		cb_plato1.addItem(new Plato("ensalada", 2.34));
		cb_plato1.addItem(new Plato ("sopa", 2.3));
		
		cb_plato1.setBounds(295, 175, 323, 35);
		contentPane.add(cb_plato1);
		
		cb_plato2 = new JComboBox<Plato>();
		cb_plato2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				plato2Seleccionado = (Plato)cb_plato2.getSelectedItem();
				String texto = String.valueOf(plato2Seleccionado.getPreciop());
				txt_preciop2.setText(texto);
				updateUI();
			}
		});
		Plato p21 = new Plato("pollo", 4.5);
		Plato p22 = new Plato("salmon", 5.2);
		cb_plato2.addItem(p21);
		cb_plato2.addItem(p22);
		cb_plato2.setBounds(295, 257, 323, 35);
		contentPane.add(cb_plato2);
		
		cb_plato3 = new JComboBox<Plato>();
		cb_plato3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				plato3Seleccionado = (Plato)cb_plato3.getSelectedItem();
				txt_preciop3.setText(String.valueOf(plato3Seleccionado.getPreciop()));
				updateUI();
			}
		});
		cb_plato3.setBounds(295, 347, 323, 35);
		Plato p31 = new Plato("cafe",1.20);
		Plato p32 = new Plato("postre", 2.0);
		cb_plato3.addItem(p31);
		cb_plato3.addItem(p32);
		contentPane.add(cb_plato3);
		
	}
}
