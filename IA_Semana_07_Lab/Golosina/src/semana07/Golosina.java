package semana07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.graalvm.compiler.nodes.NodeView.Default;

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

public class Golosina extends JFrame implements ActionListener {

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
	private JTextField txtPrecio;

	// Lanza la aplicación
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Golosina frame = new Golosina();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Golosina() {
		setTitle("Golosina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 11, 80, 14);
		contentPane.add(lblMarca);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 36, 80, 14);
		contentPane.add(lblCantidad);

		cboMarca = new JComboBox<String>();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] { "Cream Cracker", "Chomp", "P\u00EDcaras", "Dona Pepa" }));
		cboMarca.setBounds(100, 8, 100, 20);
		contentPane.add(cboMarca);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(308, 7, 116, 23);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(308, 32, 116, 23);
		contentPane.add(btnBorrar);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 61, 414, 190);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(210, 8, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
				txtCantidad = new JTextField();
				txtCantidad.setBounds(80, 33, 162, 20);
				contentPane.add(txtCantidad);
				txtCantidad.setColumns(10);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
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
		
		//Determinacion de Variables
		 double impCompra,impVenta,impDescuento,precio;
		 int obsequio, marca,cantidad;
		 
		 cantidad=Integer.parseInt(txtCantidad.getText());
		 marca=cboMarca.getSelectedIndex();
		 
		 
		 switch (marca) {
		 case 0:
			 impCompra= cantidad * Double.parseDouble(txtPrecio.getText());
			 break;
		 case 1:
			 impCompra= cantidad * Double.parseDouble(txtPrecio.getText());
			 break;
		 case 2:
			 impCompra= cantidad * Double.parseDouble(txtPrecio.getText());
			 break;
		 default:
			 impCompra= cantidad * Double.parseDouble(txtPrecio.getText());
			 break;
		 }
		 
		 
		 
		switch(cantidad) {
		 case 1: case 2:case 3:case 4:
			 impDescuento= impCompra*0.03;
			 break;
			 
		 case 6:case 7: case 8: case 5: case 9:
			 impDescuento=impCompra*0.07;
			 break;
		 case 10:case 11: case 12: case 13: case 14:
			 impDescuento=impCompra*0.11;
			 
		break;
			 default:
				 impDescuento=impCompra*0.15;
				 break;
		
		}
		
		switch(cantidad) {
		default:
			obsequio=4*cantidad;
			break;
		case 8:
		case 9:
		case 10:
		case 11:
			obsequio=2*cantidad;
			
			break;
			
			
		case 4:
		case 5:
		case 6:
		case 7:
			obsequio=6;
			break;
			
		case 1:
		case 2:
		case 3:
		  obsequio=3;
		  break;
		
		
		}
		impVenta=impCompra-impDescuento;
		
		
		
		txtS.setText("Importe de venta"+impVenta+"\n");
		txtS.append("Importe de descuento"+impDescuento+"\n");
		txtS.append("Importe de compra"+impCompra+"\n");
		txtS.append("obsequio"+obsequio+"\n");
		
		
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		int valor = cboMarca.getSelectedIndex();
		switch (valor) {
	case 0:
		txtPrecio.setText(""+9.0);
		break;
		
	case 1:
		txtPrecio.setText(""+7.4);
		break;
	case 2:
		txtPrecio.setText(""+8.6);
		break;  
	default:
		txtPrecio.setText(""+10.6);
	    break;
				
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}