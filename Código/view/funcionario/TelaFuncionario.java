package projeto_base.view.funcionario;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFuncionario extends JPanel {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtCargo;
    private JTextField txtSalario;

    public TelaFuncionario() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        txtNome = new JTextField(15);
        txtCpf = new JTextField(15);
        txtCargo = new JTextField(15);
        txtSalario = new JTextField(15);

        add(new JLabel("Nome"));
        add(txtNome);

        add(new JLabel("CPF"));
        add(txtCpf);

        add(new JLabel("Cargo"));
        add(txtCargo);

        add(new JLabel("Salário"));
        add(txtSalario);
    }

    // ===== GETTERS =====
    public JTextField getTxtNome() { return txtNome; }
    public JTextField getTxtCpf() { return txtCpf; }
    public JTextField getTxtCargo() { return txtCargo; }
    public JTextField getTxtSalario() { return txtSalario; }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public void setTxtCpf(JTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    public void setTxtCargo(JTextField txtCargo) {
        this.txtCargo = txtCargo;
    }

    public void setTxtSalario(JTextField txtSalario) {
        this.txtSalario = txtSalario;
    }
    
    
}

