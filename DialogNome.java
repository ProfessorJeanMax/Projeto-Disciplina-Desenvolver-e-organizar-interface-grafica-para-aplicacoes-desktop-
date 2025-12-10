/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JeanMaxSimonKrebs
 */
class DialogNome extends JDialog {

    private JTextField campoNome;
    private String nomeDigitado = null;
    
    public DialogNome(JFrame parent) {
        super(parent, "Digite seu nome", true); 
        
        setSize(300, 150);
        setLocationRelativeTo(parent);
        setLayout(new FlowLayout());
        
        campoNome = new JTextField(15);
        JButton botaoOk = new JButton("OK");
        
        
        botaoOk.addActionListener(e -> {
            nomeDigitado = campoNome.getText();
            dispose();
        });
        
        
        
        add(new JLabel("Nome:"));        
        add(campoNome);
        add(botaoOk, null);
        
    }

    String getNomeDigitado() {
        return nomeDigitado;
    }

}
