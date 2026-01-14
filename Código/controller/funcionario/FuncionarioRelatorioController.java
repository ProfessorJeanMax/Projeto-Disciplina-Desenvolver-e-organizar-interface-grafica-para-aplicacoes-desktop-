package projeto_base.controller.funcionario;

import javax.swing.table.DefaultTableModel;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Funcionario;
import projeto_base.repository.FuncionarioRepository;

public class FuncionarioRelatorioController extends RelatorioController {

    @Override
    protected void carregarDados() {

        String[] colunas = {"Nome", "CPF", "Cargo", "Salário"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Funcionario f : FuncionarioRepository.listar()) {
            model.addRow(new Object[]{
                f.getNome(),
                f.getCpf(),
                f.getCargo(),
                f.getSalario()
            });
        }

        view.getTabela().setModel(model);
    }
}
