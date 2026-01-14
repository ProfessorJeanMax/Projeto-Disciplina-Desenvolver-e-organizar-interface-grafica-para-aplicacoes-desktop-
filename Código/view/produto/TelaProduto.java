package projeto_base.view.produto;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaProduto extends JPanel {

    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtEstoque;

    public TelaProduto() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        txtDescricao = new JTextField(15);
        txtPreco = new JTextField(15);
        txtEstoque = new JTextField(15);

        add(new JLabel("Descrição"));
        add(txtDescricao);

        add(new JLabel("Preço"));
        add(txtPreco);

        add(new JLabel("Estoque"));
        add(txtEstoque);

    }

    // ===== GETTERS =====
    public JTextField getTxtDescricao() {
        return txtDescricao;
    }

    public JTextField getTxtPreco() {
        return txtPreco;
    }

    public JTextField getTxtEstoque() {
        return txtEstoque;
    }

    public void setTxtDescricao(JTextField txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public void setTxtPreco(JTextField txtPreco) {
        this.txtPreco = txtPreco;
    }

    public void setTxtEstoque(JTextField txtEstoque) {
        this.txtEstoque = txtEstoque;
    }

    
}
