package projeto_base.controller;

import javax.swing.JLabel;
import projeto_base.model.Cliente;
import projeto_base.model.Funcionario;
import projeto_base.model.Perfil;
import projeto_base.view.utils.PainelPerfil;

public class PerfilController {

    private final PainelPerfil view;

    public PerfilController(PainelPerfil view) {
        this.view = view;
    }

    public void carregarPerfil(Perfil perfil) {
        switch (perfil) {
            case Cliente cliente ->
                carregarCliente(cliente);
            case Funcionario funcionario ->
                carregarFuncionario(funcionario);
            default -> {
            }
        }
    }

    public void carregarCliente(Cliente cliente) {
        System.out.println(cliente);

        view.carregarPerfil(cliente);

        view.getPainelCentro().removeAll();
        view.getPainelCentro().add(new JLabel("Telefone: " + cliente.getTelefone()));
        view.getPainelCentro().add(new JLabel("Email: " + cliente.getEmail()));
        view.getPainelCentro().add(new JLabel("Endereço: " + cliente.getEndereco()));
    }

    public void carregarFuncionario(Funcionario funcionario) {
        view.carregarPerfil(funcionario);

        view.getPainelCentro().removeAll();
        view.getPainelCentro().add(new JLabel("Cargo: " + funcionario.getCargo()));
        view.getPainelCentro().add(new JLabel("Salário: " + funcionario.getSalario()));

        view.add(view.getPainelCentro());

    }

}
