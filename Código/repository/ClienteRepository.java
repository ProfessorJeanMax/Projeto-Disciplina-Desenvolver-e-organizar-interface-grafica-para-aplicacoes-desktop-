package projeto_base.repository;

import projeto_base.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Produto;

public class ClienteRepository {

    private static List<Cliente> clientes = new ArrayList<>();
    private static int nextId = 1;

    static {
        Cliente cliente1 = new Cliente(1, "José", "04504504580", "5195954141",
                "jose@gmail.com", "avenida das cruzes 239");
        Cliente cliente2 = new Cliente(1, "João", "04504501580", "5194954141",
                "joao@gmail.com", "avenida solanas 239");
        Cliente cliente3 = new Cliente(1, "Kleber", "04504204580", "4195954141",
                "klebergmail.com", "rua das cruzes 219");
        Cliente cliente4 = new Cliente(1, "Maria", "04501004580", "5190954141",
                "maria@gmail.com", "rua das cruzes 13");
        Cliente cliente5 = new Cliente(1, "Joana", "12304504580", "1235954141",
                "joana@gmail.com", "avenida das cruzes 13");

       salvar(cliente1);
       salvar(cliente2);
       salvar(cliente3);
       salvar(cliente4);
       salvar(cliente5);

        
    }

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
