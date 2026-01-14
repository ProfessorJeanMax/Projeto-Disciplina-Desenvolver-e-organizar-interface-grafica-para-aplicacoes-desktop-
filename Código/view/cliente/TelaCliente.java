package projeto_base.view.cliente;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCliente extends JPanel {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JTextField txtEndereco;

    public TelaCliente() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        txtNome = new JTextField(15);
        txtCpf = new JTextField(15);
        txtTelefone = new JTextField(15);
        txtEmail = new JTextField(15);
        txtEndereco = new JTextField(15);

        add(new JLabel("Nome"));
        add(txtNome);

        add(new JLabel("CPF"));
        add(txtCpf);

        add(new JLabel("Telefone"));
        add(txtTelefone);

        add(new JLabel("Email"));
        add(txtEmail);

        add(new JLabel("Endereço"));
        add(txtEndereco);
    }

    // ===== Getters =====
    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtEndereco() {
        return txtEndereco;
    }

    // ===== Setters (NOVO) =====
    public void setTxtNome(String nome) {
        txtNome.setText(nome);
    }

    public void setTxtCpf(String cpf) {
        txtCpf.setText(cpf);
    }

    public void setTxtTelefone(String telefone) {
        txtTelefone.setText(telefone);
    }

    public void setTxtEmail(String email) {
        txtEmail.setText(email);
    }

    public void setTxtEndereco(String endereco) {
        txtEndereco.setText(endereco);
    }
}
