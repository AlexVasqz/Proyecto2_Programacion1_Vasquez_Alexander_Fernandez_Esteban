package STRATEGO;//QQQ

public class CrearPlayer extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel("/imagenes/background.jpeg");

    public CrearPlayer() {
        this.setContentPane(fondo);
        initComponents();
        jPanel1.setOpaque(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Jugador - Stratego");
        setResizable(false);

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Crear-Nuevo-Jugador.png"))); // NOI18N

        lblInstrucciones.setBackground(new java.awt.Color(204, 204, 204));
        lblInstrucciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucciones.setText("<html><center>El username debe ser único<br>La contraseña debe tener exactamente 5 caracteres</center></html>");

        lblUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lblUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Username:");

        lblPassword.setBackground(new java.awt.Color(204, 204, 204));
        lblPassword.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCrear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Crear-Player.png"))); // NOI18N
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Volver.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(txtUsername))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

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

                    txtUsername.setText("");
                    txtUsername.requestFocus();
                }
            } else if (password.length() != 5) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "La contraseña debe tener exactamente 5 caracteres.\nActualmente tiene " + password.length() + " caracteres.",
                        "Error en contraseña",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                txtPassword.setText("");
                txtPassword.requestFocus();
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

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
