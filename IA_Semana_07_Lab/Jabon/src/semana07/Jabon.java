package semana07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

public class Jabon extends JFrame implements ActionListener {

	// Declaración de variables
	private static final long serialVersionUID = 9206324162700448001L;
	private JPanel contentPane;
	private JLabel lblMarca;
	private JLabel lblCantidad;
	private JComboBox<String> cboMarca;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	// Lanza la aplicación
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jabon frame = new Jabon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Jabon() {
		setTitle("Jabon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 233);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 11, 47, 14);
		contentPane.add(lblMarca);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 36, 47, 14);
		contentPane.add(lblCantidad);

		cboMarca = new JComboBox<String>();
		cboMarca.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Palmolive Tripack", "Nivea Tripack", "Rexona Tripack", "Neko Tripack" }));
		cboMarca.setBounds(67, 8, 125, 20);
		contentPane.add(cboMarca);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(67, 33, 125, 20);
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
		scpScroll.setBounds(10, 61, 414, 123);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	// Procesa la pulsación del botón Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtCantidad.setText("");
		txtS.setText("");
		cboMarca.setSelectedIndex(0);
		txtCantidad.requestFocus();
	}

	// Procesa la pulsación del botón Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		int cantidad, marca;
		double importeCompra=0, impVenta=0, impDescuento=0, obsequio;

		cantidad = Integer.parseInt(txtCantidad.getText());
		marca = cboMarca.getSelectedIndex();

		switch (marca) {
		case 0:
			importeCompra = cantidad * 5.2;
		case 1:
			importeCompra = cantidad * 8.2;
		case 2:
			importeCompra = cantidad * 6.5;
		case 3:
			importeCompra = cantidad * 7.4;
			break;

		}
		
	  if (cantidad>=18) 
		  impDescuento=importeCompra*0.125;
	  
	  else if (cantidad>=12 && cantidad < 18)
	  impDescuento=importeCompra*0.10;
	  
	  else if (cantidad>=6 && cantidad < 12)
	  impDescuento=importeCompra*0.075;
	  
	  else 
		  impDescuento=importeCompra*0;
	  
	  
	  if (cantidad<12) 
		  obsequio=2*cantidad;
	
	  else if (cantidad>= 12 && cantidad< 24) 
		  obsequio=4*cantidad;
	  else if (cantidad>= 24 && cantidad< 36) 
		  obsequio=1*cantidad;
	  else
		  obsequio=2*cantidad;
	 impVenta=importeCompra-impDescuento;

	
	  txtS.setText("Importe de venta" + impVenta + "\n");
		txtS.append("Importe de descuento" + impDescuento + "\n");
		txtS.append("Importe de compra" + importeCompra + "\n");
		
		
		
		
		
		
		
		
		
		

	}
}