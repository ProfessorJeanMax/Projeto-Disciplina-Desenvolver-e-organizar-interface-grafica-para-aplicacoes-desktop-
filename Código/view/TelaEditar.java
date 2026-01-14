package projeto_base.view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import projeto_base.controller.EditarController;

public class TelaEditar extends JDialog {

    private EditarController controller;
    private JPanel painelFormulario;

    public TelaEditar(JFrame parent, EditarController controller) {
        super(parent, true);
        this.controller = controller;

        configurarJanela(parent);
        inicializarComponentes();

        controller.setView(this);       // importante: controller conhece a view
        controller.configurarTela();    // controller organiza os campos na view
    }

    private void configurarJanela(JFrame parent) {
        setSize(600, 400);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {
        // painel central: formulário que será preenchido pelo controller
        painelFormulario = new JPanel();
        add(new JScrollPane(painelFormulario), BorderLayout.CENTER);

        // painel inferior: botões
        JPanel painelBotoes = new JPanel();
        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");

        btnSalvar.addActionListener(e -> controller.salvar());
        btnCancelar.addActionListener(e -> dispose());

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnCancelar);

        add(painelBotoes, BorderLayout.SOUTH);
    }

    public JPanel getPainelFormulario() {
        return painelFormulario;
    }
}
