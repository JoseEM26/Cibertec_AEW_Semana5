	package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ceramicas extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	private JMenu mnNewMenu_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ceramicas frame = new Ceramicas();
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
	public Ceramicas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 393);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("Consultar cer\u00E1mico");
		mnNewMenu_2.addActionListener(this);
		mnNewMenu_1.add(mnNewMenu_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		JMenu mnNewMenu_2_1 = new JMenu("Modificar cer\u00E1mico");
		mnNewMenu_1.add(mnNewMenu_2_1);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		JMenu mnNewMenu_2_2 = new JMenu("Listar cer\u00E1micos");
		mnNewMenu_1.add(mnNewMenu_2_2);
		
		JMenu mnNewMenu_1_1 = new JMenu("Venta");
		menuBar.add(mnNewMenu_1_1);
		
		JMenu mnNewMenu_4 = new JMenu("Vender");
		mnNewMenu_1_1.add(mnNewMenu_4);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1_1.add(separator_2);
		
		JMenu mnNewMenu_2_3 = new JMenu("Generar reportes");
		mnNewMenu_1_1.add(mnNewMenu_2_3);
		
		JMenu mnNewMenu_1_2 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_1_2);
		
		JMenu mnNewMenu_2_4 = new JMenu("Configurar descuentos");
		mnNewMenu_1_2.add(mnNewMenu_2_4);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1_2.add(separator_3);
		
		JMenu mnNewMenu_2_5 = new JMenu("Configurar obsequios");
		mnNewMenu_1_2.add(mnNewMenu_2_5);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1_2.add(separator_4);
		
		JMenu mnNewMenu_2_6 = new JMenu("Configurar cantidad \u00F3ptima");
		mnNewMenu_1_2.add(mnNewMenu_2_6);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1_2.add(separator_5);
		
		JMenu mnNewMenu_2_7 = new JMenu("Configurar cuota diaria");
		mnNewMenu_1_2.add(mnNewMenu_2_7);
		
		JMenu mnNewMenu_1_3 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1_3);
		
		JMenu mnNewMenu_2_8 = new JMenu("Acerca de Tienda");
		mnNewMenu_1_3.add(mnNewMenu_2_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnNewMenu_2) {
			actionPerformedMnNewMenu_3(e);
		}
	}
	protected void actionPerformedMnNewMenu_3(ActionEvent e) {
		consultaCeramica consultaCeramicap=new consultaCeramica();
		consultaCeramicap.setVisible(true);
		
		
	}
}
