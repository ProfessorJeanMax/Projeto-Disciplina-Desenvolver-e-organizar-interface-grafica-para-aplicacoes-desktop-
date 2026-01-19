package projeto_base.controller.funcionario;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_base.controller.CadastroController;
import projeto_base.model.Funcionario;
import projeto_base.repository.ClienteRepository;
import projeto_base.repository.FuncionarioRepository;
import projeto_base.repository.ProdutoRepository;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class FuncionarioController extends CadastroController {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtCargo;
    private JTextField txtSalario;

    @Override
    protected void configurarTela() {
        view.setTitulo("Cadastro Funcionário");

        JPanel painel = view.getPainelFormulario();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        txtNome = new JTextField(15);
        txtCpf = new JTextField(15);
        txtCargo = new JTextField(15);
        txtSalario = new JTextField(15);

        painel.add(new JLabel("Nome"));
        painel.add(txtNome);

        painel.add(new JLabel("Cpf"));
        painel.add(txtCpf);

        painel.add(new JLabel("Cargo"));
        painel.add(txtCargo);

        painel.add(new JLabel("Salário"));
        painel.add(txtSalario);
    }

    @Override
    public void salvar() {
        Funcionario funcionario = new Funcionario(
                txtNome.getText(), txtCpf.getText(), txtCargo.getText(), txtSalario.getText());

        if (!funcionario.isValido()) {
            JOptionPane.showMessageDialog(view, "Dados inválidos!");
            return;
        }
        // **Salva no repositório**
        FuncionarioRepository.salvar(funcionario);

        JOptionPane.showMessageDialog(view,
                "Funcionário salvo com sucesso!\nID: " + funcionario.getId()
        );

        view.fechar();

    }

}
