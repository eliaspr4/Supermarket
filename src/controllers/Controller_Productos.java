package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.Model_Productos;
import views.View_Productos;

public class Controller_Productos implements ActionListener {
    Model_Productos model_productos;
    View_Productos view_productos;

    public Controller_Productos(Model_Productos model_productos, View_Productos view_productos) {
        this.model_productos = model_productos;
        this.view_productos = view_productos;
        this.view_productos.jtf_id.setVisible(false);
        
        this.view_productos.jbtn_first.addActionListener(this);
        this.view_productos.jbtn_previous.addActionListener(this);
        this.view_productos.jbtn_next.addActionListener(this);
        this.view_productos.jbtn_last.addActionListener(this);
        
        this.view_productos.jbtn_add.addActionListener(this);
        this.view_productos.jbtn_edit.addActionListener(this);
        this.view_productos.jbtn_remove.addActionListener(this);
        this.view_productos.jbtn_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == view_productos.jbtn_first)
            firstProducto();
        else if(a.getSource() == view_productos.jbtn_previous)
            previousProducto();
        else if(a.getSource() == view_productos.jbtn_next)
            nextProducto();
        else if(a.getSource() == view_productos.jbtn_last)
            lastProducto();
        else if(a.getSource() == view_productos.jbtn_add)
            addProducto();
        else if(a.getSource() == view_productos.jbtn_edit)
            editProducto();
        else if(a.getSource() == view_productos.jbtn_remove)
            removeProducto();
        else if(a.getSource() == view_productos.jbtn_find)
            findProducto();
    }
    
    public void initView() {
        view_productos.setVisible(true);
        model_productos.initValues();
        model_productos.setValues();
    }
    
    public void showValues() {
        view_productos.jtf_id.setText("" + model_productos.getIDproducto());
        view_productos.jtf_producto.setText(model_productos.getProducto());
        view_productos.jtf_descripcion.setText(model_productos.getDescripcion());
        view_productos.jtf_precio_venta.setText("" + model_productos.getPrecio_venta());
        view_productos.jtf_precio_compra.setText("" +model_productos.getPrecio_compra());
        view_productos.jtf_existencias.setText("" + model_productos.getExistencias());
        
    }
    
    public void firstProducto() {
        model_productos.moveToFirst();
        showValues();
    }
    
    public void previousProducto() {
        model_productos.moveToPrevious();
        showValues();
    }
    
    public void nextProducto() {
        model_productos.moveToNext();
        showValues();
    }
    
    public void lastProducto() {
        model_productos.moveToLast();
        showValues();
    }
    
    public void addProducto() {
           try {
        String producto = view_productos.jtf_producto.getText();
        String descripcion = view_productos.jtf_descripcion.getText();
        float precio_venta = Float.parseFloat(view_productos.jtf_precio_venta.getText());
        float precio_compra = Float.parseFloat(view_productos.jtf_precio_compra.getText());
        int existencias = Integer.parseInt(view_productos.jtf_existencias.getText());
        model_productos.addProducto(producto, descripcion, precio_venta, precio_compra, existencias);
        model_productos.setValues();
        showValues();
    }
           catch(NumberFormatException error) {
    }
    }
    public void editProducto() {
          try {
        int IDproducto = Integer.parseInt(view_productos.jtf_id.getText());
        String producto = view_productos.jtf_producto.getText();
        String descripcion = view_productos.jtf_descripcion.getText();
        float precio_venta = Float.parseFloat(view_productos.jtf_precio_venta.getText());
        float precio_compra = Float.parseFloat(view_productos.jtf_precio_compra.getText());
        int existencias = Integer.parseInt(view_productos.jtf_existencias.getText());
        
        model_productos.editProducto(IDproducto ,producto, descripcion, precio_venta, precio_compra,existencias);
        model_productos.setValues();
        showValues();
    }
           catch(NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Datos no validos ,Introduzca correctamente todos los campos ", "Error 66" , JOptionPane.ERROR_MESSAGE);
    }
    }
    public void removeProducto() {
        int IDproducto = Integer.parseInt(view_productos.jtf_id.getText());
         model_productos.removeProductos(IDproducto);
         model_productos.setValues();
        showValues();
    }
    
    public void findProducto() {
     String producto = JOptionPane.showInputDialog(null, "Introduce el nombre del producto para ser buscado:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(producto.equals(view_productos.jtf_producto.getText()))
            JOptionPane.showMessageDialog(null, producto + " Se encuentra en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, producto + " No se encuentra en la base de datos. Intenta de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showRecords() {
        view_productos.jt_productosTable.setModel(model_productos.tableModel);
        model_productos.populateTable();
    }
}

