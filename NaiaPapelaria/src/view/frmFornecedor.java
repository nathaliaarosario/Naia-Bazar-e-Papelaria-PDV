package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmFornecedor extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFornecedor dialog = new frmFornecedor();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public frmFornecedor() {
		setResizable(false);
		setTitle("Fornecedores");
		setBounds(100, 100, 540, 480);

		// Iniciar centralizado
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(37, 107, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fone");
		lblNewLabel_1.setBounds(37, 165, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(37, 218, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(79, 105, 309, 17);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 163, 130, 17);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 216, 309, 17);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(22, 372, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(149, 372, 89, 23);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(278, 372, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnNewButton_3 = new JButton("Relatório");
		btnNewButton_3.setBounds(410, 372, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(37, 50, 46, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(79, 48, 89, 17);
		getContentPane().add(textField_3);
		
		JButton btnNewButton_3_1 = new JButton("Buscar");
		btnNewButton_3_1.setBounds(398, 103, 89, 23);
		getContentPane().add(btnNewButton_3_1);

	} // Fim do construtor
}
