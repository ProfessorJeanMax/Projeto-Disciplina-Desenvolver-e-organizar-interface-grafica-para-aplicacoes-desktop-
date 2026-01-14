package projeto_base.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import projeto_base.model.Cliente;
import projeto_base.model.Produto;
import projeto_base.model.Funcionario;

public class TelaSelecionar extends JDialog {

    private JTable tabela;
    private JButton btnSelecionar;
    private JButton btnCancelar;
    private int linhaSelecionada = -1;

    public TelaSelecionar(JFrame parent, String titulo) {
        super(parent, titulo, true);
        configurarJanela(parent);
        inicializar();
    }

    private void configurarJanela(JFrame parent) {
        setSize(600, 400);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void inicializar() {
        tabela = new JTable();
        JScrollPane scroll = new JScrollPane(tabela);

        btnSelecionar = new JButton("Selecionar");
        btnCancelar = new JButton("Cancelar");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnSelecionar);
        painelBotoes.add(btnCancelar);

        add(scroll, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Captura a linha selecionada
        btnSelecionar.addActionListener(e -> {
            linhaSelecionada = tabela.getSelectedRow();
            dispose();
        });

        btnCancelar.addActionListener(e -> {
            linhaSelecionada = -1;
            dispose();
        });
    }

    // ===== GETTERS =====
    public JTable getTabela() {
        return tabela;
    }

    public int getLinhaSelecionada() {
        return linhaSelecionada;
    }

    // ===== CONFIGURAR TABELAS =====

    public void configurarTabelaCliente(List<Cliente> lista) {
        String[] colunas = {"Nome", "CPF", "Telefone", "Email", "Endereço"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);
        for (Cliente c : lista) {
            model.addRow(new Object[]{c.getNome(), c.getCpf(), c.getTelefone(), c.getEmail(), c.getEndereco()});
        }
        tabela.setModel(model);
    }

    public void configurarTabelaProduto(List<Produto> lista) {
        String[] colunas = {"Descrição", "Preço", "Estoque"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);
        for (Produto p : lista) {
            model.addRow(new Object[]{p.getDescricao(), p.getPreco(), p.getEstoque()});
        }
        tabela.setModel(model);
    }

    public void configurarTabelaFuncionario(List<Funcionario> lista) {
        String[] colunas = {"Nome", "CPF", "Cargo", "Salário"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);
        for (Funcionario f : lista) {
            model.addRow(new Object[]{f.getNome(), f.getCpf(), f.getCargo(), f.getSalario()});
        }
        tabela.setModel(model);
    }
}
