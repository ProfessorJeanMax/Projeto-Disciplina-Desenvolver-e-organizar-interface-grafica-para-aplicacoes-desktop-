/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_base;

import java.awt.BorderLayout;
import projeto_base.controller.PerfilController;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import projeto_base.model.Cliente;
import projeto_base.model.Funcionario;
import projeto_base.model.Perfil;
import projeto_base.view.utils.PainelPerfil;

public class TelaPerfil extends JDialog {

    private PerfilController controller;
    private PainelPerfil painelPerfil;

    public TelaPerfil(JFrame parent, Perfil perfil) {
        super(parent, true);
        ajustarPerfil(perfil);
        configurarJanela(parent);
    }

    private void ajustarPerfil(Perfil perfil) {
        setLayout(new BorderLayout());

        painelPerfil = new PainelPerfil();
        controller = new PerfilController(painelPerfil);
        controller.carregarPerfil(perfil);


        add(painelPerfil, BorderLayout.CENTER);
    }

    private void configurarJanela(JFrame parent) {
        setTitle("Perfil");
        setSize(300, 250);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setAlwaysOnTop(true);
    }

    // MÉTODOS DE USO
    public void carregarCliente(Cliente cliente) {
        controller.carregarCliente(cliente);
    }

    public void carregarFuncionario(Funcionario funcionario) {
        controller.carregarFuncionario(funcionario);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
