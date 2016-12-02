
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

import models.LoginModel;
import views.LoginView;
import views.MainView;

public class LoginController implements ActionListener{
    LoginModel  loginModel;
    LoginView   loginView;
    MainView mainView;
            

    public LoginController(LoginModel loginModel,LoginView loginView, MainView mainView){
     this.loginModel = loginModel;
     this.loginView =  loginView;
     this.mainView = mainView;
    
   this.loginView.jbtn_login.addActionListener(this);
   
   initView();
   

}

    @Override
    public void actionPerformed(ActionEvent a) {
    if(a.getSource()==loginView.jbtn_login)
        entrar();
  }

    private void initView() {       
        loginView.setVisible(true);
        loginModel.initValues();
       
    }

    public void entrar() {
        String username = loginView.jtf_usuario.getText();
        String password = loginView.jpf_contraseña.getText();
        if(loginModel.login(username, password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido(a).Acabas de ingresar al sistema de punto de venta");
              mainView.jmi_login.setEnabled(false);
            if(loginModel.level.equals("Admin")); {
                mainView.jm_options.setEnabled(true);
                mainView.jmi_users.setEnabled(true);
                mainView.jm_operaciones.setEnabled(true);
                mainView.jm_reportes.setEnabled(true);
                mainView.jm_info.setEnabled(true);
             if(loginModel.level.equals("Usuario frecuente"));{
                mainView.jm_options.setEnabled(true);
                mainView.jmi_users.setEnabled(true);
                
            } 
             
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No estás registrado en el sistema. Usuario invalido");
        }
    }
  
    }

    