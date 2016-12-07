
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.UsuariosModel;
import views.View_Usuarios;

public class UsuariosController implements ActionListener{
   UsuariosModel usuariosModel;
   View_Usuarios view_Usuarios;
    
   
 public UsuariosController( UsuariosModel usuariosModel,View_Usuarios view_Usuarios){
    this.usuariosModel = usuariosModel;
    this.view_Usuarios = view_Usuarios;
    
    
    this.view_Usuarios.jbtn_primero.addActionListener(this);
    this.view_Usuarios.jbtn_previo.addActionListener(this);
    this.view_Usuarios.jbtn_siguiente.addActionListener(this);
    this.view_Usuarios.jbtn_ultimo.addActionListener(this);
    
    this.view_Usuarios.jbtn_agregarUsuario.addActionListener(this);
    this.view_Usuarios.jbtn_editarUsuario.addActionListener(this);
    this.view_Usuarios.jbtn_buscarUsuario.addActionListener(this);
    
     initView();
     showRecords();
}
    

@Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == view_Usuarios.jbtn_primero)
            firstUser();
        else if(a.getSource() == view_Usuarios.jbtn_previo)
            previousUser();
        else if(a.getSource() == view_Usuarios.jbtn_siguiente)
            nextUser();
        else if(a.getSource() == view_Usuarios.jbtn_ultimo)
            lastUser();
        else if(a.getSource() == view_Usuarios.jbtn_agregarUsuario)
            addUser();
        else if(a.getSource() == view_Usuarios.jbtn_editarUsuario)
            editUser();
        else if(a.getSource() == view_Usuarios.jbtn_buscarUsuario)
            findUser();
    }

    private void initView() {
        usuariosModel.initValues();
        usuariosModel.setValues();
    }
 private void showValues() {
    
        view_Usuarios.jtf_nombre.setText(usuariosModel.getName());
        view_Usuarios.jtf_usuario.setText(usuariosModel.getUsername());
        view_Usuarios.jpf_contraseña.setText(usuariosModel.getPassword());
        view_Usuarios.jtf_nivel.setText(usuariosModel.getLevel());
        view_Usuarios.jtf_status.setText(usuariosModel.getStatus());
 }
    
     private void firstUser() {
      usuariosModel.moveToFirst();
      showValues();
    }

    private void previousUser() {
      usuariosModel.moveToPrevious();
      showValues();
    }

    private void nextUser() {
       
     usuariosModel.moveToNext();
     showValues();
    }

    private void lastUser() {
     usuariosModel.moveToLast();
      showValues();
    }

    private void addUser() {
    String name = view_Usuarios.jtf_nombre.getText();
    String username = view_Usuarios.jtf_usuario.getText();
    String password = view_Usuarios.jpf_contraseña.getText();
    String level = view_Usuarios.jtf_nivel.getText();
    String status = view_Usuarios.jtf_status.getText();
    usuariosModel.addUser(name,username,password, level, status);
    usuariosModel.setValues();
    showValues();
    }

    private void editUser() {
      String name = view_Usuarios.jtf_nombre.getText();
    String username = view_Usuarios.jtf_usuario.getText();
    String password = view_Usuarios.jpf_contraseña.getText();
    String level = view_Usuarios.jtf_nivel.getText();
    String status = view_Usuarios.jtf_status.getText();
    usuariosModel.editUser(name,username,password, level, status);
    usuariosModel.setValues();
    showValues(); 
    }

    private void findUser() {
        String username = JOptionPane.showInputDialog(null, "Introduce un nombre de usuario para ser buscado:", "Búsqueda por nombre de usuario", JOptionPane.INFORMATION_MESSAGE);
        if(username.equals(view_Usuarios.jtf_usuario.getText()))
            JOptionPane.showMessageDialog(null, username + " Se encuentra en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, username + " No se encuentra registrado en la base de datos. Intenta de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }

    private void showRecords() {
        view_Usuarios.jt_usuarios.setModel(usuariosModel.tableModel);
        usuariosModel.populateTable();
    }

   
}