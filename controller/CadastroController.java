package projeto_1.controller;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import projeto_1.view.cadastro.TelaCadastro;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public abstract class CadastroController {

    protected TelaCadastro view;

    public void setView(TelaCadastro view) {
        this.view = view;

        configurarTela();
    }

    protected abstract void configurarTela();

    public abstract void salvar();

}
