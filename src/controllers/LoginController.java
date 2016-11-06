
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.LoginModel;
import views.LoginView;


public class LoginController implements ActionListener{
    LoginModel  loginModel;
    LoginView   loginView;
            

    public LoginController(LoginModel loginModel,LoginView loginView){
     this.loginModel = loginModel;
     this.loginView =  loginView;
    
   this.loginView.jtf_username.addActionListener(this);
   this.loginView.jpf_password.addActionListener(this);
   this.loginView.jbtn_login.addActionListener(this);
   
   initView();
   

}

    public LoginController(LoginController loginController, LoginController loginController0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent a) {
    if(a.getSource()==loginView.jbtn_login)
        if (a.equals("Admin")){
            
        }
        ; 
  }

    private void initView() {
       
        loginView.setVisible(true);
        loginModel.initValues();
       loginModel.setValues();
    }

    
    }

    