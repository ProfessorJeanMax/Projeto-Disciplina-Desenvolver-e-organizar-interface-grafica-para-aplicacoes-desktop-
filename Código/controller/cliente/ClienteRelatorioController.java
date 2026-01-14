package projeto_base.controller.cliente;

import javax.swing.table.DefaultTableModel;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Cliente;
import projeto_base.repository.ClienteRepository;

public class ClienteRelatorioController extends RelatorioController {

    @Override
    protected void carregarDados() {

        String[] colunas = {"Nome", "CPF", "Telefone", "Email", "Endereço"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Cliente c : ClienteRepository.listar()) {
            model.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getEndereco()
            });
        }

        view.getTabela().setModel(model);
    }
}
