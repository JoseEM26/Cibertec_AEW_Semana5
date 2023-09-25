package cibertec;

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

public class Cilindro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNRadio;
	private JLabel lblAltura;
	private JTextField txtRadio;
	private JTextField txtAltura;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cilindro frame = new Cilindro();
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
	public Cilindro() {
		setTitle("Cilindro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNRadio = new JLabel("Radio");
		lblNRadio.setBounds(10, 11, 46, 14);
		contentPane.add(lblNRadio);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 45, 46, 14);
		contentPane.add(lblAltura);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(83, 8, 86, 20);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(83, 42, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 41, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 414, 180);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {     // Doble clic en bot�n Procesar
		
		// 1. Declaraci�n Variables
		double r, h, AT, AL, AB;
		
		// 2. Leer Datos
		r = Double.parseDouble(txtRadio.getText());
		h = Double.parseDouble(txtAltura.getText());
		
		// 3. Procesar
		AB = 3.1416 * r * r;
		AL = 2 * 3.1416 * r * h;
		AT = 2 * (AB + AL);
		
		// 4. Salida
		txtS.setText("DATOS DEL CILINDRO\n\n");
		txtS.append("�rea de la Base\t\t: " + String.format("%,8.2f",AB) + "\n");
		txtS.append("�rea Lateral\t\t: " + String.format("%,8.2f",AL) + "\n");
		txtS.append("�rea de Total\t\t: " + String.format("%,8.2f",AT) + "\n");
		
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) { 	// Doble clic en bot�n 
		
		txtAltura.setText("");
		txtRadio.setText("");
		txtS.setText("");
		txtRadio.requestFocus();
		
		
		
		
		
	}
}
