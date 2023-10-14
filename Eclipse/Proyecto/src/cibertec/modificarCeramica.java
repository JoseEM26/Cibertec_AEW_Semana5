package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class modificarCeramica extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modificarCeramica dialog = new modificarCeramica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificarCeramica() {
		setTitle("Consulta Ceramica");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 87, 14);
		contentPanel.add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 49, 87, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 91, 87, 14);
		contentPanel.add(lblAncho);
		
		JLabel lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 131, 87, 14);
		contentPanel.add(lblLargo);
		
		JLabel lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 174, 87, 14);
		contentPanel.add(lblEspesor);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 218, 87, 14);
		contentPanel.add(lblContenido);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(335, 45, 89, 23);
		contentPanel.add(btnGrabar);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(107, 46, 218, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.setBounds(107, 7, 218, 22);
		contentPanel.add(cboModelo);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(107, 88, 218, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(107, 128, 218, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(107, 171, 218, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setColumns(10);
		txtContenido.setBounds(107, 215, 218, 20);
		contentPanel.add(txtContenido);
		
			
		
	}
}
