package STRATEGO;

import javax.swing.JOptionPane;

public class MenuJuego extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel("/imagenes/background.jpeg");
    private Player jugadorActual;

    public MenuJuego(Player player) {
        this.setContentPane(fondo);
        this.jugadorActual = player;
        initComponents();
        jPanel1.setOpaque(false);
        setLocationRelativeTo(null);
        setCurrentPlayer(player);
    }

    public void setCurrentPlayer(Player player) {
        this.jugadorActual = player;
        if (jugadorActual != null) {
            lblBienvenida.setText("MENU PRINCIPAL");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        btnStrategoMarvel = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnMiPerfil = new javax.swing.JButton();
        btnUniversoMarvel = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Stratego");
        setResizable(false);

        lblBienvenida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("MENU PRINCIPAL");

        btnStrategoMarvel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnStrategoMarvel.setText("STRATEGO – MARVEL HEROES!");
        btnStrategoMarvel.setPreferredSize(new java.awt.Dimension(200, 80));
        btnStrategoMarvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStrategoMarvelActionPerformed(evt);
            }
        });

        btnConfiguracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfiguracion.setText("CONFIGURACION");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        btnMiPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mi-Perfil.png"))); // NOI18N
        btnMiPerfil.setBorderPainted(false);
        btnMiPerfil.setContentAreaFilled(false);
        btnMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActionPerformed(evt);
            }
        });

        btnUniversoMarvel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUniversoMarvel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Universo-Marvel.png"))); // NOI18N
        btnUniversoMarvel.setBorderPainted(false);
        btnUniversoMarvel.setContentAreaFilled(false);
        btnUniversoMarvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversoMarvelActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStrategoMarvel, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(btnMiPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUniversoMarvel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStrategoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMiPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUniversoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStrategoMarvelActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Botón Stratego Marvel presionado");
        Tablero tablero = new Tablero();
        tablero.setVisible(true);
        this.dispose();
    }

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        JOptionPane.showMessageDialog(
                null,
                "Opcion no habilitada \nVendrá en futuras actualizaciones",
                "Opción no habilitada",
                JOptionPane.WARNING_MESSAGE
        );
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        MiPerfil miPerfil = new MiPerfil(jugadorActual);
        miPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnUniversoMarvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversoMarvelActionPerformed
        Universo_Marvel universoMarvel = new Universo_Marvel(jugadorActual);
        universoMarvel.setVisible(true);
        universoMarvel.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnUniversoMarvelActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de que desea cerrar sesión?",
                "Confirmar cierre de sesión",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            new menu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnStrategoMarvel;
    private javax.swing.JButton btnUniversoMarvel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
