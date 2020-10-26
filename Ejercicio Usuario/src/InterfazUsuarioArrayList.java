import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfazUsuario extends JFrame {

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
					InterfazUsuario frame = new InterfazUsuario();
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
	public InterfazUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
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
		
		JLabel lblNewLabel = new JLabel("Ususario :");
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a :");
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(35)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtContra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(199, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtContra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
