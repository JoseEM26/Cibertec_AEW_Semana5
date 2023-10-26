package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class consultaCeramica extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox cbmModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultaCeramica dialog = new consultaCeramica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultaCeramica() {
		setTitle("listar ceramica");
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
		
		cbmModelo = new JComboBox();
		cbmModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa\t"}));
		cbmModelo.addActionListener(this);
		cbmModelo.setBounds(107, 7, 203, 22);
		contentPanel.add(cbmModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(107, 46, 203, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(107, 88, 203, 20);
		contentPanel.add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(107, 128, 203, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(107, 171, 203, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(107, 215, 203, 20);
		contentPanel.add(txtContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == cbmModelo) {
			actionPerformedCbmModelo(e);
		}
	}
	protected void actionPerformedCbmModelo(ActionEvent e) {
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
		
		
		
		
		int valor=cbmModelo.getSelectedIndex();
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
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
