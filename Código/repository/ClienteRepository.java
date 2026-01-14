package projeto_base.repository;

import projeto_base.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Funcionario;

public class ClienteRepository {

    private static List<Cliente> clientes = new ArrayList<>();

    public static void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public static List<Cliente> listar() {
        return clientes;
    }

    public static void atualizar(Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c == clienteAtualizado) { // ou compara por ID se tiver
                clientes.set(i, clienteAtualizado);
                return;
            }
        }
    }

    public static Cliente buscarPorIndex(int index) {
        return clientes.get(index);
    }

    public static void remover(int index) {
        clientes.remove(index);
    }

}
