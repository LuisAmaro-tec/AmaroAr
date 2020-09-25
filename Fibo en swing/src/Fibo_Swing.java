import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibo_Swing extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimer;
	private JTextField txtSegundo;
	private JTextField txtTamArreglo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibo_Swing frame = new Fibo_Swing();
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
	public Fibo_Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer Numero");
		lblNewLabel.setBounds(37, 46, 86, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Numero");
		lblNewLabel_1.setBounds(37, 91, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JList list_1 = new JList();
		list_1.setBounds(291, 56, 93, 93);
		contentPane.add(list_1);
		DefaultListModel Lista = new DefaultListModel();
		Lista.clear();
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              Lista.removeAllElements();
				
                int i = 0;
				int valor1;
				int valor2;
				int valor3;
				int Tam;
			
				System.out.println("Num: " + txtPrimer);
				System.out.println("Num: " + txtSegundo);
				
				 valor1 = Integer.parseInt(txtPrimer.getText());
				 valor2 = Integer.parseInt(txtSegundo.getText());
				 Tam = Integer.parseInt(txtTamArreglo.getText());
				 
				 
				 
				
				do {
					
					valor3 = valor1 + valor2;
					
					Lista.addElement(valor1 + " " + valor2 + " " + valor3);
					
					valor1=valor2;
					valor2= valor3;
					i= i + 1;
					
					list_1.setModel(Lista);
					
				}while(i <= Tam);
			}
		});
		btnAgregar.setBounds(125, 196, 155, 23);
		contentPane.add(btnAgregar);
		
		JLabel lblNewLabel_2 = new JLabel("Tama\u00F1o de la serie");
		lblNewLabel_2.setBounds(37, 134, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPrimer = new JTextField();
		txtPrimer.setBounds(161, 47, 86, 20);
		contentPane.add(txtPrimer);
		txtPrimer.setColumns(10);
		
		txtSegundo = new JTextField();
		txtSegundo.setBounds(161, 88, 86, 20);
		contentPane.add(txtSegundo);
		txtSegundo.setColumns(10);
		
		txtTamArreglo = new JTextField();
		txtTamArreglo.setBounds(161, 131, 86, 20);
		contentPane.add(txtTamArreglo);
		txtTamArreglo.setColumns(10);
		
		
		
	}
}
