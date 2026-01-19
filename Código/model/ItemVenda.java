package projeto_base.model;

public class ItemVenda {

    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        calcularSubtotal();
    }

    private void calcularSubtotal() {
        subtotal = produto.getPreco() * quantidade;
    }

    // =========================
    // GETTERS
    // =========================

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
