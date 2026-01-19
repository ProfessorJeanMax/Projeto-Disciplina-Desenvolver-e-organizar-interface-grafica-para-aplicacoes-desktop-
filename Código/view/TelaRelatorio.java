package projeto_base.view;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import projeto_base.controller.RelatorioController;

public class TelaRelatorio extends JDialog {

    protected JTable tabela;
    protected RelatorioController controller;

    public TelaRelatorio(JFrame parent, RelatorioController controller) {
        super(parent, true);
        this.controller = controller;

        configurarJanela(parent);
        inicializarComponentes();

        controller.setView(this);
    }

    protected void configurarJanela(JFrame parent) {
        setSize(600, 400);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    protected void inicializarComponentes() {
        setLayout(new BorderLayout());

        tabela = new JTable();
        tabela.setDefaultEditor(Object.class, null); // somente leitura
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }

    public JTable getTabela() {
        return tabela;
    }
}
