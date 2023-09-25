package semana04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.print.attribute.standard.JobImpressionsCompleted;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Tienda4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JLabel lblCantidad;
	private JLabel lblTipo;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnEliminar;
	private JComboBox cmbTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda4 frame = new Tienda4();
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
	public Tienda4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(74, 11, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(319, 10, 89, 23);
		contentPane.add(btnProcesar);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 14, 46, 14);
		contentPane.add(lblCantidad);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 46, 46, 14);
		contentPane.add(lblTipo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 398, 174);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(319, 42, 89, 23);
		contentPane.add(btnEliminar);
		
		cmbTipo = new JComboBox();
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Primor", "Dulzura", "tentaacion", "explosion"}));
		cmbTipo.setBounds(73, 42, 107, 22);
		contentPane.add(cmbTipo);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	//determinacion de variables
		int unidades,obsequio=0,tipo;
		double impCompra=0,impDescuento=0,impPagar;
	
	//Entrada
		tipo=cmbTipo.getSelectedIndex();
		unidades=Integer.parseInt(txtCantidad.getText());
		
	//Calcular el importe de compra
	   if (tipo == 0)
		   impCompra=unidades*8.5;
	   if (tipo == 1)
		   impCompra=unidades*10;
	   if (tipo == 2)
		   impCompra=unidades*7;
	   if (tipo == 3)
		   impCompra=unidades*12.5;	
		
	//calcular el importe de descuento
	   if (unidades<5)
		   impDescuento=impCompra*0.04;
	   if (unidades>=5 && unidades<10)
		   impDescuento=impCompra*0.065;
	   if (unidades>=10&& unidades<15)
		   impDescuento=impCompra*0.09;
	   if (unidades>=15)
		   impDescuento=impCompra*0.115;
		
	//calcular el importe a pagar
		if (unidades>250) 
			obsequio=unidades*3;
		if (unidades<250) 
			obsequio=unidades*2;
		
		impPagar=impCompra-impDescuento;
			
	//Salida
		txtS.setText("importe de compra:"+ impCompra+"\n");
		txtS.append("importe de descuento:"+ impDescuento+"\n");
		txtS.append("importe de pago:"+ impPagar+"\n");
		txtS.append("Obsequio:"+ obsequio +"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		txtCantidad.setText("");
		txtS.setText("");
		txtCantidad.requestFocus();
	}
}
