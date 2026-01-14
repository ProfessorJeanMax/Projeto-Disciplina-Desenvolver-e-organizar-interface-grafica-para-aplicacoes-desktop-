package projeto_base.controller;

import java.util.List;
import javax.swing.JFrame;
import projeto_base.view.TelaSelecionar;
import projeto_base.view.TelaEditar;

public abstract class EditarController<T> {

    protected JFrame parent;

    // === A view que será usada para editar ===
    protected TelaEditar view;

    // === Chamado pela TelaEditar para definir a view ===
    public void setView(TelaEditar view) {
        this.view = view;
    }

    // === Método obrigatório que cada controller concreto implementa para criar o formulário ===
    public abstract void configurarTela();

    // === Método obrigatório para salvar os dados ===
    public abstract void salvar();

    // === Verificação antes de abrir a tela de edição ===
    public abstract boolean verificar(JFrame parent);

    /* ===== Métodos que cada controller concreto implementa ===== */
    protected abstract List<T> listar();

    protected abstract void configurarTabela(TelaSelecionar tela, List<T> lista);

    protected abstract void setSelecionado(T obj);

    protected abstract String getTituloSelecionar();

    public abstract CadastroController getCadastroController();

}
