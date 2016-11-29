package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.Model_Proveedores;
import views.View_Proveedores;

public class Controller_Proveedores implements ActionListener {
    Model_Proveedores model_proveedores;
    View_Proveedores view_proveedores;

    public Controller_Proveedores(Model_Proveedores model_proveedores, View_Proveedores view_proveedores) {
        this.model_proveedores = model_proveedores;
        this.view_proveedores = view_proveedores;
        this.view_proveedores.jtf_id.setVisible(false);
        
        this.view_proveedores.jbtn_first.addActionListener(this);
        this.view_proveedores.jbtn_previous.addActionListener(this);
        this.view_proveedores.jbtn_next.addActionListener(this);
        this.view_proveedores.jbtn_last.addActionListener(this);
        
        this.view_proveedores.jbtn_add.addActionListener(this);
        this.view_proveedores.jbtn_edit.addActionListener(this);
        this.view_proveedores.jbtn_remove.addActionListener(this);
        this.view_proveedores.jbtn_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == view_proveedores.jbtn_first)
            firstProveedor();
        else if(a.getSource() == view_proveedores.jbtn_previous)
            previousProveedor();
        else if(a.getSource() == view_proveedores.jbtn_next)
            nextProveedor();
        else if(a.getSource() == view_proveedores.jbtn_last)
            lastProveedor();
        else if(a.getSource() == view_proveedores.jbtn_add)
            addProveedor();
        else if(a.getSource() == view_proveedores.jbtn_edit)
            editProveedor();
        else if(a.getSource() == view_proveedores.jbtn_remove)
            removeProveedor();
        else if(a.getSource() == view_proveedores.jbtn_find)
            findProveedor();
    }
    
    public void initView() {
        view_proveedores.setVisible(true);
        model_proveedores.initValues();
        model_proveedores.setValues();
    }
    
    public void showValues() {
        view_proveedores.jtf_id.setText("" + model_proveedores.getIDproveedor());
        view_proveedores.jtf_nombre.setText(model_proveedores.getNombre());
        view_proveedores.jtf_rfc.setText(model_proveedores.getRfc());
        view_proveedores.jtf_calle.setText(model_proveedores.getCalle());
        view_proveedores.jtf_numero.setText("" +model_proveedores.getNumero());
        view_proveedores.jtf_colonia.setText(model_proveedores.getColonia());
        view_proveedores.jtf_ciudad.setText(model_proveedores.getCiudad());
        view_proveedores.jtf_estado.setText(model_proveedores.getEstado());
        view_proveedores.jtf_nombre_contacto.setText( model_proveedores.getNombre_contacto());
        view_proveedores.jtf_telefono.setText("" +model_proveedores.getTelefono());
        view_proveedores.jtf_email.setText(model_proveedores.getEmail());
        
    }
    
    public void firstProveedor() {
        model_proveedores.moveToFirst();
        showValues();
    }
    
    public void previousProveedor() {
        model_proveedores.moveToPrevious();
        showValues();
    }
    
    public void nextProveedor() {
        model_proveedores.moveToNext();
        showValues();
    }
    
    public void lastProveedor() {
        model_proveedores.moveToLast();
        showValues();
    }
    
    public void addProveedor() { 
        try{
        String nombre = view_proveedores.jtf_nombre.getText();
        String rfc = view_proveedores.jtf_rfc.getText();
        String calle = view_proveedores.jtf_calle.getText();
        int numero = Integer.parseInt(view_proveedores.jtf_numero.getText());
        String colonia = view_proveedores.jtf_colonia.getText();
        String ciudad = view_proveedores.jtf_rfc.getText();
        String estado = view_proveedores.jtf_estado.getText();
        String nombre_contacto = view_proveedores.jtf_nombre_contacto.getText();
        int telefono = Integer.parseInt(view_proveedores.jtf_telefono.getText());
        String email = view_proveedores.jtf_email.getText();
        
        model_proveedores.addProveedor(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email);
        model_proveedores.setValues();
        showValues();
    }
        catch(NumberFormatException error) {
    }
    }
    
    public void editProveedor() {
    try {
        int IDproveedor = Integer.parseInt(view_proveedores.jtf_id.getText());
        String nombre = view_proveedores.jtf_nombre.getText();
        String rfc = view_proveedores.jtf_rfc.getText();
        String calle = view_proveedores.jtf_calle.getText();
        int numero = Integer.parseInt(view_proveedores.jtf_numero.getText());
        String colonia = view_proveedores.jtf_colonia.getText();
        String ciudad = view_proveedores.jtf_rfc.getText();
        String estado = view_proveedores.jtf_estado.getText();
        String nombre_contacto = view_proveedores.jtf_nombre_contacto.getText();
        int telefono = Integer.parseInt(view_proveedores.jtf_telefono.getText());
        String email = view_proveedores.jtf_email.getText();
        
        model_proveedores.editProveedor(IDproveedor ,nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email);
        model_proveedores.setValues();
        showValues();
    }
    catch(NumberFormatException error) {
        JOptionPane.showMessageDialog(null, "Datos no validos ,Rellena correctamente todos los campos ", "Error 66" , JOptionPane.ERROR_MESSAGE);
    }
    }
    public void removeProveedor() {
        int IDproveedor = Integer.parseInt(view_proveedores.jtf_id.getText());
         model_proveedores.removeProveedor(IDproveedor);
        model_proveedores.setValues();
        showValues();
    }
    
    public void findProveedor() {
     String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del proveedor para ser buscado:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(nombre.equals(view_proveedores.jtf_nombre.getText()))
            JOptionPane.showMessageDialog(null, nombre + " Se encuentra en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, nombre + " No se encuentra en la base de datos. Intenta de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showRecords() {
        view_proveedores.jt_proveedoresTable.setModel(model_proveedores.tableModel);
        model_proveedores.populateTable();
    }
}

