package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listarCeramicas extends JDialog implements ActionListener {
	private JButton btnListar;
	private JTextArea txtS;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listarCeramicas dialog = new listarCeramicas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listarCeramicas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 210);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(107, 232, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(234, 232, 89, 23);
		getContentPane().add(btnListar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		//Declaracion de ceramicas
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
		
		//Salida en el txtS
		txtS.setText("LISTA DE CERAMICOS\n\n");
		txtS.append("Modelo\t:   "+ "cinzas Plus"   +"\n");
		txtS.append("Precio\t:   S/  "  +  precio0  +"\n");
		txtS.append("Ancho  (cm)\t:   "+   ancho0 +"\n");
		txtS.append("Largo  (cm)\t:   " +  largo0  +"\n");
		txtS.append("Espesor  (cm)\t:   "+  espesor0  +"\n");
		txtS.append("Contenido\t:   "+  contenido0  +"\n\n");
		
		txtS.append("Modelo\t:   "+ "Luxury"   +"\n");
		txtS.append("Precio\t:   S/  "  +  precio1  +"\n");
		txtS.append("Ancho  (cm)\t:   "+   ancho1 +"\n");
		txtS.append("Largo  (cm)\t:   " +  largo1  +"\n");
		txtS.append("Espesor  (cm)\t:   "+  espesor1  +"\n");
		txtS.append("Contenido\t:   "+  contenido1  +"\n\n");
		
		txtS.append("Modelo\t:   "+ "Austria"   +"\n");
		txtS.append("Precio\t:   S/  "  +  precio2  +"\n");
		txtS.append("Ancho  (cm)\t:   "+   ancho2 +"\n");
		txtS.append("Largo  (cm)\t:   " +  largo2  +"\n");
		txtS.append("Espesor  (cm)\t:   "+  espesor2  +"\n");
		txtS.append("Contenido\t:   "+  contenido2  +"\n\n");
		
		txtS.append("Modelo\t:   "+ "Yungay Mix"   +"\n");
		txtS.append("Precio\t:   S/  "  +  precio3  +"\n");
		txtS.append("Ancho  (cm)\t:   "+   ancho3 +"\n");
		txtS.append("Largo  (cm)\t:   " +  largo3  +"\n");
		txtS.append("Espesor  (cm)\t:   "+  espesor3 +"\n");
		txtS.append("Contenido\t:   "+  contenido3  +"\n\n");
		
		txtS.append("Modelo\t:   "+ "Thalía"   +"\n");
		txtS.append("Precio\t:   S/  "  +  precio4  +"\n");
		txtS.append("Ancho  (cm)\t:   "+   ancho4 +"\n");
		txtS.append("Largo  (cm)\t:   " +  largo4  +"\n");
		txtS.append("Espesor  (cm)\t:   "+  espesor4  +"\n");
		txtS.append("Contenido\t:   "+  contenido4  +"\n\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {	
	}
}
