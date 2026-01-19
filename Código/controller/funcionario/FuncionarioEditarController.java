package projeto_base.controller.funcionario;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Funcionario;
import projeto_base.repository.FuncionarioRepository;
import projeto_base.repository.ProdutoRepository;
import projeto_base.view.funcionario.TelaFuncionario;

public class FuncionarioEditarController extends EditarController {

    private TelaFuncionario telaFuncionario;

    // =====================================================
    // CONFIGURAR TELA
    // =====================================================
    @Override
    public void configurarTela() {

        telaFuncionario = new TelaFuncionario();

        // 🔹 edição simples
        if (selecionado != null) {
            Funcionario funcionarioSelecionado = (Funcionario) selecionado;

            telaFuncionario.getTxtNome().setText(funcionarioSelecionado.getNome());
            telaFuncionario.getTxtCpf().setText(funcionarioSelecionado.getCpf());
            telaFuncionario.getTxtCargo().setText(funcionarioSelecionado.getCargo());
            telaFuncionario.getTxtSalario().setText(funcionarioSelecionado.getSalario());
        }

        JPanel painel = view.getPainelFormulario();
        painel.removeAll();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(telaFuncionario);

        painel.revalidate();
        painel.repaint();
    }

    // =====================================================
    // SALVAR
    // =====================================================
    @Override
    public void salvar() {

        if (selecionado != null) {

            Funcionario funcionarioSelecionado = (Funcionario) selecionado;

            funcionarioSelecionado.setNome(telaFuncionario.getTxtNome().getText());
            funcionarioSelecionado.setCpf(telaFuncionario.getTxtCpf().getText());
            funcionarioSelecionado.setCargo(telaFuncionario.getTxtCargo().getText());
            funcionarioSelecionado.setSalario(telaFuncionario.getTxtSalario().getText());

            FuncionarioRepository.atualizar(funcionarioSelecionado);

            JOptionPane.showMessageDialog(view, "Funcionário atualizado com sucesso!");
            view.dispose();
        }
    }

    // =====================================================
    // FLUXO
    // =====================================================
    @Override
    public boolean verificar(JFrame parent) {
        return !FuncionarioRepository.listar().isEmpty();
    }

    @Override
    public String getTituloSelecionar() {
        return "Selecione um Funcionário";
    }

    // =====================================================
    // INTEGRAÇÕES
    // =====================================================
    @Override
    public CadastroController getCadastroController() {
        return new FuncionarioController();
    }

    @Override
    public RelatorioController getRelatorioController() {
        return new FuncionarioRelatorioController();
    }
    
    @Override
    public List listar() {
        return FuncionarioRepository.listar();
    }

   @Override
    public void excluir() {
        if (selecionado != null) {
            FuncionarioRepository.remover((Funcionario) selecionado);
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
        }
    }
}
