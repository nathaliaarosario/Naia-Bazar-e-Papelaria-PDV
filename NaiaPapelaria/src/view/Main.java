package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Cursor;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Uso da biblioteca flatlaf(Vai deixar moderno a interface do Java - swing
		// moderno)
		FlatLightLaf.setup();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/Logo.png")));
		setResizable(false);
		setTitle("Naia Bazar e Papelaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 175, 523);
		panel.setBackground(new Color(89, 13, 20));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNTitulo =  new JLabel("Naia Papelaria");
		lblNTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNTitulo.setForeground(new Color(255, 255, 255));
		lblNTitulo.setBounds(74, 34, 101, 14);
		panel.add(lblNTitulo);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/img/Logo.png")));
		lblLogo.setBounds(10, 11, 64, 64);
		panel.add(lblLogo);

		JLabel lblNewLabel_2 = new JLabel("Sistema de PDV");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(84, 59, 74, 16);
		panel.add(lblNewLabel_2);

		JButton btnFornecedor = new JButton("Fornecedores");
		btnFornecedor.setBorderPainted(false);
		btnFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFornecedor.setForeground(new Color(255, 255, 255));
		btnFornecedor.setBackground(new Color(104, 15, 23));
		btnFornecedor.setHorizontalAlignment(SwingConstants.LEFT);
		btnFornecedor.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedor.png")));
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFornecedor.setBounds(10, 101, 155, 50);
		panel.add(btnFornecedor);

		JLabel lblDivisor = new JLabel("----------------------------");
		lblDivisor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivisor.setForeground(new Color(255, 255, 255));
		lblDivisor.setBounds(-2, 420, 177, 14);
		panel.add(lblDivisor);

		JButton btnSobre = new JButton("Sobre ");
		btnSobre.addActionListener(new ActionListener() {
			//Ativar a tela sobre
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
				
			}
		});
		btnSobre.setBorderPainted(false);
		btnSobre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSobre.setBackground(new Color(104, 15, 23));
		btnSobre.setForeground(new Color(255, 255, 255));
		btnSobre.setHorizontalAlignment(SwingConstants.LEFT);
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/informacoes.png")));
		btnSobre.setBounds(10, 445, 155, 50);
		panel.add(btnSobre);

		JButton btnPDV = new JButton("PDV");
		btnPDV.setBorderPainted(false);
		btnPDV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPDV.setBackground(new Color(104, 15, 23));
		btnPDV.setForeground(new Color(255, 255, 255));
		btnPDV.setIcon(new ImageIcon(Main.class.getResource("/img/pos.png")));
		btnPDV.setHorizontalAlignment(SwingConstants.LEFT);
		btnPDV.setBounds(10, 226, 155, 50);
		panel.add(btnPDV);

		JButton btnProduto = new JButton("Produto");
		btnProduto.setBorderPainted(false);
		btnProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnProduto.setBackground(new Color(104, 15, 23));
		btnProduto.setForeground(new Color(255, 255, 255));
		btnProduto.setIcon(new ImageIcon(Main.class.getResource("/img/material-escolar (1).png")));
		btnProduto.setHorizontalAlignment(SwingConstants.LEFT);
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProduto.setBounds(10, 165, 155, 50);
		panel.add(btnProduto);

		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBorderPainted(false);
		btnVendas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVendas.setBackground(new Color(104, 15, 23));
		btnVendas.setForeground(new Color(255, 255, 255));
		btnVendas.setIcon(new ImageIcon(Main.class.getResource("/img/bolsa-de-compras.png")));
		btnVendas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVendas.setBounds(10, 287, 155, 50);
		panel.add(btnVendas);

		JButton btnSair = new JButton("Sair");
		btnSair.setBorderPainted(false);
		btnSair.addActionListener(new ActionListener() {
			
			//Quando clicar no botão 
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Confrimar saída", JOptionPane.YES_NO_OPTION);
				//Apoio ao entendimento da lógica
				System.out.println(resposta);
				if (resposta == 0) {
					System.exit(0);
				} 
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBackground(new Color(104, 15, 23));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setIcon(new ImageIcon(Main.class.getResource("/img/sair.png")));
		btnSair.setBounds(10, 348, 155, 50);
		panel.add(btnSair);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 524, 784, 37);
		panel_1.setBackground(SystemColor.controlHighlight);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblMysql = new JLabel("MySQL Desconectado");
		lblMysql.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMysql.setIcon(new ImageIcon(Main.class.getResource("/img/novo-banco-de-dados.png")));
		lblMysql.setBounds(10, 11, 126, 20);
		panel_1.add(lblMysql);
		
		JLabel lblStatus = new JLabel("•");
		lblStatus.setIcon(new ImageIcon(Main.class.getResource("/img/circulo.png")));
		lblStatus.setBounds(146, 19, 5, 5);
		panel_1.add(lblStatus);

		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(new Color(0, 0, 0));
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard.setIcon(new ImageIcon(Main.class.getResource("/img/velocimetro.png")));
		lblDashboard.setBounds(201, 12, 124, 37);
		contentPane.add(lblDashboard);

		JButton btnCard4 = new JButton("");
		btnCard4.setBorderPainted(false);
		btnCard4.setBounds(185, 195, 191, 127);
		contentPane.add(btnCard4);

		JButton btnCard7 = new JButton("");
		btnCard7.setBorderPainted(false);
		btnCard7.setBounds(185, 332, 589, 180);
		contentPane.add(btnCard7);

		JButton btnCard1 = new JButton("");
		btnCard1.setBorderPainted(false);
		btnCard1.setBounds(185, 60, 191, 124);
		contentPane.add(btnCard1);

		JButton btnCard5 = new JButton("");
		btnCard5.setBorderPainted(false);
		btnCard5.setBounds(386, 195, 195, 127);
		contentPane.add(btnCard5);

		JButton btnCard6 = new JButton("");
		btnCard6.setBorderPainted(false);
		btnCard6.setBounds(591, 195, 183, 127);
		contentPane.add(btnCard6);

		JButton btnCard2 = new JButton("");
		btnCard2.setBorderPainted(false);
		btnCard2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCard2.setBounds(386, 59, 195, 127);
		contentPane.add(btnCard2);

		JButton btnCard3 = new JButton("");
		btnCard3.setBorderPainted(false);
		btnCard3.setBounds(591, 59, 183, 127);
		contentPane.add(btnCard3);

		JLabel lblCalendario = new JLabel("");
		lblCalendario.setIcon(new ImageIcon(Main.class.getResource("/img/calendario.png")));
		lblCalendario.setBounds(645, 25, 43, 19);
		contentPane.add(lblCalendario);
		
		lblData = new JLabel("");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblData.setBounds(678, 25, 96, 19);
		contentPane.add(lblData);

		// Iniciar centralizado
		setLocationRelativeTo(null);

		// Atualizar a data
		atualizarData();

		// Iniciar com a tela cheia
		// setExtendedState(JFrame.MAXIMIZED_BOTH);

	}// Fim do construtor

	// Função (método) para atualizar a data do sistema
	// private(segurança) - funciona apenas dentro da classe
	private void atualizarData() {
		//Obtem a data do sistema operacional
		LocalDate hoje = LocalDate.now();
		//Formatar a data dia/mês/ano(4 dígitos)
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Alterar o texto de lblData
		lblData.setText(hoje.format(formato));
	}
}
