package projeto_base.controller.cliente;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.model.Cliente;
import projeto_base.repository.ClienteRepository;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.cliente.TelaCliente;

public class ClienteEditarController extends EditarController<Cliente> {

    private TelaCliente telaCliente;
    private Cliente clienteSelecionado;

    public ClienteEditarController() {
    }

    public ClienteEditarController(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    @Override
    public void configurarTela() {
        telaCliente = new TelaCliente();

        if (clienteSelecionado != null) {
            telaCliente.getTxtNome().setText(clienteSelecionado.getNome());
            telaCliente.getTxtCpf().setText(clienteSelecionado.getCpf());
            telaCliente.getTxtTelefone().setText(clienteSelecionado.getTelefone());
            telaCliente.getTxtEmail().setText(clienteSelecionado.getEmail());
            telaCliente.getTxtEndereco().setText(clienteSelecionado.getEndereco());
        }

        JPanel painel = view.getPainelFormulario();
        painel.removeAll();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(telaCliente);

        painel.revalidate();
        painel.repaint();
    }

    @Override
    public void salvar() {
        if (clienteSelecionado != null) {
            clienteSelecionado.setNome(telaCliente.getTxtNome().getText());
            clienteSelecionado.setCpf(telaCliente.getTxtCpf().getText());
            clienteSelecionado.setTelefone(telaCliente.getTxtTelefone().getText());
            clienteSelecionado.setEmail(telaCliente.getTxtEmail().getText());
            clienteSelecionado.setEndereco(telaCliente.getTxtEndereco().getText());

            ClienteRepository.atualizar(clienteSelecionado);

            JOptionPane.showMessageDialog(view, "Cliente atualizado com sucesso!");
            view.dispose();
        }
    }

    // ===== Implementação dos métodos para TelaSelecionar =====
    @Override
    protected List<Cliente> listar() {
        return ClienteRepository.listar();
    }

    @Override
    protected void configurarTabela(TelaSelecionar tela, List<Cliente> lista) {
        tela.configurarTabelaCliente(lista);
    }

    @Override
    protected void setSelecionado(Cliente obj) {
        this.clienteSelecionado = obj;
    }

    @Override
    protected String getTituloSelecionar() {
        return "Selecione um Cliente";
    }

    @Override
    public boolean verificar(JFrame parent) {
        return !ClienteRepository.listar().isEmpty();
    }

    @Override
    public CadastroController getCadastroController() {
        return new ClienteController(); // já sabe que é cliente
    }
}
