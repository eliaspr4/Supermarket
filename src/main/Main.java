package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {


    public static void main(String[] AE) {

  
        LoginModel loginModel = new LoginModel();
        LoginView  loginView = new  LoginView();    
        
        ClientesModel customersModel = new ClientesModel();
        CustomersView customersView = new CustomersView();
        ClientesController customersController = new ClientesController(customersModel, customersView);
        
        Model_Proveedores model_proveedores = new Model_Proveedores();
        View_Proveedores view_proveedores = new View_Proveedores();
        Controller_Proveedores controller_proveedores = new Controller_Proveedores(model_proveedores, view_proveedores);
        
        Model_Productos model_productos = new Model_Productos();
        View_Productos view_productos = new View_Productos();
        Controller_Productos controller_productos = new Controller_Productos(model_productos, view_productos);
        
        JPanel paneArray[] = new JPanel[4];
        paneArray[0] = loginView;
        paneArray[1] = customersView;
        paneArray[2] = view_proveedores;
        paneArray[3] = view_productos;
       
        
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
        
        LoginController loginController = new LoginController (loginModel, loginView, mainView);
    } 
}
