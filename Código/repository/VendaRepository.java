package projeto_base.repository;

import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Venda;

public class VendaRepository {

    private static final List<Venda> vendas = new ArrayList<>();
    private static int proximoId = 1;

    public static void salvar(Venda venda) {
        venda.setId(proximoId++);
        vendas.add(venda);
    }

    public static List<Venda> listar() {
        return vendas;
    }
}
