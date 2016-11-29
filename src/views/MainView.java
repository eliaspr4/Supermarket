
package views;


public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jmb_menu = new javax.swing.JMenuBar();
        jm_files = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_users = new javax.swing.JMenuItem();
        jm_options = new javax.swing.JMenu();
        jmi_customers = new javax.swing.JMenuItem();
        jmi_proveedores = new javax.swing.JMenuItem();
        jmi_productos = new javax.swing.JMenuItem();
        jmi_salida = new javax.swing.JMenuItem();
        jm_operaciones = new javax.swing.JMenu();
        jmi_compras = new javax.swing.JMenuItem();
        jmi_ventas = new javax.swing.JMenuItem();
        jm_reportes = new javax.swing.JMenu();
        jm_info = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 150, 136));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Supermarket_Banner.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );

        jmb_menu.setBackground(new java.awt.Color(51, 102, 255));
        jmb_menu.setBorder(null);
        jmb_menu.setPreferredSize(new java.awt.Dimension(202, 45));

        jm_files.setBackground(new java.awt.Color(0, 102, 255));
        jm_files.setForeground(new java.awt.Color(51, 51, 51));
        jm_files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        jm_files.setText("Inicio");
        jm_files.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_login.setBackground(new java.awt.Color(255, 255, 255));
        jmi_login.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_login.setForeground(new java.awt.Color(51, 51, 51));
        jmi_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login (1).png"))); // NOI18N
        jmi_login.setText("Iniciar sesión");
        jm_files.add(jmi_login);

        jmi_users.setBackground(new java.awt.Color(255, 255, 255));
        jmi_users.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_users.setForeground(new java.awt.Color(51, 51, 51));
        jmi_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/people.png"))); // NOI18N
        jmi_users.setText("Usuarios");
        jmi_users.setBorder(null);
        jmi_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_usersActionPerformed(evt);
            }
        });
        jm_files.add(jmi_users);

        jmb_menu.add(jm_files);

        jm_options.setBackground(new java.awt.Color(0, 102, 255));
        jm_options.setBorder(null);
        jm_options.setForeground(new java.awt.Color(51, 51, 51));
        jm_options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/catalog.png"))); // NOI18N
        jm_options.setText("Catálogo");
        jm_options.setActionCommand("Menú  principal de la  tienda");
        jm_options.setContentAreaFilled(false);
        jm_options.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_customers.setBackground(new java.awt.Color(255, 255, 255));
        jmi_customers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_customers.setForeground(new java.awt.Color(51, 51, 51));
        jmi_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer-service.png"))); // NOI18N
        jmi_customers.setText("Clientes");
        jmi_customers.setBorder(null);
        jmi_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_customersActionPerformed(evt);
            }
        });
        jm_options.add(jmi_customers);

        jmi_proveedores.setBackground(new java.awt.Color(255, 255, 255));
        jmi_proveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmi_proveedores.setForeground(new java.awt.Color(51, 51, 51));
        jmi_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hotel-supplier.png"))); // NOI18N
        jmi_proveedores.setText("Proveedores");
        jmi_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_proveedoresActionPerformed(evt);
            }
        });
        jm_options.add(jmi_proveedores);

        jmi_productos.setBackground(new java.awt.Color(255, 255, 255));
        jmi_productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmi_productos.setForeground(new java.awt.Color(51, 51, 51));
        jmi_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/products.png"))); // NOI18N
        jmi_productos.setText("Productos");
        jm_options.add(jmi_productos);

        jmi_salida.setBackground(new java.awt.Color(255, 255, 255));
        jmi_salida.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_salida.setForeground(new java.awt.Color(51, 51, 51));
        jmi_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close Window-30.png"))); // NOI18N
        jmi_salida.setText("Cerrar sesión");
        jmi_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salidaActionPerformed(evt);
            }
        });
        jm_options.add(jmi_salida);

        jmb_menu.add(jm_options);

        jm_operaciones.setBackground(new java.awt.Color(51, 102, 255));
        jm_operaciones.setBorder(null);
        jm_operaciones.setForeground(new java.awt.Color(51, 51, 51));
        jm_operaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bank Cards_35.png"))); // NOI18N
        jm_operaciones.setText("Operaciones");
        jm_operaciones.setBorderPainted(false);
        jm_operaciones.setContentAreaFilled(false);
        jm_operaciones.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_compras.setBackground(new java.awt.Color(255, 255, 255));
        jmi_compras.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_compras.setForeground(new java.awt.Color(51, 51, 51));
        jmi_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping Cart Loaded-30.png"))); // NOI18N
        jmi_compras.setText("Compras");
        jm_operaciones.add(jmi_compras);

        jmi_ventas.setBackground(new java.awt.Color(255, 255, 255));
        jmi_ventas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_ventas.setForeground(new java.awt.Color(51, 51, 51));
        jmi_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Banknotes-30.png"))); // NOI18N
        jmi_ventas.setText("Ventas");
        jmi_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ventasActionPerformed(evt);
            }
        });
        jm_operaciones.add(jmi_ventas);

        jmb_menu.add(jm_operaciones);

        jm_reportes.setBackground(new java.awt.Color(51, 102, 255));
        jm_reportes.setBorder(null);
        jm_reportes.setForeground(new java.awt.Color(51, 51, 51));
        jm_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report.png"))); // NOI18N
        jm_reportes.setText("Reportes");
        jm_reportes.setBorderPainted(false);
        jm_reportes.setContentAreaFilled(false);
        jm_reportes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmb_menu.add(jm_reportes);

        jm_info.setBackground(new java.awt.Color(51, 102, 255));
        jm_info.setBorder(null);
        jm_info.setForeground(new java.awt.Color(51, 51, 51));
        jm_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Info-40.png"))); // NOI18N
        jm_info.setText("Acerca de");
        jm_info.setBorderPainted(false);
        jm_info.setContentAreaFilled(false);
        jm_info.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmb_menu.add(jm_info);

        setJMenuBar(jmb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_customersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_customersActionPerformed

    private void jmi_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_salidaActionPerformed

    private void jmi_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_usersActionPerformed

    private void jmi_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_proveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_proveedoresActionPerformed

    private void jmi_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_ventasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel;
    public javax.swing.JMenu jm_files;
    public javax.swing.JMenu jm_info;
    public javax.swing.JMenu jm_operaciones;
    public javax.swing.JMenu jm_options;
    public javax.swing.JMenu jm_reportes;
    private javax.swing.JMenuBar jmb_menu;
    public javax.swing.JMenuItem jmi_compras;
    public javax.swing.JMenuItem jmi_customers;
    public javax.swing.JMenuItem jmi_login;
    public javax.swing.JMenuItem jmi_productos;
    public javax.swing.JMenuItem jmi_proveedores;
    public javax.swing.JMenuItem jmi_salida;
    public javax.swing.JMenuItem jmi_users;
    public javax.swing.JMenuItem jmi_ventas;
    // End of variables declaration//GEN-END:variables
}
