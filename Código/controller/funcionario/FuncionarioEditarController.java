package projeto_base.controller.funcionario;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.cliente.ClienteController;
import projeto_base.model.Funcionario;
import projeto_base.repository.ClienteRepository;
import projeto_base.repository.FuncionarioRepository;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.funcionario.TelaFuncionario;

public class FuncionarioEditarController extends EditarController<Funcionario> {

    private TelaFuncionario telaFuncionario;
    private Funcionario funcionarioSelecionado;

    public FuncionarioEditarController() {
    }

    public FuncionarioEditarController(Funcionario funcionarioSelecionado) {
        this.funcionarioSelecionado = funcionarioSelecionado;
    }

    @Override
    public void configurarTela() {
        telaFuncionario = new TelaFuncionario();

        if (funcionarioSelecionado != null) {
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

    @Override
    public void salvar() {
        if (funcionarioSelecionado != null) {
            funcionarioSelecionado.setNome(telaFuncionario.getTxtNome().getText());
            funcionarioSelecionado.setCpf(telaFuncionario.getTxtCpf().getText());
            funcionarioSelecionado.setCargo(telaFuncionario.getTxtCargo().getText());
            funcionarioSelecionado.setSalario(telaFuncionario.getTxtSalario().getText());

            FuncionarioRepository.atualizar(funcionarioSelecionado);

            JOptionPane.showMessageDialog(view, "Funcionário atualizado com sucesso!");
            view.dispose();
        }
    }

    @Override
    protected List<Funcionario> listar() {
        return FuncionarioRepository.listar();
    }

    @Override
    protected void configurarTabela(TelaSelecionar tela, List<Funcionario> lista) {
        tela.configurarTabelaFuncionario(lista);
    }

    @Override
    protected void setSelecionado(Funcionario obj) {
        this.funcionarioSelecionado = obj;
    }

    @Override
    protected String getTituloSelecionar() {
        return "Selecione um Funcionário";
    }
    
    @Override
    public boolean verificar(JFrame parent) {
        return !FuncionarioRepository.listar().isEmpty();
    }

    @Override
    public FuncionarioController getCadastroController() {
        return new FuncionarioController(); // já sabe que é Func
    }
}
