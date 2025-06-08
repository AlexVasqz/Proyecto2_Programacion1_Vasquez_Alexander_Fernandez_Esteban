/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STRATEGO;

/**
 * 
 * @author alexv
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Configurar look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }
}
