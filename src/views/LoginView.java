/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Elias Pujol R
 */
public class LoginView extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
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

        jLabel4 = new javax.swing.JLabel();
        jbtn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
        jpf_contraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        setLayout(null);

        jbtn_login.setBackground(new java.awt.Color(102, 0, 102));
        jbtn_login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jbtn_login.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login Rounded Down-48.png"))); // NOI18N
        jbtn_login.setText("Ingresar");
        jbtn_login.setAutoscrolls(true);
        jbtn_login.setBorder(null);
        jbtn_login.setBorderPainted(false);
        jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_loginActionPerformed(evt);
            }
        });
        add(jbtn_login);
        jbtn_login.setBounds(70, 380, 280, 48);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel2.setText("Nombre de usuario");
        add(jLabel2);
        jLabel2.setBounds(20, 220, 160, 60);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Forgot Password-48.png"))); // NOI18N
        jLabel3.setText("Contraseña");
        add(jLabel3);
        jLabel3.setBounds(10, 290, 170, 40);

        jtf_usuario.setBackground(new java.awt.Color(255, 255, 255));
        jtf_usuario.setForeground(new java.awt.Color(0, 0, 0));
        jtf_usuario.setBorder(null);
        add(jtf_usuario);
        jtf_usuario.setBounds(180, 240, 220, 30);

        jpf_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpf_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        jpf_contraseña.setBorder(null);
        jpf_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpf_contraseñaActionPerformed(evt);
            }
        });
        add(jpf_contraseña);
        jpf_contraseña.setBounds(180, 290, 220, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a08ee8eb3108d8c6ae69437113b22447.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 200, 420, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Basic_Flat.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(503, 503));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 200);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_loginActionPerformed

    private void jpf_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpf_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpf_contraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JButton jbtn_login;
    public javax.swing.JPasswordField jpf_contraseña;
    public javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables
}
