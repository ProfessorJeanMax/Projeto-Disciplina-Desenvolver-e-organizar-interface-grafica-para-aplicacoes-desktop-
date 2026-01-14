package projeto_base.view;

import javax.swing.*;
import java.awt.*;

public class TelaSemDados extends JDialog {

    private boolean criarNovo = false;

    /**
     * @param parent JFrame pai
     */
    public TelaSemDados(JFrame parent) {
        super(parent, "Nenhum registro encontrado", true);
        setSize(350, 150);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        JLabel label = new JLabel(
            "<html><center>Nenhum registro encontrado.<br>Deseja criar um novo?</center></html>",
            SwingConstants.CENTER
        );

        JButton btnCriar = new JButton("Criar novo");
        JButton btnCancelar = new JButton("Cancelar");

        JPanel painel = new JPanel();
        painel.add(btnCriar);
        painel.add(btnCancelar);

        add(label, BorderLayout.CENTER);
        add(painel, BorderLayout.SOUTH);

        // Apenas define criarNovo como true e fecha a janela
        btnCriar.addActionListener(e -> {
            criarNovo = true;
            dispose();
        });

        btnCancelar.addActionListener(e -> dispose());
    }

    /**
     * Retorna true se o usuário clicou em "Criar novo"
     */
    public boolean isCriarNovo() {
        return criarNovo;
    }
}
