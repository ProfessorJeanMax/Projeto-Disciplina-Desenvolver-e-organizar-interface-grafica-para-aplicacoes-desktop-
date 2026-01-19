package projeto_base.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import projeto_base.controller.EditarController;

public class TelaExcluir extends JDialog {

    private final EditarController controller;

    public TelaExcluir(JFrame parent, EditarController controller) {
        super(parent, "Confirmar Exclusão", true);
        this.controller = controller;

        configurarJanela(parent);
        inicializarComponentes();
    }

    private void configurarJanela(JFrame parent) {
        setSize(400, 150);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {

        // ===== MENSAGEM =====
        JLabel lblMensagem = new JLabel(
                "Tem certeza que deseja excluir o registro selecionado?",
                JLabel.CENTER
        );
        add(lblMensagem, BorderLayout.CENTER);

        // ===== BOTÕES =====
        JButton btnExcluir = new JButton("Excluir");
        JButton btnCancelar = new JButton("Cancelar");

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnCancelar);

        add(painelBotoes, BorderLayout.SOUTH);

        // ===== AÇÕES =====
        btnExcluir.addActionListener(e -> {
            controller.excluir(); // delega ao controller
            dispose();
        });

        btnCancelar.addActionListener(e -> dispose());
    }
}
