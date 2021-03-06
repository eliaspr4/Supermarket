package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] AE) {
  
        LoginModel loginModel = new LoginModel();
        LoginView  loginView = new  LoginView();  
        
        UsuariosModel usuariosModel = new UsuariosModel();
        View_Usuarios view_Usuarios = new View_Usuarios();
        UsuariosController usuariosController = new UsuariosController(usuariosModel,view_Usuarios);
        
        ClientesModel customersModel = new ClientesModel();
        CustomersView customersView = new CustomersView();
        ClientesController customersController = new ClientesController(customersModel, customersView);
        
        Model_Proveedores model_proveedores = new Model_Proveedores();
        View_Proveedores view_proveedores = new View_Proveedores();
        Controller_Proveedores controller_proveedores = new Controller_Proveedores(model_proveedores, view_proveedores);
        
        Model_Productos model_productos = new Model_Productos();
        View_Productos view_productos = new View_Productos();
        Controller_Productos controller_productos = new Controller_Productos(model_productos, view_productos);
        
        ComprasModel comprasModel = new ComprasModel();
        ComprasView comprasView = new ComprasView();
        ComprasController comprasController = new ComprasController(comprasModel, comprasView);
        
        VentasModel ventasModel = new VentasModel();
        VentasView ventasView = new VentasView();
        VentasController ventasController = new VentasController(ventasModel, ventasView);
        
        InfoModel infoModel = new InfoModel();
        InfoView  infoView = new InfoView();
        InfoController infoController = new InfoController(infoView, infoModel);
        
        JPanel paneArray[] = new JPanel[8];
        paneArray[0] = loginView;
        paneArray[1] = customersView;
        paneArray[2] = view_proveedores;
        paneArray[3] = view_productos;
        paneArray[4] = view_Usuarios;
        paneArray[5] = ventasView;
        paneArray[6] = comprasView;
        paneArray[7] = infoView;
                
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
        
        LoginController loginController = new LoginController (loginModel, loginView, mainView);       
    } 
}
