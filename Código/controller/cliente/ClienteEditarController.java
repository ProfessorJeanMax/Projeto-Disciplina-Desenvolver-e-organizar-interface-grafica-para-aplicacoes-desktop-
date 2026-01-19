package projeto_base.controller.cliente;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projeto_base.controller.CadastroController;
import projeto_base.controller.EditarController;
import projeto_base.controller.RelatorioController;
import projeto_base.model.Cliente;
import projeto_base.repository.ClienteRepository;
import projeto_base.repository.ProdutoRepository;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.cliente.TelaCliente;

public class ClienteEditarController extends EditarController {

    private TelaCliente telaCliente;

    // =====================================================
    // CONFIGURAR TELA
    // =====================================================
    @Override
    public void configurarTela() {

        telaCliente = new TelaCliente();

        // 🔹 edição única
        if (selecionado != null) {
            Cliente clienteSelecionado = (Cliente) selecionado;

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

    // =====================================================
    // SALVAR
    // =====================================================
    @Override
    public void salvar() {

        if (selecionado != null) {

            Cliente clienteSelecionado = (Cliente) selecionado;

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

    @Override
    public String getTituloSelecionar() {
        return "Selecione um Cliente";
    }

    @Override
    public boolean verificar(JFrame parent) {
        return !ClienteRepository.listar().isEmpty();
    }

    // =====================================================
    // CADASTRO
    // =====================================================
    @Override
    public CadastroController getCadastroController() {
        return new ClienteController();
    }

    // =====================================================
    // RELATÓRIO (USADO NA SELEÇÃO)
    // =====================================================
    @Override
    public RelatorioController getRelatorioController() {
        return new ClienteRelatorioController();
    }

    @Override
    public List listar() {
        return ClienteRepository.listar();
    }

   @Override
    public void excluir() {
        if (selecionado != null) {
            ClienteRepository.remover((Cliente) selecionado);
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
        }
    }

}
