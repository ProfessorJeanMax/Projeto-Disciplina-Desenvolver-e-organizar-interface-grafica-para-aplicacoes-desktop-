package projeto_base.repository;

import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Funcionario;
import projeto_base.model.Produto;

public class ProdutoRepository {

    private static final List<Produto> produtos = new ArrayList<>();

    public static void salvar(Produto produto) {
        produtos.add(produto);
    }

    public static List<Produto> listar() {
        return produtos;
    }

    public static void atualizar(Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p == produtoAtualizado) { // ou compara por ID se tiver
                produtos.set(i, produtoAtualizado);
                return;
            }
        }
    }

    public static Produto buscarPorIndex(int index) {
        return produtos.get(index);
    }

    public static void remover(int index) {
        produtos.remove(index);
    }
}
