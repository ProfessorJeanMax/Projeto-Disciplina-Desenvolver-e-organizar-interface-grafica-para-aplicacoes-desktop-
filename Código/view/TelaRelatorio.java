package projeto_base.view;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import projeto_base.controller.RelatorioController;

public class TelaRelatorio extends JDialog {

    private JTable tabela;
    private RelatorioController controller;

    public TelaRelatorio(JFrame parent, RelatorioController controller) {
        super(parent, true);
        this.controller = controller;

        configurarJanela(parent);
        inicializarComponentes();

        controller.setView(this);
    }

    private void configurarJanela(JFrame parent) {
        setSize(600, 400);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        tabela = new JTable();
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }

    public JTable getTabela() {
        return tabela;
    }
}
