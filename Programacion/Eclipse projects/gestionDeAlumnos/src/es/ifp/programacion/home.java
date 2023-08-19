package es.ifp.programacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;

public class home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Crear Alumno");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar Alumno");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mostrar alumnos");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(btnNewButton_3);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		frame.getContentPane().add(comboBox, BorderLayout.CENTER);
	}

}
