package projeto_base;

import projeto_base.controller.venda.VendaRelatorioController;
import projeto_base.controller.cliente.ClienteEditarController;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.RelatorioController;
import projeto_base.controller.cliente.ClienteController;
import projeto_base.controller.cliente.ClienteRelatorioController;
import projeto_base.controller.funcionario.FuncionarioController;
import projeto_base.controller.funcionario.FuncionarioEditarController;
import projeto_base.controller.funcionario.FuncionarioRelatorioController;
import projeto_base.controller.produto.ProdutoController;
import projeto_base.controller.produto.ProdutoEditarController;
import projeto_base.controller.produto.ProdutoRelatorioController;
import projeto_base.controller.venda.VendaController;
import projeto_base.view.TelaCadastro;
import projeto_base.view.TelaEditar;
import projeto_base.view.TelaExcluir;
import projeto_base.view.TelaRelatorio;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.TelaSemDados;
import projeto_base.view.venda.TelaVenda;

public class TelaPrincipal extends JFrame {

//construtor
    public TelaPrincipal() {
        initComponents();
        configurarJanela();
    }

    private void configurarJanela() {
        setTitle("Sistema Comercial");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setAlwaysOnTop(true);
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jSubMenuCadastroCliente = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroClienteEditar = new javax.swing.JMenuItem();
        jMenuItemCadastroClienteExcluir = new javax.swing.JMenuItem();
        jSubMenuCadastroProduto = new javax.swing.JMenu();
        jMenuItemCadastroProduto = new javax.swing.JMenuItem();
        jMenuItemCadastroProdutoEditar = new javax.swing.JMenuItem();
        jMenuItemCadastroProdutoExcluir = new javax.swing.JMenuItem();
        jSubMenuCadastroFuncionario = new javax.swing.JMenu();
        jMenuItemCadastroFuncionario = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarioEditar = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarioExcluir = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosEstoque = new javax.swing.JMenuItem();
        jMenuItemRelatoriosFinanceiro = new javax.swing.JMenuItem();
        jMenuItemRelatoriosClientes = new javax.swing.JMenuItem();
        jMenuItemRelatoriosFuncionarios = new javax.swing.JMenuItem();
        jMenuItemRelatoriosProdutos = new javax.swing.JMenuItem();
        jMenuItemRelatorioVendas = new javax.swing.JMenuItem();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemSistemaConfiguracoes = new javax.swing.JMenuItem();
        jMenuItemSistemaSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO 1");
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Simular Venda");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        jMenuCadastro.setText("Cadastro");

        jSubMenuCadastroCliente.setText("Cliente");

        jMenuItemCadastroCliente.setText("Novo");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jSubMenuCadastroCliente.add(jMenuItemCadastroCliente);

        jMenuItemCadastroClienteEditar.setText("Editar");
        jMenuItemCadastroClienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteEditarActionPerformed(evt);
            }
        });
        jSubMenuCadastroCliente.add(jMenuItemCadastroClienteEditar);

        jMenuItemCadastroClienteExcluir.setText("Excluir");
        jMenuItemCadastroClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteExcluirActionPerformed(evt);
            }
        });
        jSubMenuCadastroCliente.add(jMenuItemCadastroClienteExcluir);

        jMenuCadastro.add(jSubMenuCadastroCliente);

        jSubMenuCadastroProduto.setText("Produto");

        jMenuItemCadastroProduto.setText("Novo");
        jMenuItemCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoActionPerformed(evt);
            }
        });
        jSubMenuCadastroProduto.add(jMenuItemCadastroProduto);

        jMenuItemCadastroProdutoEditar.setText("Editar");
        jMenuItemCadastroProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoEditarActionPerformed(evt);
            }
        });
        jSubMenuCadastroProduto.add(jMenuItemCadastroProdutoEditar);

        jMenuItemCadastroProdutoExcluir.setText("Excluir");
        jMenuItemCadastroProdutoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoExcluirActionPerformed(evt);
            }
        });
        jSubMenuCadastroProduto.add(jMenuItemCadastroProdutoExcluir);

        jMenuCadastro.add(jSubMenuCadastroProduto);

        jSubMenuCadastroFuncionario.setText("Funcionário");

        jMenuItemCadastroFuncionario.setText("Novo");
        jMenuItemCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioActionPerformed(evt);
            }
        });
        jSubMenuCadastroFuncionario.add(jMenuItemCadastroFuncionario);

        jMenuItemCadastroFuncionarioEditar.setText("Editar");
        jMenuItemCadastroFuncionarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioEditarActionPerformed(evt);
            }
        });
        jSubMenuCadastroFuncionario.add(jMenuItemCadastroFuncionarioEditar);

        jMenuItemCadastroFuncionarioExcluir.setText("Excluir");
        jMenuItemCadastroFuncionarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioExcluirActionPerformed(evt);
            }
        });
        jSubMenuCadastroFuncionario.add(jMenuItemCadastroFuncionarioExcluir);

        jMenuCadastro.add(jSubMenuCadastroFuncionario);

        jMenuBar.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosEstoque.setText("Estoque");
        jMenuRelatorios.add(jMenuItemRelatoriosEstoque);

        jMenuItemRelatoriosFinanceiro.setText("Financeiro");
        jMenuRelatorios.add(jMenuItemRelatoriosFinanceiro);

        jMenuItemRelatoriosClientes.setText("Clientes");
        jMenuItemRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosClientesActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosClientes);

        jMenuItemRelatoriosFuncionarios.setText("Funcionários");
        jMenuItemRelatoriosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosFuncionariosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosFuncionarios);

        jMenuItemRelatoriosProdutos.setText("Produtos");
        jMenuItemRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosProdutosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosProdutos);

        jMenuItemRelatorioVendas.setText("Vendas");
        jMenuItemRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioVendasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatorioVendas);

        jMenuBar.add(jMenuRelatorios);

        jMenuSistema.setText("Sistema");

        jMenuItemSistemaConfiguracoes.setText("Configurações");
        jMenuSistema.add(jMenuItemSistemaConfiguracoes);

        jMenuItemSistemaSair.setText("Sair");
        jMenuSistema.add(jMenuItemSistemaSair);

        jMenuBar.add(jMenuSistema);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioActionPerformed
        abrirCadastro(new FuncionarioController());
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioActionPerformed

    private void jMenuItemCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoActionPerformed
        abrirCadastro(new ProdutoController());
    }//GEN-LAST:event_jMenuItemCadastroProdutoActionPerformed

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        abrirCadastro(new ClienteController());

    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemRelatoriosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosClientesActionPerformed
        abrirRelatorio(new ClienteRelatorioController());
    }//GEN-LAST:event_jMenuItemRelatoriosClientesActionPerformed

    private void jMenuItemRelatoriosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosFuncionariosActionPerformed
        abrirRelatorio(new FuncionarioRelatorioController());
    }//GEN-LAST:event_jMenuItemRelatoriosFuncionariosActionPerformed

    private void jMenuItemRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosProdutosActionPerformed
        abrirRelatorio(new ProdutoRelatorioController());
    }//GEN-LAST:event_jMenuItemRelatoriosProdutosActionPerformed

    private void jMenuItemCadastroClienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteEditarActionPerformed
        abrirEdicao(new ClienteEditarController());
    }//GEN-LAST:event_jMenuItemCadastroClienteEditarActionPerformed

    private void jMenuItemCadastroFuncionarioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioEditarActionPerformed
        abrirEdicao(new FuncionarioEditarController());
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioEditarActionPerformed

    private void jMenuItemCadastroProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoEditarActionPerformed
        abrirEdicao(new ProdutoEditarController());
    }//GEN-LAST:event_jMenuItemCadastroProdutoEditarActionPerformed

    private void jMenuItemCadastroClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteExcluirActionPerformed
        abrirExcluir(new ClienteEditarController());
    }//GEN-LAST:event_jMenuItemCadastroClienteExcluirActionPerformed

    private void jMenuItemCadastroProdutoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoExcluirActionPerformed
        abrirExcluir(new ProdutoEditarController());
    }//GEN-LAST:event_jMenuItemCadastroProdutoExcluirActionPerformed

    private void jMenuItemCadastroFuncionarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioExcluirActionPerformed
        abrirExcluir(new FuncionarioEditarController());
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrirVenda();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioVendasActionPerformed
        abrirRelatorio(new VendaRelatorioController());
    }//GEN-LAST:event_jMenuItemRelatorioVendasActionPerformed

    private void abrirCadastro(CadastroController controller) {
        new TelaCadastro(this, controller).setVisible(true);
    }

    private void abrirRelatorio(RelatorioController controller) {
        new TelaRelatorio(this, controller).setVisible(true);
    }

    private void abrirEdicao(EditarController controller) {
        if (controller.verificar(this)) {

            // Se o usuário clicou em uma das opções abre uma Selecionar
            TelaSelecionar telaSelecionar = new TelaSelecionar(this,
                    controller.getRelatorioController(),
                    controller.getTituloSelecionar());

            telaSelecionar.setVisible(true);

            // Usuário cancelou
            int linha = telaSelecionar.getLinhaSelecionada();
            if (linha == -1) {
                return;
            }

            // Recupera objeto selecionado pelo índice
            Object selecionado = controller.listar().get(linha);
            controller.setSelecionado(selecionado);

            new TelaEditar(this, controller).setVisible(true);

        } else {
            // Não existe → abre TelaSemDados
            TelaSemDados telaSemDados = new TelaSemDados(this);
            telaSemDados.setVisible(true);

            // Se o usuário clicar em "Criar novo", abre cadastro correto
            if (telaSemDados.isCriarNovo()) {
                new TelaCadastro(this, controller.getCadastroController()).setVisible(true);
            }
        }
    }

    private void abrirExcluir(EditarController controller) {
        if (controller.verificar(this)) {

            // Se o usuário clicou em uma das opções abre uma Selecionar
            TelaSelecionar telaSelecionar = new TelaSelecionar(this,
                    controller.getRelatorioController(),
                    controller.getTituloSelecionar());

            telaSelecionar.setVisible(true);

            // Usuário cancelou
            int linha = telaSelecionar.getLinhaSelecionada();
            if (linha == -1) {
                return;
            }

            // Recupera objeto selecionado pelo índice
            Object selecionado = controller.listar().get(linha);
            controller.setSelecionado(selecionado);

            new TelaExcluir(this, controller).setVisible(true);

        } else {
            // Não existe → abre TelaSemDados
            TelaSemDados telaSemDados = new TelaSemDados(this);
            telaSemDados.setVisible(true);

            // Se o usuário clicar em "Criar novo", abre cadastro correto
            if (telaSemDados.isCriarNovo()) {
                new TelaCadastro(this, controller.getCadastroController()).setVisible(true);
            }
        }
    }

    private void abrirVenda() {
        TelaVenda telaVenda = new TelaVenda(this);
        
        telaVenda.setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroClienteEditar;
    private javax.swing.JMenuItem jMenuItemCadastroClienteExcluir;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionario;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarioEditar;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarioExcluir;
    private javax.swing.JMenuItem jMenuItemCadastroProduto;
    private javax.swing.JMenuItem jMenuItemCadastroProdutoEditar;
    private javax.swing.JMenuItem jMenuItemCadastroProdutoExcluir;
    private javax.swing.JMenuItem jMenuItemRelatorioVendas;
    private javax.swing.JMenuItem jMenuItemRelatoriosClientes;
    private javax.swing.JMenuItem jMenuItemRelatoriosEstoque;
    private javax.swing.JMenuItem jMenuItemRelatoriosFinanceiro;
    private javax.swing.JMenuItem jMenuItemRelatoriosFuncionarios;
    private javax.swing.JMenuItem jMenuItemRelatoriosProdutos;
    private javax.swing.JMenuItem jMenuItemSistemaConfiguracoes;
    private javax.swing.JMenuItem jMenuItemSistemaSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jSubMenuCadastroCliente;
    private javax.swing.JMenu jSubMenuCadastroFuncionario;
    private javax.swing.JMenu jSubMenuCadastroProduto;
    // End of variables declaration//GEN-END:variables

}
