package projeto_base.controller.produto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Funcionario;
import projeto_base.model.Produto;
import projeto_base.repository.ProdutoRepository;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.produto.TelaProduto;

public class ProdutoEditarController extends EditarController {

    private TelaProduto telaProduto;

    private static final List<Produto> produtos = new ArrayList<>();

    @Override
    public void configurarTela() {

        telaProduto = new TelaProduto();

        // 🔹 edição única
        if (selecionado != null) {
            Produto produtoSelecionado = (Produto) selecionado;

            telaProduto.getTxtDescricao().setText(produtoSelecionado.getDescricao());
            telaProduto.getTxtPreco().setText(
                    String.valueOf(produtoSelecionado.getPreco())
            );
            telaProduto.getTxtEstoque().setText(
                    String.valueOf(produtoSelecionado.getEstoque())
            );
        }

        JPanel painel = view.getPainelFormulario();
        painel.removeAll();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(telaProduto);

        painel.revalidate();
        painel.repaint();
    }

    // =====================================================
    // SALVAR
    // =====================================================
    @Override
    public void salvar() {

        if (selecionado != null) {

            Produto produtoSelecionado = (Produto) selecionado;

            produtoSelecionado.setDescricao(telaProduto.getTxtDescricao().getText());
            produtoSelecionado.setPreco(Integer.parseInt(telaProduto.getTxtPreco().getText()));
            produtoSelecionado.setEstoque(Integer.parseInt(telaProduto.getTxtEstoque().getText()));

            ProdutoRepository.atualizar(produtoSelecionado);

            JOptionPane.showMessageDialog(view, "Produto atualizado com sucesso!");
            view.dispose();
        }
    }

    @Override
    public String getTituloSelecionar() {
        return "Selecione um Produto";
    }

    @Override
    public boolean verificar(JFrame parent) {
        return !ProdutoRepository.listar().isEmpty();
    }

    // =====================================================
    // CADASTRO / RELATÓRIO
    // =====================================================
    @Override
    public CadastroController getCadastroController() {
        return new ProdutoController();
    }

    @Override
    public RelatorioController getRelatorioController() {
        return new ProdutoRelatorioController();
    }

    @Override
    public List listar() {
        return ProdutoRepository.listar();
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void remover(Produto produto) {
        produtos.remove(produto.getId());
    }

}
