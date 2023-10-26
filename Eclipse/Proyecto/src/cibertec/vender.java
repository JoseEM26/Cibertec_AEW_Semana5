package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vender extends JDialog implements ActionListener {
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JButton btnVender;
	private JTextArea txtS;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			vender dialog = new vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 39, 67, 14);
		getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 64, 67, 14);
		getContentPane().add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalia"}));
		cboModelo.setBounds(77, 7, 149, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(77, 36, 149, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(77, 61, 149, 20);
		getContentPane().add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(323, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(323, 35, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 92, 392, 143);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		int  valor=cboModelo.getSelectedIndex();
		switch(valor) {
		case 0:
			txtPrecio.setText(""+92.56);
			break;
		case 1:
			txtPrecio.setText(""+42.77);
			break;
		case 2:
			txtPrecio.setText(""+52.45);
			break;
		case 3:
			txtPrecio.setText(""+55.89);
			break;
		case 4:
			txtPrecio.setText(""+45.00);
			break;
		
		
		}
	}
	
	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad,uniObse;
		double precio0=Ceramicas.precio0;
		double precio1=Ceramicas.precio1;
		double precio2=Ceramicas.precio2;
		double precio3=Ceramicas.precio3;
		double precio4=Ceramicas.precio4;    
		double impCompra,impDesct,impPago;
		double porcentaje1=Ceramicas.porcentaje1;
		double porcentaje2=Ceramicas.porcentaje2;
		double porcentaje3=Ceramicas.porcentaje3;
		double porcentaje4=Ceramicas.porcentaje4;
		double cuotaDiario=Ceramicas.cuotaDiaria;
		String tipoObsequio=Ceramicas.tipoObsequio;
		int obsequioCantidad1=Ceramicas.obsequioCantidad1;
		int obsequioCantidad2=Ceramicas.obsequioCantidad2;
		int obsequioCantidad3=Ceramicas.obsequioCantidad3;
		int modelo,obsequio;
		
		
		//Entrada
		modelo=cboModelo.getSelectedIndex();
		cantidad=Integer.parseInt(txtCantidad.getText());
		
		//Proceso Importe de compra
		if(modelo==0) 
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
		
		else if(modelo==1) 
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
		
		else if(modelo==2) 
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
		
		else if(modelo==3) 
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
		
		else 
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
		
		//Proceso del Descuento
		switch(cantidad) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			impDesct=impCompra*(porcentaje1/100);
			break;
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			impDesct=impCompra*(porcentaje2/100);
			break;	
		case 11: 
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			impDesct=impCompra*(porcentaje3/100);
			break;
			
		default:
			impDesct=impCompra*(porcentaje4/100);
			break;
			
		}
		
       //obseequio
		switch(cantidad) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			obsequio=obsequioCantidad1;
			break;
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			obsequio=obsequioCantidad2;
			break;
			
		default:
			obsequio=obsequioCantidad3;
			break;
		
		}
		impPago=impCompra-impDesct;
		
	//SALIDAAA;;;
		txtS.setText("BOLETA DE VENTA"+"\n\n");
		txtS.append("Modelo\t\t\t:"+ cboModelo.getSelectedIndex() + "\n");
		txtS.append("Precio\t\t\t:"+ Double.parseDouble(txtPrecio.getText()) + "\n");
		txtS.append("Cantidad Adquirida\t\t:"+ cantidad + "\n");
		txtS.append("Importe De Compra\t\t:"+ String.format("%,8.2f",impCompra) + "\n");
		txtS.append("Importe de Descuento\t\t:"+ String.format("%,8.2f",impDesct) + "\n");
		txtS.append("Importe de Pagar\t\t:"+ String.format("%,8.2f",impPago) + "\n");
		txtS.append("Tipo de obsequio\t\t:"+ "Lapiceros" + "\n");
		txtS.append("Unidades obsequiadas\t\t:"+ obsequio + "\n");
			
			
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
