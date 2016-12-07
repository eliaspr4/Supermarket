package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.MainModel;
import views.*;

import javax.swing.JPanel;

public class MainController implements ActionListener {
    MainModel mainModel;
    
    MainView mainView;
    CustomersView customersView;
    View_Proveedores view_proveedores;
    View_Productos view_productos;
    View_Usuarios  view_usuarios;
    
    JPanel paneArray [];

    public MainController(MainModel mainModel, MainView mainView, JPanel[] paneArray) {
        this.mainModel = mainModel;
        this.mainView = mainView;
        this.paneArray = paneArray;
        
        this.mainView.jmi_login.addActionListener(this);
        this.mainView.jmi_customers.addActionListener(this);
        this.mainView.jmi_salida.addActionListener(this);
        
        this.mainView.jmi_proveedores.addActionListener(this);
        this.mainView.jmi_productos.addActionListener(this);
        this.mainView.jmi_users.addActionListener(this);
        
        this.mainView.jmi_compras.addActionListener(this);
        this.mainView.jmi_ventas.addActionListener(this);
        this.mainView.jmi_info.addActionListener(this);
        
        
        initView();
        
    }

    @Override
    public void actionPerformed(ActionEvent x) {
        if(x.getSource() == mainView.jmi_login)
            loginPanel();
        else if(x.getSource()==mainView.jmi_users)
            usersPane();
         else if(x.getSource() == mainView.jmi_salida)
            close();
         
        else if(x.getSource() == mainView.jmi_customers)
            customersPane();
        
        else if(x.getSource()== mainView.jmi_proveedores)
             proveedoresPane();
        else if(x.getSource()== mainView.jmi_productos)
             productosPane();
        
        
        else if(x.getSource()== mainView.jmi_compras)
             comprasPane();
        else if(x.getSource()==mainView.jmi_ventas)
            ventasPane();
        else if(x.getSource()==mainView.jmi_info)
            infoPane();
    }
    
    public void initView() {
        mainView.setTitle("Shop");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
        
        mainView.jm_options.setEnabled(false);
        mainView.jmi_users.setEnabled(false);
             
        mainView.jmi_customers.setEnabled(false);
        mainView.jmi_proveedores.setEnabled(false);
        mainView.jmi_productos.setEnabled(false);
        
        mainView.jm_operaciones.setEnabled(false);       
        mainView.jmi_ventas.setEnabled(false);
        mainView.jmi_compras.setEnabled(false);
       
        
    }
    
    public void loginPanel() {
        mainView.setContentPane(paneArray[0]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void customersPane() {
        mainView.setContentPane(paneArray[1]);
        mainView.revalidate();
        mainView.repaint();
    }
    public void proveedoresPane() {
        mainView.setContentPane(paneArray[2]);
        mainView.revalidate();
        mainView.repaint();
    }
    public void productosPane() {
        mainView.setContentPane(paneArray[3]);
        mainView.revalidate();
        mainView.repaint();
    }

   private void usersPane() {
        mainView.setContentPane(paneArray[4]);
        mainView.revalidate();
        mainView.repaint();
    }
     private void comprasPane() {
          mainView.setContentPane(paneArray[5]);
          mainView.revalidate();
          mainView.repaint();
    }

    private void ventasPane() {
         mainView.setContentPane(paneArray[6]);
         mainView.revalidate();
         mainView.repaint();
    }

     private void infoPane() {
         mainView.setContentPane(paneArray[7]);
         mainView.revalidate();
         mainView.repaint();
    }
public void close() {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION)
            System.exit(0);
    }

  

  
    


}
