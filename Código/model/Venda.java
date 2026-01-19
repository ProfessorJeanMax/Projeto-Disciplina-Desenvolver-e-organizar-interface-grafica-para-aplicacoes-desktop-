package projeto_base.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private Funcionario funcionario;

    private List<ItemVenda> itens;
    private double total;

    public Venda() {
        this.itens = new ArrayList<>();
        this.total = 0;
    }

    public Venda(Cliente cliente, Funcionario funcionario) {
        this();
        this.cliente = cliente;
        this.funcionario = funcionario;

    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", funcionario=" + funcionario + ", itens=" + itens + ", total=" + total + '}';
    }

    // =========================
    // REGRAS DE NEGÓCIO
    // =========================
    public void adicionarItem(Produto produto, int quantidade) {
        ItemVenda item = new ItemVenda(produto, quantidade);
        itens.add(item);
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
    }

    // =========================
    // GETTERS / SETTERS
    // =========================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }
}
