package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] epr) {
        LoginModel loginModel = new LoginModel();
        LoginView  loginView = new  LoginView();
        LoginController loginController = new LoginController (loginModel, loginView);
        
        CustomersModel customersModel = new CustomersModel();
        CustomersView customersView = new CustomersView();
        CustomersController customersController = new CustomersController(customersModel, customersView);
        
        JPanel paneArray[] = new JPanel[2];
        paneArray[0] = customersView;
        
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    } 
}
