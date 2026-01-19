package projeto_base.repository;

import projeto_base.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Produto;

public class ClienteRepository {

    private static final List<Cliente> clientes = new ArrayList<>();
    private static int nextId = 1;

    public static void salvar(Cliente cliente) {
        cliente.setId(nextId++);
        clientes.add(cliente);
    }

    public static List<Cliente> listar() {
        return clientes;
    }

    public static void atualizar(Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == clienteAtualizado.getId()) {
                clientes.set(i, clienteAtualizado);
                return;
            }
        }
    }

    public static Cliente buscarPorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public static void remover(Cliente cliente) {
        clientes.remove(cliente);
    }
}
