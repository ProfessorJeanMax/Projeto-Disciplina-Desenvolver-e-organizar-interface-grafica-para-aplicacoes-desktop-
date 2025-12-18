package projeto_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import projeto_1.controller.cliente.ClienteController;
import projeto_1.controller.funcionario.FuncionarioController;
import projeto_1.controller.produto.ProdutoController;
import projeto_1.view.cadastro.TelaCadastro;

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

        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroClientes = new javax.swing.JMenuItem();
        jMenuItemCadastroProdutos = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarios = new javax.swing.JMenuItem();
        jMenuMovimentacoes = new javax.swing.JMenu();
        jMenuItemMovimentacoesVendas = new javax.swing.JMenuItem();
        jMenuItemMovimentacoesCompras = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosEstoque = new javax.swing.JMenuItem();
        jMenuItemRelatoriosFinanceiro = new javax.swing.JMenuItem();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemSistemaConfiguracoes = new javax.swing.JMenuItem();
        jMenuItemSistemaSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO 1");
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroClientes.setText("Clientes");
        jMenuItemCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroClientes);

        jMenuItemCadastroProdutos.setText("Produtos");
        jMenuItemCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroProdutos);

        jMenuItemCadastroFuncionarios.setText("Funcionários");
        jMenuItemCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFuncionarios);

        jMenuBar.add(jMenuCadastro);

        jMenuMovimentacoes.setText("Movimentações");

        jMenuItemMovimentacoesVendas.setText("Vendas");
        jMenuMovimentacoes.add(jMenuItemMovimentacoesVendas);

        jMenuItemMovimentacoesCompras.setText("Compras");
        jMenuMovimentacoes.add(jMenuItemMovimentacoesCompras);

        jMenuBar.add(jMenuMovimentacoes);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosEstoque.setText("Estoque");
        jMenuRelatorios.add(jMenuItemRelatoriosEstoque);

        jMenuItemRelatoriosFinanceiro.setText("Financeiro");
        jMenuRelatorios.add(jMenuItemRelatoriosFinanceiro);

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
            .addGap(0, 325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClientesActionPerformed
        
        TelaCadastro telaCadastro = new TelaCadastro(this, new ClienteController());
        
        telaCadastro.setVisible(true);
    
    }//GEN-LAST:event_jMenuItemCadastroClientesActionPerformed

    private void jMenuItemCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutosActionPerformed
        
        TelaCadastro telaCadastro = new TelaCadastro(this, new ProdutoController());
        
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroProdutosActionPerformed

    private void jMenuItemCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionariosActionPerformed
        
        TelaCadastro telaCadastro = new TelaCadastro(this, new FuncionarioController());
        
        telaCadastro.setVisible(true);    }//GEN-LAST:event_jMenuItemCadastroFuncionariosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastroClientes;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadastroProdutos;
    private javax.swing.JMenuItem jMenuItemMovimentacoesCompras;
    private javax.swing.JMenuItem jMenuItemMovimentacoesVendas;
    private javax.swing.JMenuItem jMenuItemRelatoriosEstoque;
    private javax.swing.JMenuItem jMenuItemRelatoriosFinanceiro;
    private javax.swing.JMenuItem jMenuItemSistemaConfiguracoes;
    private javax.swing.JMenuItem jMenuItemSistemaSair;
    private javax.swing.JMenu jMenuMovimentacoes;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSistema;
    // End of variables declaration//GEN-END:variables

    
 
}
