
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

import models.ComprasModel;
import views.ComprasView;

public class ComprasController implements ActionListener {
 ComprasModel comprasModel;
 ComprasView  comprasView;
  Date dia = new Date();
    
 public ComprasController ( ComprasModel comprasModel,ComprasView  comprasView){
     this.comprasModel = comprasModel;
     this.comprasView  = comprasView;
     this.dia =  dia;
     
     this.comprasView.jbtn_buscarProveedor.addActionListener(this);
     this.comprasView.jbtn_buscarProducto.addActionListener(this);
     this.comprasView.jbtn_agregarProducto.addActionListener(this);
     this.comprasView.jbtn_eliminarProducto.addActionListener(this);
     
     this.comprasView.jbtn_nuevaCompra.addActionListener(this);
     this.comprasView.jbtn_guardarCompra.addActionListener(this);
 
       initView();
       showRecords();
 }
         @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == comprasView.jbtn_buscarProveedor)
            buscarProveedor();
        else if(a.getSource() == comprasView.jbtn_buscarProducto)
            buscarProducto();
        else if(a.getSource() == comprasView.jbtn_agregarProducto)
            agregarProducto();
        else if(a.getSource() == comprasView.jbtn_eliminarProducto)
            eliminarProducto();
        else if(a.getSource() == comprasView.jbtn_nuevaCompra)
            nuevaCompra();
        else if(a.getSource() == comprasView.jbtn_guardarCompra)
            guardarCompra();
    }

    private void initView() {
    
    comprasModel.initValues();
    comprasModel.setValues();
    comprasModel.initPurchase();
    comprasModel.setPurchase();

    }

    private void buscarProveedor() {
        try {
            int ID_Proveedor = Integer.parseInt(comprasView.jtf_IdProveedor.getText());
            if(comprasModel.buscarProveedor(ID_Proveedor))
                comprasView.jtf_Nombre.setText(comprasModel.Nombre_Proveedor);
            else {
                JOptionPane.showMessageDialog(null, "No existe este registro en la tabla." , "Aviso", JOptionPane.WARNING_MESSAGE);
               comprasView.jtf_IdProveedor.setText("");
                comprasView.jtf_Nombre.setText("");
            }
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void buscarProducto() {
        
   try {
            int productID = Integer.parseInt(comprasView.jtf_IdProducto.getText());
            if(comprasModel.buscarProducto(productID)) {
                comprasView.jtf_Producto.setText(comprasModel.Producto);
                comprasView.jtf_PrecioCompra.setText("" + comprasModel.Precio_Compra);
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe este registro en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
               comprasView.jtf_IdProducto.setText("");
               comprasView.jtf_Producto.setText("");
               comprasView.jtf_PrecioCompra.setText("");
            }
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
  private void agregarProducto() {
       
    try {           
            int ID_Compra = comprasModel.getID_Compras();           
            String Producto = comprasView.jtf_Producto.getText();
            int Cantidad = Integer.parseInt(comprasView.jtf_Cantidad.getText());
            float Precio_Compra = Float.parseFloat(comprasView.jtf_PrecioCompra.getText());
            float Total_Producto = (Cantidad* Precio_Compra);
            
            comprasView.jtf_fecha.setText(dia.toString());
            comprasView.jtf_Subtotal.setText("" + Total_Producto);
            comprasModel.agregarProducto(Producto,Cantidad, Precio_Compra);
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void eliminarProducto() {
    comprasView.jt_detalleCompras.remove(comprasView.jt_detalleCompras.getSelectedRow());
    }
    
    private void nuevaCompra() {
        JOptionPane.showMessageDialog(null, "Ya puedes realizar una nueva compra.");
        comprasView.jtf_IdProveedor.setText("");
       comprasView.jtf_Nombre.setText("");
       comprasView.jtf_IdProducto.setText("");
        comprasView.jtf_Producto.setText("");
       comprasView.jtf_PrecioCompra.setText("");
       comprasView.jtf_Cantidad.setText("");
       comprasView.jtf_fecha.setText("");
      comprasView.jtf_Subtotal.setText("");
        comprasView.jtf_Total.setText("");
        for(int i = 0; i < comprasModel.detalleCompras.getRowCount(); i++) {
           comprasModel.detalleCompras.removeRow(i);
            i -= 1;
        }
        for(int i = 0; i < comprasModel.compras.getColumnCount(); i++) {
           comprasModel.compras.removeRow(i);
            i -= 1;
        }
    }
    private void guardarCompra() {
        
     JOptionPane.showMessageDialog(null, "Tu compra se ha realizado exitosamente.", "Compra completada", JOptionPane.INFORMATION_MESSAGE);
            String Nombre_Proveedor = comprasView.jtf_Nombre.getText();
            String fecha = comprasView.jtf_fecha.getText();
            float Venta_Total = 0;
            for(int i = 0; i < comprasView.jt_detalleCompras.getRowCount(); i++) {
               float total = Float.parseFloat(comprasView.jt_detalleCompras.getValueAt(i, 4) + "");
               Venta_Total = Venta_Total + total;
            }
            comprasView.jtf_Total.setText("" + Venta_Total);
           comprasModel.agregarCompra(Nombre_Proveedor, Venta_Total);
    }

private void showRecords() {
 comprasView.jt_detalleCompras.setModel(comprasModel.detalleCompras);
 comprasView.jt_compras.setModel(comprasModel.compras);
}

}

