package projeto_base.controller;

import projeto_base.view.TelaRelatorio;

public abstract class RelatorioController {

    protected TelaRelatorio view;

    public void setView(TelaRelatorio view) {
        this.view = view;
        carregarDados();
    }

    protected abstract void carregarDados();
}
