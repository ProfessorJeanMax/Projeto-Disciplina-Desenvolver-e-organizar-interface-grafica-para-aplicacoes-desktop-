/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_1.controller.cliente;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_1.controller.CadastroController;
import projeto_1.model.Cliente;

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
        txtEmail = new JTextField(15);
        txtTelefone = new JTextField(15);
        txtCpf = new JTextField(15);
        txtEndereco = new JTextField(15);

        painel.add(new JLabel("Nome"));
        painel.add(txtNome);

        painel.add(new JLabel("Email"));
        painel.add(txtEmail);

        painel.add(new JLabel("Telefone"));
        painel.add(txtTelefone);

        painel.add(new JLabel("CPF"));
        painel.add(txtCpf);

        painel.add(new JLabel("Endereco"));
        painel.add(txtEndereco);

    }

    @Override
    public void salvar() {
        Cliente cliente = new Cliente(
        txtNome.getText(), txtCpf.getText(), txtTelefone.getText(), 
                txtEmail.getText(), txtEndereco.getText());
        
        JOptionPane.showMessageDialog(view, "Cliente Salvo");
        
        view.fechar();
    }


}
