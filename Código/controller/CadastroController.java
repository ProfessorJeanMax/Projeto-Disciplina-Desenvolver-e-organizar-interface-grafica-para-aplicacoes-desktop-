package projeto_base.controller;

import projeto_base.view.TelaCadastro;

public abstract class CadastroController {

    protected TelaCadastro view;
    protected int indexEdicao = -1;

    public void setView(TelaCadastro view) {
        this.view = view;
        configurarTela();
    }

    protected abstract void configurarTela();

    public abstract void salvar();

    public boolean isEdicao() {
        return indexEdicao != -1;
    }

    public void setIndexEdicao(int index) {
        this.indexEdicao = index;
    }
}
