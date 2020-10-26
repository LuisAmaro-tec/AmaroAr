import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfazLoginArray extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazLoginArray frame = new InterfazLoginArray();
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
	public InterfazLoginArray() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Usuario;
				String Contra;
				String Resultado;
				boolean varResult;
				boolean varResult1;
				
				List<String> varListaUsuario = new ArrayList<String>();

				varListaUsuario.add("Luis");
				varListaUsuario.add("Jordan");
				varListaUsuario.add("Poncho");
				varListaUsuario.add("Oziel");
				
				List<String> varListaContra = new ArrayList<String>();

				varListaContra.add("1234");
				varListaContra.add("4321");
				varListaContra.add("6789");
				varListaContra.add("9876");
				
				Usuario = txtUsuario.getText();
				Contra = txtContra.getText();
				
				varResult = varListaUsuario.contains(Usuario);
				varResult1 = varListaContra.contains(Contra);
				
				if(varResult == true && varResult1 == true)
				{
					Resultado = "Ingreso exitoso";
				}
				else
				{
					Resultado = "Usuario o contrasena incorrecta";
				}
				JOptionPane.showMessageDialog(null, Resultado);
				
				txtUsuario.setText(null); 
				txtContra.setText(null);
			}
		});
		btnIngresar.setBounds(172, 181, 89, 23);
		contentPane.add(btnIngresar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(205, 60, 111, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContra = new JTextField();
		txtContra.setBounds(205, 110, 111, 20);
		contentPane.add(txtContra);
		txtContra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario :");
		lblNewLabel.setBounds(98, 63, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a :");
		lblNewLabel_1.setBounds(84, 113, 86, 14);
		contentPane.add(lblNewLabel_1);
	}
}
