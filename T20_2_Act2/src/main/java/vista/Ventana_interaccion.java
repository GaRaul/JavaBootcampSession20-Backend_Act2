package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Ventana_interaccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_interaccion frame = new Ventana_interaccion();
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
	public Ventana_interaccion() {
		setTitle("Ventana con interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Has pulsado: ");
		lblTexto.setBounds(49, 100, 139, 14);
		contentPane.add(lblTexto);
		
		JButton btnBoton1 = new JButton("Botón 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Has pulsado: Boton 1");
			}
		});
		btnBoton1.setBounds(198, 96, 89, 23);
		contentPane.add(btnBoton1);
		
		JButton btnBoton2 = new JButton("Botón 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Has pulsado: Boton 2");
			}
		});
		btnBoton2.setBounds(297, 96, 89, 23);
		contentPane.add(btnBoton2);
	}
}
