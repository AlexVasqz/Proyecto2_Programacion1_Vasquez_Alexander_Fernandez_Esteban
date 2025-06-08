package STRATEGO;

public class MenuJuego extends javax.swing.JFrame {
    
    private Player jugadorActual;

    public MenuJuego(Player player) {
        this.jugadorActual = player;
        initComponents();
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

        lblBienvenida = new javax.swing.JLabel();
        btnStrategoMarvel = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnMiPerfil = new javax.swing.JButton();
        btnUniversoMarvel = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Stratego");
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        lblBienvenida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("MENU PRINCIPAL");

        btnStrategoMarvel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnStrategoMarvel.setText("STRATEGO – MARVEL HEROES!");
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
        btnMiPerfil.setText("MI PERFIL");
        btnMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActionPerformed(evt);
            }
        });

        btnUniversoMarvel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUniversoMarvel.setText("UNIVERSO MARVEL");
        btnUniversoMarvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversoMarvelActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStrategoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMiPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUniversoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnStrategoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMiPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnUniversoMarvel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStrategoMarvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrategoMarvelActionPerformed
        // STRATEGO – MARVEL HEROES! - Sin funcionalidad por ahora
    }//GEN-LAST:event_btnStrategoMarvelActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // CONFIGURACION - Sin funcionalidad por ahora
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        // MI PERFIL - Sin funcionalidad por ahora
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnUniversoMarvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversoMarvelActionPerformed
        // UNIVERSO MARVEL - Sin funcionalidad por ahora
    }//GEN-LAST:event_btnUniversoMarvelActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // CERRAR SESION - Regresa al menu principal
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnStrategoMarvel;
    private javax.swing.JButton btnUniversoMarvel;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}