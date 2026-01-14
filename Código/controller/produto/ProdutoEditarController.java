package projeto_base.controller.produto;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.funcionario.FuncionarioController;
import projeto_base.model.Produto;
import projeto_base.repository.FuncionarioRepository;
import projeto_base.repository.ProdutoRepository;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.produto.TelaProduto;

public class ProdutoEditarController extends EditarController<Produto> {

    private TelaProduto telaProduto;
    private Produto produtoSelecionado;

    public ProdutoEditarController() {
    }

    public ProdutoEditarController(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }

    @Override
    public void configurarTela() {
        telaProduto = new TelaProduto();

        if (produtoSelecionado != null) {
            telaProduto.getTxtDescricao().setText(produtoSelecionado.getDescricao());
            telaProduto.getTxtPreco().setText(produtoSelecionado.getPreco());
            telaProduto.getTxtEstoque().setText(produtoSelecionado.getEstoque());
        }

        JPanel painel = view.getPainelFormulario();
        painel.removeAll();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(telaProduto);

        painel.revalidate();
        painel.repaint();
    }

    @Override
    public void salvar() {
        if (produtoSelecionado != null) {
            produtoSelecionado.setDescricao(telaProduto.getTxtDescricao().getText());
            produtoSelecionado.setPreco(telaProduto.getTxtPreco().getText());
            produtoSelecionado.setEstoque(telaProduto.getTxtEstoque().getText());

            ProdutoRepository.atualizar(produtoSelecionado);

            JOptionPane.showMessageDialog(view, "Produto atualizado com sucesso!");
            view.dispose();
        }
    }

    @Override
    protected List<Produto> listar() {
        return ProdutoRepository.listar();
    }

    @Override
    protected void configurarTabela(TelaSelecionar tela, List<Produto> lista) {
        tela.configurarTabelaProduto(lista);
    }

    @Override
    protected void setSelecionado(Produto obj) {
        this.produtoSelecionado = obj;
    }

    @Override
    protected String getTituloSelecionar() {
        return "Selecione um Produto";
    }

    @Override
    public boolean verificar(JFrame parent) {
        return !ProdutoRepository.listar().isEmpty();
    }

    @Override
    public ProdutoController getCadastroController() {
        return new ProdutoController(); // já sabe que é Produto
    }
}
