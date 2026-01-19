package projeto_base.controller.venda;

import projeto_base.model.Cliente;
import projeto_base.model.Funcionario;
import projeto_base.model.Produto;
import projeto_base.model.Venda;
import projeto_base.repository.VendaRepository;

public class VendaController {

    private Venda venda;

    public void iniciarVenda(Cliente cliente, Funcionario funcionario) {
        venda = new Venda(cliente, funcionario);
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        venda.adicionarItem(produto, quantidade);
    }

    public double getTotal() {
        return venda.getTotal();
    }

    public void finalizarVenda() {
        VendaRepository.salvar(venda);
    }
}

