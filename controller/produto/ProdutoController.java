/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_1.controller.produto;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_1.controller.CadastroController;
import projeto_1.model.Produto;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class ProdutoController extends CadastroController{
    
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtEstoque;

    @Override
    protected void configurarTela() {
        view.setTitulo("Cadastro Produto");

        JPanel painel = view.getPainelFormulario();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        txtDescricao = new JTextField(15);
        txtPreco = new JTextField(15);
        txtEstoque = new JTextField(15);

        painel.add(new JLabel("Descricao"));
        painel.add(txtDescricao);

        painel.add(new JLabel("Preco"));
        painel.add(txtPreco);

        painel.add(new JLabel("Estoque"));
        painel.add(txtEstoque);

  }

    @Override
    public void salvar() {
        Produto produto = new Produto(
        txtDescricao.getText(), txtPreco.getText(), txtEstoque.getText());
        
        JOptionPane.showMessageDialog(view, "Produto Salvo");
        
        view.fechar();
    }

}
