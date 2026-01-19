package projeto_base.model;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class Produto {
    private int id;
    private String descricao;
    private int preco;
    private int estoque;

    public Produto(String descricao, int preco, int estoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    
    
    public Produto(int id, String descricao, int preco, int estoque) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", estoque=" + estoque + '}';
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public boolean isValido() {
        return descricao != null && !descricao.isBlank();
    }
}
