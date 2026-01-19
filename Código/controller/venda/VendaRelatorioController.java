package projeto_base.controller.venda;

import javax.swing.table.DefaultTableModel;
import projeto_base.controller.RelatorioController;
import projeto_base.model.ItemVenda;
import projeto_base.model.Venda;
import projeto_base.repository.VendaRepository;

public class VendaRelatorioController extends RelatorioController {

    @Override
    protected void carregarDados() {

        String[] colunas = {
            "Cliente",
            "Funcionário",
            "Produtos",
            "Total"
        };

        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Venda venda : VendaRepository.listar()) {

            String produtos = "";

            for (ItemVenda item : venda.getItens()) {
                produtos += item.getProduto().getDescricao()
                        + " (x" + item.getQuantidade() + "), ";
            }

            // Remove última vírgula
            if (!produtos.isEmpty()) {
                produtos = produtos.substring(0, produtos.length() - 2);
            }

            model.addRow(new Object[]{
                venda.getCliente().getNome(),
                venda.getFuncionario().getNome(),
                produtos,
                venda.getTotal()
            });
        }

        view.getTabela().setModel(model);
    }
}
