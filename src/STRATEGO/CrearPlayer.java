package STRATEGO;

public class CrearPlayer extends javax.swing.JFrame {

    public CrearPlayer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Jugador - Stratego");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CREAR NUEVO JUGADOR");

        lblInstrucciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucciones.setText("<html><center>El username debe ser único<br>La contraseña debe tener exactamente 5 caracteres</center></html>");

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsuario.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassword.setText("Password (5 chars):");

        btnCrear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrear.setText("CREAR JUGADOR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String username = usuarioField.getText().trim();
        String password = new String(passwordField.getPassword());
        
       
        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Por favor, complete todos los campos", 
                "Error", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
     
        boolean creado = Usuarios.createPlayer(username, password);
        
        if (creado) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "¡Jugador creado exitosamente!\nUsername: " + username, 
                "Éxito", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
            new menu().setVisible(true);
            dispose(); 
        } else {
         
            if (Usuarios.usernameExists(username)) {
                int respuesta = javax.swing.JOptionPane.showConfirmDialog(this, 
                    "El username '" + username + "' ya existe.\n¿Desea intentar con otro username?", 
                    "Username no disponible", 
                    javax.swing.JOptionPane.YES_NO_OPTION,
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                
                if (respuesta == javax.swing.JOptionPane.NO_OPTION) {
                   
                    new menu().setVisible(true);
                    dispose();
                } else {
               
                    usuarioField.setText("");
                    usuarioField.requestFocus();
                }
            } else if (password.length() != 5) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "La contraseña debe tener exactamente 5 caracteres.\nActualmente tiene " + password.length() + " caracteres.", 
                    "Error en contraseña", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                passwordField.setText("");
                passwordField.requestFocus();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Error al crear el jugador. Intente nuevamente.", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     
        new menu().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}