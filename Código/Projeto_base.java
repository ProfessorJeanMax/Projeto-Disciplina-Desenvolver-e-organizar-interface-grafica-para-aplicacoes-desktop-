package projeto_base;

public class Projeto_base {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(()->{
            new TelaPrincipal().setVisible(true);
//            new TelaCadastro().setVisible(true);
        });
    }
    
}
