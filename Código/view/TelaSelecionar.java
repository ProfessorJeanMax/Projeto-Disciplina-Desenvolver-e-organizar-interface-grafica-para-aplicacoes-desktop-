package projeto_base.view;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projeto_base.controller.RelatorioController;

public class TelaSelecionar extends TelaRelatorio {

    private JButton btnSelecionar;
    private JButton btnCancelar;
    private int linhaSelecionada = -1;

    public TelaSelecionar(JFrame parent, RelatorioController controller, String titulo) {
        super(parent, controller);
        setTitle(titulo);
        adicionarBotoes();
    }

    private void adicionarBotoes() {
        btnSelecionar = new JButton("Selecionar");
        btnCancelar = new JButton("Cancelar");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnSelecionar);
        painelBotoes.add(btnCancelar);

        add(painelBotoes, BorderLayout.SOUTH);

        btnSelecionar.addActionListener(e -> {
            linhaSelecionada = tabela.getSelectedRow();
            dispose();
        });

        btnCancelar.addActionListener(e -> {
            linhaSelecionada = -1;
            dispose();
        });
    }

    public int getLinhaSelecionada() {
        return linhaSelecionada;
    }

}
