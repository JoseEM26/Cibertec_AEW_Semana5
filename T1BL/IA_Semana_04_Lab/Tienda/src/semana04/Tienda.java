package semana04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.rmi.server.UnicastRef;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Tienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 36, 46, 14);
		contentPane.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(66, 33, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 11, 46, 14);
		contentPane.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(66, 8, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnBorrar);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 64, 414, 117);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		scpScroll.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtPrecio.setText("");
		txtCantidad.setText("");
		txtS.setText("");
		txtPrecio.requestFocus();
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
	//Determinacion de Variables
		int cantidad ;
		double impCompra =0,impDesc =0,impPago;
		
	//Entrada
		cantidad = Integer.parseInt(txtCantidad.getText());
		  
	//Calcular el importe de compra
		if (cantidad >=1 && cantidad <=25 ) 
			impCompra = cantidad * 27.7;
		if (cantidad>=26 && cantidad<=50) 
			impCompra = cantidad * 25.5;
		if (cantidad>=51 && cantidad<=75) 
			impCompra = cantidad * 23.5;
		if (cantidad>76) 
			impCompra = cantidad * 21.5;
		
	//Calcular el importe descuento
		if (cantidad >50 ) 
			impDesc = impCompra * 0.15;
		if (cantidad <50 ) 
			impDesc = impCompra * 0.05;
	//Calucular el importe de pago
		impPago= impCompra - impDesc;
		
	//Salida
		txtS.setText("BOLETA DE VENTA\n\n");
		txtS.append("Importe de Compra\t:" + impCompra +"\n");
		txtS.append("Importe Descuento\t:" + impDesc +"\n");
		txtS.append("Importe de Pago\t:" + impPago +"\n");

		
		

	}
}
