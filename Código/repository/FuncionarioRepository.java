package projeto_base.repository;

import java.util.ArrayList;
import java.util.List;
import projeto_base.model.Cliente;
import projeto_base.model.Funcionario;
import projeto_base.model.Produto;

public class FuncionarioRepository {

    private static final List<Funcionario> funcionarios = new ArrayList<>();

    public static void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static List<Funcionario> listar() {
        return funcionarios;
    }

    public static void atualizar(Funcionario funcionarioAtualizado) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f == funcionarioAtualizado) { // ou compara por ID se tiver
                funcionarios.set(i, funcionarioAtualizado);
                return;
            }
        }
    }

    public static Funcionario buscarPorIndex(int index) {
        return funcionarios.get(index);
    }

    public static void remover(int index) {
        funcionarios.remove(index);
    }

}
