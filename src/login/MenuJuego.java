package login;

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
            lblBienvenida.setText("STRATEGO");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        btnNuevoJuego = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Stratego");
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        lblBienvenida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb  

        btnNuevoJuego.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNuevoJuego.setText("NUEVO JUEGO");
        btnNuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoJuegoActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEstadisticas.setText("ESTADÍSTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrarSesion.setText("CERRAR SESIÓN");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnNuevoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoJuegoActionPerformed
      
    }//GEN-LAST:event_btnNuevoJuegoActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
      
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(this, 
            "¿Está seguro que desea cerrar sesión?", 
            "Confirmar", 
            javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
           
            new menu().setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnNuevoJuego;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}