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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class modificarCeramica extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox cboModelo;
	private JButton btnCerrar;

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
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(335, 45, 89, 23);
		contentPanel.add(btnGrabar);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(107, 46, 218, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa\t"}));
		cboModelo.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		String Modelo0=Ceramicas.modelo0;
		String Modelo1=Ceramicas.modelo1;
		String Modelo2=Ceramicas.modelo2;
		String Modelo3=Ceramicas.modelo3;
		String Modelo4=Ceramicas.modelo4;
		Double precio0=Ceramicas.precio0;
		Double precio1=Ceramicas.precio1;
		Double precio2=Ceramicas.precio2;
		Double precio3=Ceramicas.precio3;
		Double precio4=Ceramicas.precio4;
		Double ancho0=Ceramicas.ancho0;
		Double ancho1=Ceramicas.ancho1;
		Double ancho2=Ceramicas.ancho2;
		Double ancho3=Ceramicas.ancho3;
		Double ancho4=Ceramicas.ancho4;
		Double largo0=Ceramicas.largo0;
		Double largo1=Ceramicas.largo1;
		Double largo2=Ceramicas.largo2;
		Double largo3=Ceramicas.largo3;
		Double largo4=Ceramicas.largo4;
		Double espesor0=Ceramicas.espesor0;
		Double espesor1=Ceramicas.espesor1;
		Double espesor2=Ceramicas.espesor2;
		Double espesor3=Ceramicas.espesor3;
		Double espesor4=Ceramicas.espesor4;
		int contenido0=Ceramicas.contenido0;
		int contenido1=Ceramicas.contenido1;
		int contenido2=Ceramicas.contenido2;
		int contenido3=Ceramicas.contenido3;
		int contenido4=Ceramicas.contenido4;
		
		
		
		
		int valor=cboModelo.getSelectedIndex();
		switch(valor) {
		case 0:
			txtPrecio.setText(""+precio0);
			txtLargo.setText(""+largo0);
			txtEspesor.setText(""+espesor0);
			txtContenido.setText(""+contenido0);
			txtAncho.setText(""+ancho0);
			break;
			
		case 1:
			txtPrecio.setText(""+precio1);
			txtLargo.setText(""+largo1);
			txtEspesor.setText(""+espesor1);
			txtContenido.setText(""+contenido1);
			txtAncho.setText(""+ancho1);
			break;
			
		case 2:
			txtPrecio.setText(""+precio2);
			txtLargo.setText(""+largo2);
			txtEspesor.setText(""+espesor2);
			txtContenido.setText(""+contenido2);
			txtAncho.setText(""+ancho2);
			break;
			
		case 3:
			txtPrecio.setText(""+precio3);
			txtLargo.setText(""+largo3);
			txtEspesor.setText(""+espesor3);
			txtContenido.setText(""+contenido3);
			txtAncho.setText(""+ancho3);
			break;	
		
		case 4:
			txtPrecio.setText(""+precio4);
			txtLargo.setText(""+largo4);
			txtEspesor.setText(""+espesor4);
			txtContenido.setText(""+contenido4);
			txtAncho.setText(""+ancho4);
			break;
	}
}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
	}
}