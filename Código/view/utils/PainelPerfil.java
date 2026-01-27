package projeto_base.view.utils;

import projeto_base.model.Perfil;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelPerfil extends javax.swing.JPanel {

    private JLabel lblNome;
    private JLabel lblCpf;
    private JPanel painelCentro;

    public PainelPerfil() {
//        initComponents();
        setLayout(new BorderLayout(10, 10));
        
        add(criarTopo(), BorderLayout.NORTH);
        add(criarCentro(), BorderLayout.CENTER);
    }

    private JPanel criarTopo() {

        JPanel topo = new JPanel(new GridLayout(2, 3));

        lblNome = new JLabel("Nome: ");
        lblCpf = new JLabel("CPF: ");

        topo.add(lblNome);
        topo.add(lblCpf);
        
        return topo;
    }

    private JPanel criarCentro() {

        painelCentro = new JPanel();

        painelCentro.setLayout(new BoxLayout(painelCentro, BoxLayout.Y_AXIS));
        
        return painelCentro;
    }
    
    // MÉTODO CHAVE
    
    public void carregarPerfil(Perfil perfil) {
        lblNome.setText("Nome: " + perfil.getNome());
        lblCpf.setText("CPF: " + perfil.getCpf());
    }
    
    public JPanel getPainelCentro(){
        return painelCentro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
