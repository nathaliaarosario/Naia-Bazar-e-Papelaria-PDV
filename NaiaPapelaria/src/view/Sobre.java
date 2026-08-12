package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
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
	public Sobre() {
		getContentPane().setBackground(SystemColor.menu);
		setResizable(false);
		setModal(true);
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Naia Papelaria");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(22, 24, 102, 14);
		getContentPane().add(lblTitulo);

		JLabel lblDescricao = new JLabel("Sistema para gestão de estoque e PDV");
		lblDescricao.setBounds(22, 61, 317, 14);
		getContentPane().add(lblDescricao);

		JLabel lblAutor = new JLabel("Autor Nathalia Alves Rosário");
		lblAutor.setBounds(22, 95, 212, 14);
		getContentPane().add(lblAutor);

		JLabel lblVersao = new JLabel("Versão 1.0");
		lblVersao.setBounds(22, 136, 57, 14);
		getContentPane().add(lblVersao);

		JLabel lblMIT = new JLabel("");
		lblMIT.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblMIT.setBounds(354, 11, 64, 64);
		getContentPane().add(lblMIT);

		JLabel lblGithub = new JLabel("");
		lblGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		lblGithub.setBounds(22, 202, 32, 32);
		getContentPane().add(lblGithub);

		JLabel lblRepositorio = new JLabel("https://github.com/nathaliaarosario");
		lblRepositorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/nathaliaarosario");
			}
		});
		lblRepositorio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRepositorio.setForeground(Color.BLUE);
		lblRepositorio.setBounds(63, 202, 193, 28);
		getContentPane().add(lblRepositorio);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fechar o sobre
				dispose();
			}
		});
		btnOk.setBounds(329, 222, 89, 23);
		getContentPane().add(btnOk);

		// Centralizar
		setLocationRelativeTo(null);

	}// Fim do construtor

	// Função(método) para abrir um link no navegador padrão
	private void link(String url) {
		// a linha abaixo obtem o desktop do cliente
		Desktop desktop = Desktop.getDesktop();
		// uso do try cath(tratamento de exceções)
		try {
			// Objeto URI para acessar os métodos necessários poara estabeleceer uma conexão
			// com a URL (link)
			URI uri = new URI(url);
			// abrir o link no navegador padrão do cliente
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
