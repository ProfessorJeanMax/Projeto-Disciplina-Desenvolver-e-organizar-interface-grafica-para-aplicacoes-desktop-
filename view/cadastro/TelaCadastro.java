package projeto_1.view.cadastro;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import projeto_1.controller.CadastroController;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class TelaCadastro extends JDialog {
    private CadastroController controller;
    
    private JLabel lblTitulo;
    private JPanel painelFormulario;
    private JButton btnSalvar;

    public TelaCadastro(JFrame parent,CadastroController controller){
        super(parent, true);
        this.controller = controller;
        
        configurarJanela(parent);
        inicializarComponentes();
        controller.setView(this);
    }

    private void configurarJanela(JFrame parent) {
        setSize(500, 350);
        setLocationRelativeTo(parent);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void inicializarComponentes() {
        lblTitulo = new JLabel();
        painelFormulario = new JPanel();
        btnSalvar = new JButton("Salvar");
        
        add(lblTitulo, "North");
        add(painelFormulario, "Center");
        add(btnSalvar, "South");
        
        btnSalvar.addActionListener(e ->
             controller.salvar()
        );
    }
    
    public void setTitulo(String titulo) {
        setTitle(titulo);
        lblTitulo.setText(titulo);
    }
    
    public JPanel getPainelFormulario(){
        return painelFormulario;
    }
    
    public void fechar(){
        dispose();
    }
    
    
    
}
