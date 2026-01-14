package projeto_base.controller.produto;

import javax.swing.table.DefaultTableModel;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Produto;
import projeto_base.repository.ProdutoRepository;

public class ProdutoRelatorioController extends RelatorioController {

    @Override
    protected void carregarDados() {

        String[] colunas = {"Descrição", "Preço", "Estoque"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Produto p : ProdutoRepository.listar()) {
            model.addRow(new Object[]{
                p.getDescricao(),
                p.getPreco(),
                p.getEstoque()
            });
        }

        view.getTabela().setModel(model);
    }
}
