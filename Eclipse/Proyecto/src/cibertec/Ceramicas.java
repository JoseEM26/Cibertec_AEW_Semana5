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

public class Ceramicas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
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
		
		JMenu mnNewMenu_3 = new JMenu("Consultar cer\u00E1mico");
		mnNewMenu_1.add(mnNewMenu_3);
		
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

}
