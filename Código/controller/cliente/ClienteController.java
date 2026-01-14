package projeto_base.controller.cliente;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_base.controller.CadastroController;
import projeto_base.model.Cliente;
import projeto_base.repository.ClienteRepository;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class ClienteController extends CadastroController {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JTextField txtEndereco;

    @Override
    protected void configurarTela() {
        view.setTitulo("Cadastro Cliente");

        JPanel painel = view.getPainelFormulario();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        txtNome = new JTextField(15);
        txtCpf = new JTextField(15);
        txtTelefone = new JTextField(15);
        txtEmail = new JTextField(15);
        txtEndereco = new JTextField(15);

        painel.add(new JLabel("Nome"));
        painel.add(txtNome);

        painel.add(new JLabel("Cpf"));
        painel.add(txtCpf);

        painel.add(new JLabel("Telefone"));
        painel.add(txtTelefone);

        painel.add(new JLabel("Email"));
        painel.add(txtEmail);

        painel.add(new JLabel("Endereço"));
        painel.add(txtEndereco);
    }

    @Override
    public void salvar() {
        Cliente cliente = new Cliente(
                txtNome.getText(), txtCpf.getText(), txtTelefone.getText(), txtEmail.getText(), txtEndereco.getText());

        // **Salva no repositório**
        ClienteRepository.salvar(cliente);
        
        view.fechar();
    }
    

}
