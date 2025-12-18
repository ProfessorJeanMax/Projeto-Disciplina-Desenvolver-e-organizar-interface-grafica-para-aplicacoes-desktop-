package projeto_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tsije
 */
//
public class TelaCadastro extends JDialog {

//    public TelaCadastro() {;
//        initComponents();
//    }
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ===== Componentes (Variaveis) =====
    private JLabel lblNome, lblEmail, lblTelefone, lblCpf, lblEndereco;
    private JTextField txtNome, txtEmail, txtTelefone, txtCpf, txtEndereco;
    private JButton btnSalvar, btnLimpar, btnSair;

    // ===== Construtor =====
    public TelaCadastro(JFrame parent) {
        super(parent, "Cadastro de Cliente", true);
        configurarJanela(parent);
        inicializarComponentes();
        organizarLayout();
        adicionarEventos();
    }

    // ===== Passo 3 – Propriedades do JFrame =====
    private void configurarJanela(JFrame parent) {
        setSize(500, 350);
        setLocationRelativeTo(parent);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // ===== Passo 4 e 5 – Criar componentes e botões =====
    private void inicializarComponentes() {
        lblNome = new JLabel("Nome: ");
        lblEmail = new JLabel("Email:");
        lblTelefone = new JLabel("Telefone:");
        lblCpf = new JLabel("CPF:");
        lblEndereco = new JLabel("Endereço:");

        txtNome = new JTextField(15);
        txtEmail = new JTextField(20);
        txtTelefone = new JTextField(20);
        txtCpf = new JTextField(20);
        txtEndereco = new JTextField(20);

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");
    }

    // ===== Passo 6 – Layout =====
    private void organizarLayout() {
        setLayout(new BorderLayout());

        JPanel painelCampos = new JPanel(new GridLayout(6, 2, 10, 10));
        painelCampos.setBackground(Color.red);
        painelCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelCampos.add(lblNome);
        painelCampos.add(txtNome);

        painelCampos.add(lblEmail);
        painelCampos.add(txtEmail);

        painelCampos.add(lblTelefone);
        painelCampos.add(txtTelefone);

        painelCampos.add(lblCpf);
        painelCampos.add(txtCpf);

        painelCampos.add(lblEndereco);
        painelCampos.add(txtEndereco);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        add(painelCampos, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    // ===== Passo 5 – Eventos =====
    private void adicionarEventos() {
        btnSalvar();
        btnLimpar();
        btnSair();
    }

    private void btnSalvar() {

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNome.getText().trim().isEmpty()
                        || txtEmail.getText().trim().isEmpty()
                        || txtTelefone.getText().trim().isEmpty()
                        || txtCpf.getText().trim().isEmpty()
                        || txtEndereco.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            TelaCadastro.this,
                            "Preencha todos os campos!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );

                    return;
                }

                JOptionPane.showMessageDialog(
                        TelaCadastro.this,
                        "Cliente cadastrado com sucesso!",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
        );
    }

    private void btnLimpar() {
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtEmail.setText("");
                txtTelefone.setText("");
                txtCpf.setText("");
                txtEndereco.setText("");
                txtNome.requestFocus();
            }
        });
    }

    private void btnSair() {
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
