package bvccbv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dsa extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dsa frame = new dsa();
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
	public dsa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(10, 11, 46, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(10, 36, 46, 14);
		contentPane.add(lblNumero2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(61, 8, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(61, 33, 86, 20);
		contentPane.add(txtN2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 414, 174);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//determinacion de varibales
			Integer N1,N2, multiplicacion;
			
		//Entrada
			N1 = Integer.parseInt(txtN1.getText());
			N2 = Integer.parseInt(txtN2.getText());
			
		//Proceso 
			multiplicacion = N1 * N2;
			
		//Salida
			txtS.setText("Operaciones pipipi pendejo si q no sabes\n");
			txtS.append("multiplicacion\t:" + multiplicacion + "\n");
			
				
	
			}
		});
		btnProcesar.setBounds(314, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
				txtN1.setText("");
				txtN2.setText("");
				txtN1.requestFocus();
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnEliminar.setBounds(314, 32, 89, 23);
		contentPane.add(btnEliminar);
	}
}
