package projeto_base.controller;

import java.util.List;
import javax.swing.JFrame;
import projeto_base.view.TelaEditar;

public abstract class EditarController {

    protected JFrame parent;

    // === View principal de edição ===
    protected TelaEditar view;

    // === Seleções ===
    protected Object selecionado;   // edição única

    // =====================================================
    // VIEW
    // =====================================================
    public void setView(TelaEditar view) {
        this.view = view;
    }

    // =====================================================
    // FLUXO
    // =====================================================
    /**
     * Verifica se existem dados antes de abrir edição
     *
     * @param parent
     * @return
     */
    public abstract boolean verificar(JFrame parent);

    /**
     * Lista os registros disponíveis (usado pela TelaSelecionar)
     */
    public abstract List listar();

    /**
     * Define o objeto selecionado (edição única)
     */
    public void setSelecionado(Object obj) {
        this.selecionado = obj;
    }

    /**
     * Monta o formulário
     */
    public abstract void configurarTela();

    /**
     * Salva (um ou vários registros)
     */
    public abstract void salvar();

    public abstract void excluir();

    /**
     * Título da tela de seleção
     */
    public abstract String getTituloSelecionar();

    // =====================================================
    // INTEGRAÇÕES
    // =====================================================
    public abstract CadastroController getCadastroController();

    public abstract RelatorioController getRelatorioController();
}
