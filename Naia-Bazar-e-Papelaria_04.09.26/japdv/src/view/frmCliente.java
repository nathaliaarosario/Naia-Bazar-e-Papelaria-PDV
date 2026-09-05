package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ClienteController;
import model.Clientes;
import utils.Validador;

public class frmCliente extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente dialog = new frmCliente();
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
	// ============================================
	// Titulo
	// ============================================
	public frmCliente() {
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(104, 15, 23));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmCliente.class.getResource("/img/clientes.png")));
		setTitle("Clientes");
		getContentPane().setLayout(null);
		setBounds(100, 100, 546, 335);

		// ============================================
		// iniciar centralizado
		// ============================================
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		// ============================================

		// ============================================
		// Criar objeto Controller
		// ============================================
		ClienteController controller = new ClienteController();

		// ============================================
		// Criar objeto Cliente
		// ============================================
		Clientes cliente = new Clientes();

		// ============================================
		// Nome
		// ============================================
		txtNome = new JTextField();
		txtNome.setBounds(96, 51, 247, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		// Validação do número máximo de caracteres
		txtNome.setDocument(new Validador(50));

		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(37, 57, 45, 14);
		getContentPane().add(lblNome);

		// ============================================
		// Fone
		// ============================================
		JLabel lblFone = new JLabel("Fone");
		lblFone.setForeground(new Color(255, 255, 255));
		lblFone.setBounds(37, 101, 45, 14);
		getContentPane().add(lblFone);

		txtFone = new JTextField();
		txtFone.setColumns(10);
		txtFone.setBounds(96, 95, 379, 20);
		getContentPane().add(txtFone);
		// Validação do número máximo de caracteres
		txtFone.setDocument(new Validador(20));

		// ============================================
		// Email
		// ============================================
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBounds(37, 145, 45, 14);
		getContentPane().add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(96, 139, 379, 20);
		getContentPane().add(txtEmail);
		// Validação do número máximo de caracteres
		txtEmail.setDocument(new Validador(50));

		// ============================================
		// CPF
		// ============================================
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(96, 188, 379, 20);
		getContentPane().add(txtCPF);

		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setForeground(new Color(255, 255, 255));
		lblCPF.setBounds(37, 191, 45, 14);
		getContentPane().add(lblCPF);

		// ============================================
		// Botão cadastrar
		// ============================================
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setBounds(37, 234, 111, 23);
		getContentPane().add(btnCadastrar);
		getContentPane().setLayout(null);

		JLabel lblID = new JLabel("ID");
		lblID.setForeground(new Color(255, 255, 255));
		lblID.setBounds(37, 17, 45, 14);
		getContentPane().add(lblID);

		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setColumns(10);
		txtID.setBounds(96, 11, 86, 20);
		getContentPane().add(txtID);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setBounds(353, 50, 111, 23);
		getContentPane().add(btnBuscar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBackground(new Color(255, 255, 255));
		// ===========================================================
		// CRUD - editar cliente
		// ===========================================================
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Preencha o nome do Cliente");
					txtNome.requestFocus();
				} else if (txtCPF.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Preencha o CPF do Cliente");
				} else {
					// Lógica principal se os campos obrigatórios estiverem preenchidos
					// Tranferir os dados da tela para o Model
					cliente.setIDClientes(Integer.parseInt(txtID.getText()));
					cliente.setNome(txtNome.getText());
					cliente.setFone(txtFone.getText());
					cliente.setEmail(txtEmail.getText());
					cliente.setCPF(txtCPF.getText());

					// Enviar o objeto para o controller
					controller.editarCliente(cliente);

					// Mensagem para o usuario
					JOptionPane.showMessageDialog(null, "Dados do cliente alterados com sucesso");

					// limpar os campos
					limparCampos();
				}
			}
		});
		btnEditar.setBounds(206, 234, 111, 23);
		getContentPane().add(btnEditar);

		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBackground(new Color(255, 255, 255));
		// =======================================================
		// CRUD - Deletar Cliente
		// =======================================================
		btnApagar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Validação
				if (txtNome.getText().isBlank()) {
					// Mensagem para o usuario
					JOptionPane.showMessageDialog(null, "Digite o nome do Cliente");
					txtNome.requestFocus();
				} else {
					// capturar o id do fornecedor
					int idClientes = Integer.parseInt(txtID.getText());

					// Confirmação de exclusão
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar\n este cliente?",
							"Atenção!", JOptionPane.YES_OPTION);
					if (resposta == JOptionPane.YES_OPTION) {
						// exluir através do controller
						controller.Apagar(idClientes);

						// limpar os campos
						limparCampos();

						// Mensagem para o usuario
						JOptionPane.showMessageDialog(null, "Cliente apagado com sucesso.");

					}
				}
			}
		});
		// ===========================================================
		btnApagar.setBounds(364, 234, 111, 23);
		getContentPane().add(btnApagar);
		// ============================================

		// =============================================
		// CRUD - Cadastrar Cliente
		// =============================================
		btnCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Preencha o nome do Cliente");
					txtNome.requestFocus();
				} else if (txtCPF.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Preencha o CPF do Cliente");
				} else {
					try {
						// Transferir os dados da tela para o objeto
						cliente.setNome(txtNome.getText());
						cliente.setFone(txtFone.getText());
						cliente.setEmail(txtEmail.getText());
						cliente.setCPF(txtCPF.getText());
						// enviar o objeto para o controller
						controller.adicionar(cliente);
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
						// limpar os campos
						limparCampos();

					} catch (Exception e2) {
						System.out.println(e2);
					}

				}
			}

		});
		// Fim - CRUD Cadastrar ======================================

		// =============================================
		// CRUD - Buscar Cliente
		// =============================================
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Validação
				if (txtNome.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Informe o nome do fornecedor");
					txtNome.requestFocus();
				} else {
					// Lógica principal

					// Capturar por nome para busca
					String nome = txtNome.getText();

					// Instanciar (criar) o forncedor execultando a busca através do controller
					Clientes cliente = controller.buscar(nome);

					// se existir um fornecedor cadastrado
					if (cliente != null) {
						// setar os campos do formulário
						txtID.setText(String.valueOf(cliente.getIDClientes()));
						txtNome.setText(cliente.getNome());
						txtFone.setText(cliente.getFone());
						txtEmail.setText(cliente.getEmail());
						txtCPF.setText(cliente.getCPF());
					}

					else {
						JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
						limparCampos();
					}

				}
			}
		});
		// Fim ===================================================

	}// Fim do contrsutor ========================================

	// ===========================================================
	// Limpar campos
	// ===========================================================
	void limparCampos() {
		txtID.setText(null);
		txtNome.setText(null);
		txtFone.setText(null);
		txtEmail.setText(null);
		txtCPF.setText(null);
		txtNome.requestFocus();
	}
}
