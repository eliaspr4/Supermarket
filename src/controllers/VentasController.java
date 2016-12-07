
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

import models.VentasModel;
import views.VentasView;


public class VentasController implements ActionListener {
  VentasModel ventasModel;
  VentasView ventasView;
   public Date dia = new Date();
  
  public  VentasController (VentasModel ventasModel, VentasView ventasView){
      this.ventasModel = ventasModel;
      this.ventasView = ventasView;
      this.dia = dia;
     
     this.ventasView.jbtn_buscarCliente.addActionListener(this);
     this.ventasView.jbtn_buscarProducto.addActionListener(this);
     this.ventasView.jbtn_agregarProducto.addActionListener(this);
     this.ventasView.jbtn_eliminarProducto.addActionListener(this);
     this.ventasView.jbtn_nuevaVenta.addActionListener(this);
     this.ventasView.jbtn_guardarVenta.addActionListener(this);
     
     initView();
     showRecords();
      
}
    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource()==ventasView.jbtn_buscarCliente)
            buscarClientes();
        if(a.getSource()==ventasView.jbtn_buscarProducto)
            buscarProducto();
        if(a.getSource()==ventasView.jbtn_agregarProducto)
            agregarProducto();
        if(a.getSource()==ventasView.jbtn_eliminarProducto)
            eliminarProducto();
        if(a.getSource()==ventasView.jbtn_nuevaVenta)
            nuevaVenta();
        if(a.getSource()==ventasView.jbtn_guardarVenta)
          guardarVenta();
    }

    private void initView() {
        ventasModel.initValues();
        ventasModel.setValues();
        ventasModel.initSale();
        ventasModel.setSale();
    }

   

    private void buscarClientes() {
         try {
            int ID_Cliente = Integer.parseInt(ventasView.jtf_IdCliente.getText());
            if(ventasModel.buscarCliente(ID_Cliente))
                ventasView.jtf_Nombre.setText(ventasModel.Nombre_Cliente);
            else {
                JOptionPane.showMessageDialog(null, "Este registro no existe en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
                ventasView.jtf_IdCliente.setText("");
                ventasView.jtf_Nombre.setText("");
            }
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscarProducto() {
         try {
            int ID_Producto = Integer.parseInt(ventasView.jtf_IdProducto.getText());
            if(ventasModel.buscarProducto(ID_Producto)) {
                ventasView.jtf_Producto.setText(ventasModel.Producto);
                ventasView.jtf_PrecioVenta.setText("" + ventasModel.Precio_venta);
            }
            else {
                JOptionPane.showMessageDialog(null, "Este registro no existe en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
               ventasView.jtf_IdProducto.setText("");
                ventasView.jtf_Producto.setText("");
                ventasView.jtf_PrecioVenta.setText("");
            }
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Valor numérico escrito incorrectamente o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }

    private void agregarProducto() {
      try {           
            int ID_Venta = ventasModel.getID_Venta();           
            String Producto = ventasView.jtf_Producto.getText();
            int Cantidad = Integer.parseInt(ventasView.jtf_Cantidad.getText());
            float Precio_Venta = Float.parseFloat(ventasView.jtf_PrecioVenta.getText());
            float Total_Producto = (Cantidad * Precio_Venta);
            
            ventasView.jtf_fecha.setText(dia.toString());
            ventasView.jtf_Subtotal.setText("" + Total_Producto);
            ventasModel.agregarProducto(Producto, Cantidad, Precio_Venta);
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    private void eliminarProducto() {
        
      ventasView.jt_detalleVentas.remove(ventasView.jt_detalleVentas.getSelectedRow());
    }

    private void nuevaVenta() {
     JOptionPane.showMessageDialog(null, "Ya puedes realizar una nueva venta.");
     ventasView.jtf_IdCliente.setText("");
     ventasView.jtf_Nombre.setText("");
     ventasView.jtf_IdProducto.setText("");
     ventasView.jtf_Producto.setText("");
     ventasView.jtf_PrecioVenta.setText("");
     ventasView.jtf_Cantidad.setText("");
     ventasView.jtf_Subtotal.setText("");
     ventasView.jtf_Total.setText("");
        for(int i = 0; i < ventasModel.detalleVentas.getRowCount(); i++) {
         ventasModel.ventas.removeRow(i);
            i -= 1;
        }
       for(int i = 0; i < ventasModel.ventas.getColumnCount(); i++) {
            ventasModel.ventas.removeRow(i);
            i -= 1;
        }
    }
    

    public void guardarVenta() {
            JOptionPane.showMessageDialog(null, "Tu compra se ha realizado exitosamente.", "Compra realizada", JOptionPane.INFORMATION_MESSAGE);
            String Nombre_Cliente = ventasView.jtf_Nombre.getText();
            String fecha = ventasView.jtf_fecha.getText();
            float Total_Venta = 0;
            for(int i = 0; i < ventasView.jt_detalleVentas.getRowCount(); i++) {
                float total = Float.parseFloat(ventasView.jt_detalleVentas.getValueAt(i, 4) + "");
                Total_Venta = Total_Venta + total;
            } 
           ventasView.jtf_Total.setText("" + Total_Venta);
           ventasModel.agregarCompra(Nombre_Cliente, Total_Venta);
    }
    

    private void showRecords() {
       ventasView.jt_detalleVentas.setModel(ventasModel.detalleVentas);
        ventasView.jt_ventas.setModel(ventasModel.ventas);
    }
}

