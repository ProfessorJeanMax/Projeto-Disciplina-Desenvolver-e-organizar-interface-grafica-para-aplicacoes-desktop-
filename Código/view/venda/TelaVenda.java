package projeto_base.view.venda;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import projeto_base.model.Cliente;
import projeto_base.model.Funcionario;
import projeto_base.model.Produto;
import projeto_base.repository.ClienteRepository;
import projeto_base.repository.FuncionarioRepository;
import projeto_base.repository.ProdutoRepository;

public class TelaVenda extends JDialog {

    // =========================
    // COMPONENTES
    // =========================
    private JComboBox<Cliente> cbCliente;
    private JComboBox<Funcionario> cbFuncionario;
    private JComboBox<Produto> cbProduto;
    private JTextField txtQuantidade;
    private JTable tabelaItens;
    private JLabel lblTotal;
    private JLabel lblEstoque;

    private int totalVenda = 0;

    private JButton btnAdicionar;
    private JButton btnFinalizar;
    private JButton btnCancelar;

    public TelaVenda(JFrame parent) {
        super(parent, "Venda", true);
        configurarTela();
        carregarClientes();
        carregarFuncionarios();
        carregarProdutos();
        configurarEventos();

    }

    private void configurarTela() {
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        add(criarPainelTopo(), BorderLayout.NORTH);
        add(criarPainelCentro(), BorderLayout.CENTER);
        add(criarPainelRodape(), BorderLayout.SOUTH);
    }

    // =========================
    // TOPO – CLIENTE
    // =========================
    private JPanel criarPainelTopo() {
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        painel.add(new JLabel("Cliente:"));
        cbCliente = new JComboBox<>();
        cbCliente.setPreferredSize(new Dimension(200, 25));
        cbCliente.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);

                if (value instanceof Cliente) {
                    setText(((Cliente) value).getNome());
                }
                return this;
            }
        });
        painel.add(cbCliente);

        painel.add(new JLabel("Funcionário:"));
        cbFuncionario = new JComboBox<>();
        cbFuncionario.setPreferredSize(new Dimension(200, 25));
        cbFuncionario.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);

                if (value instanceof Funcionario) {
                    setText(((Funcionario) value).getNome());
                }
                return this;
            }
        });
        painel.add(cbFuncionario);

        return painel;
    }

    // =========================
    // CENTRO – PRODUTOS
    // =========================
    private JPanel criarPainelCentro() {
        JPanel painel = new JPanel(new BorderLayout(5, 5));

        JPanel painelProduto = new JPanel(new FlowLayout(FlowLayout.LEFT));

        painelProduto.add(new JLabel("Produto:"));
        cbProduto = new JComboBox<>();
        cbProduto.setPreferredSize(new Dimension(200, 25));
        cbProduto.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);

                if (value instanceof Produto) {
                    setText(((Produto) value).getDescricao());
                }
                return this;
            }
        });
        painelProduto.add(cbProduto);

        painelProduto.add(new JLabel("Qtd:"));
        txtQuantidade = new JTextField(5);
        painelProduto.add(txtQuantidade);

        lblEstoque = new JLabel("Estoque: 0");
        painelProduto.add(lblEstoque);

        btnAdicionar = new JButton("Adicionar");
        painelProduto.add(btnAdicionar);

        painel.add(painelProduto, BorderLayout.NORTH);

        tabelaItens = new JTable(new DefaultTableModel(
                new Object[]{"Produto", "Qtd", "Preço", "Subtotal"}, 0
        ));

        painel.add(new JScrollPane(tabelaItens), BorderLayout.CENTER);

        // 🔹 Evento ao trocar produto
        cbProduto.addActionListener(e -> atualizarEstoque());

        return painel;
    }

    // =========================
    // RODAPÉ – TOTAL
    // =========================
    private JPanel criarPainelRodape() {
        JPanel painel = new JPanel(new BorderLayout());

        lblTotal = new JLabel("Total: R$ 0,00");
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
        painel.add(lblTotal, BorderLayout.WEST);

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnFinalizar = new JButton("Finalizar Venda");
        btnCancelar = new JButton("Cancelar");

        botoes.add(btnFinalizar);
        botoes.add(btnCancelar);

        painel.add(botoes, BorderLayout.EAST);

        return painel;
    }

    private void carregarClientes() {
        cbCliente.removeAllItems();
        for (Cliente cliente : ClienteRepository.listar()) {
            cbCliente.addItem(cliente);
        }
    }

    private void carregarFuncionarios() {
        cbFuncionario.removeAllItems();
        for (Funcionario funcionario : FuncionarioRepository.listar()) {
            cbFuncionario.addItem(funcionario);
        }
    }

    private void carregarProdutos() {
        cbProduto.removeAllItems();
        for (Produto produto : ProdutoRepository.listar()) {
            cbProduto.addItem(produto);
        }
    }

    private void configurarEventos() {

        // =========================
        // BOTÃO ADICIONAR
        // =========================
        btnAdicionar.addActionListener(e -> {

            Produto produto = (Produto) cbProduto.getSelectedItem();

            if (produto == null) {
                JOptionPane.showMessageDialog(this, "Selecione um produto.");
                return;
            }

            int quantidade;
            try {
                quantidade = Integer.parseInt(txtQuantidade.getText());
                if (quantidade <= 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Quantidade inválida.");
                return;
            }

            if (quantidade > produto.getEstoque()) {
                JOptionPane.showMessageDialog(this,
                        "Quantidade maior que o estoque disponível!");
                return;
            }

            int preco = produto.getPreco();
            int subtotal = preco * quantidade;

            DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
            model.addRow(new Object[]{
                produto.getDescricao(),
                quantidade,
                preco,
                subtotal
            });

            totalVenda += subtotal;
            atualizarTotal();

            txtQuantidade.setText("");
        });

        // =========================
        // BOTÃO FINALIZAR
        // =========================
        btnFinalizar.addActionListener(e -> {

            if (tabelaItens.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Adicione pelo menos um item.");
                return;
            }

            JOptionPane.showMessageDialog(this,
                    "Venda finalizada!\nTotal: R$ " + totalVenda);

            dispose();
        });

        // =========================
        // BOTÃO CANCELAR
        // =========================
        btnCancelar.addActionListener(e -> dispose());
    }

    private void atualizarTotal() {
        lblTotal.setText("Total: R$ " + totalVenda);
    }

    private void atualizarEstoque() {
        Produto produto = (Produto) cbProduto.getSelectedItem();

        if (produto != null) {
            lblEstoque.setText("Estoque: " + produto.getEstoque());
        }
    }

    // =========================
    // GETTERS (MVC)
    // =========================
    public JComboBox<Cliente> getCbCliente() {
        return cbCliente;
    }

    public JComboBox<Produto> getCbProduto() {
        return cbProduto;
    }

    public JTextField getTxtQuantidade() {
        return txtQuantidade;
    }

    public JTable getTabelaItens() {
        return tabelaItens;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    public JButton getBtnFinalizar() {
        return btnFinalizar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }
}
