package actividad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VoidRetorno extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JComboBox cbotipo;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoidRetorno frame = new VoidRetorno();
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
	public VoidRetorno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(87, 11, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("can");
		lblCantidad.setBounds(10, 14, 46, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblTipo = new JLabel("New label");
		lblTipo.setBounds(10, 40, 46, 14);
		contentPane.add(lblTipo);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			
			////////////////////////////////////////////////j
			
			
			
			
			
			
            ////////////////////////////////////////////////j
			public void actionPerformed(ActionEvent e) {
				// Declaración de variables locales
				int tp, can, car;
				double ic=0, id=0, ip=0;
				
				can=Integer.parseInt(txtCantidad.getText());
				tp=cbotipo.getSelectedIndex();
				
				switch(tp) {
				case 0:
					ic=can*8.5;
					break;
				case 1:
					ic=can*10;
					break;
				case 2:
					ic=can*7;
					break;
				case 3:
					ic=can*12.5;
					break;
				
				}
				
				if(can<5)
					id=ic*0.04;
				else if(can>=5 && can<10)
					id=ic*0.065;
				else if(can>=10 && can<15)
					id=ic*0.09;
				else
					id=ic*0.0115;
				
				
				ip=ic-id;
				
			txtS.append("Datos"+"\n");
			txtS.append("importe de compra"+ic+"\n");
			txtS.append("importe de descuento"+id+"\n");
			txtS.append("importe de pago"+ip+"\n");
				
				
				
				
			}
		});
		btnNewButton.setBounds(335, 10, 89, 23);
		contentPane.add(btnNewButton);
		
		cbotipo = new JComboBox();
		cbotipo.setModel(new DefaultComboBoxModel(new String[] {"Primor", "Dulzura", "Tentaci\u00F3n ", "Explosi\u00F3n "}));
		cbotipo.setBounds(87, 42, 30, 22);
		contentPane.add(cbotipo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 347, 142);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

}
