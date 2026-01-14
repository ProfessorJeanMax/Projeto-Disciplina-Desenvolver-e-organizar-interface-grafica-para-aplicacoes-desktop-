package projeto_base.model;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class Produto {
    
    private String descricao;
    private String preco;
    private String estoque;

    public Produto(String descricao, String preco, String estoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
    
    
}
