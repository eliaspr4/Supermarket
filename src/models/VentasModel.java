
package models;

import epr.MyConnection;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class VentasModel {
    
    public int ID_Venta;
    public String Producto;
    public int Cantidad;
    public float Precio_venta;
    public float Total_Producto;
    
   
    
    public String Nombre_Cliente;
    public String fecha;
    public float Total_Venta;
    public Date dia = new Date();
    
     public DefaultTableModel detalleVentas = new DefaultTableModel( new String []{"ID Producto","Producto","Precio venta","Cantidad","Subtotal"}, 0);
    public DefaultTableModel ventas = new DefaultTableModel(new String []{"Nombre", "Fecha", "Total"}, 0);
    
    MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(float Precio_venta) {
        this.Precio_venta = Precio_venta;
    }

    public float getTotal_Producto() {
        return Total_Producto;
    }

    public void setTotal_Producto(float Total_Producto) {
        this.Total_Producto = Total_Producto;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal_Venta() {
        return Total_Venta;
    }

    public void setTotal_Venta(float Total_Venta) {
        this.Total_Venta = Total_Venta;
    }

    public void initValues() {
        String sql = "select * from detalleVentas";
        connection.executeQuery(sql);
        connection.toNext();
    }
     
     public void setValues(){
         
         ID_Venta = connection.getInteger("id_venta");
         Producto = connection.getString("producto");
         Cantidad = connection.getInteger("cantidad");
         Precio_venta = connection.getFloat("precio_venta");
         Total_Producto = connection.getFloat("total_producto");
     }
     
      public void initSale() {
        String sql = "select * from ventas";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setSale() {
        Nombre_Cliente = connection.getString("nombre");
        fecha = connection.getString("fecha");
        Total_Venta = connection.getFloat("total_venta");
    }
    
     public boolean buscarCliente(int ID_Cliente){
         boolean isFound = false;
        String find = "select * from clientes where id_cliente = '"+ID_Cliente+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(ID_Cliente == connection.getInteger("id_cliente")) {
            isFound = true;
         Nombre_Cliente = connection.getString("nombre");
        }
        return isFound;
    }
     
     public boolean buscarProducto(int ID_Producto) {
        boolean isFound = false;
        String find = "select * from productos where id_producto = '"+ID_Producto+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(ID_Producto == connection.getInteger("id_producto")) {
            isFound = true;
            Producto = connection.getString("producto");
            Precio_venta = connection.getFloat("precio_venta");
        }
        return isFound;
    }
     
      
    public void agregarProducto (String Producto, int Cantidad, float Precio_Venta) {
        initValues();
        ID_Venta = connection.getInteger("id_venta");
        connection.toLast();
        ID_Venta = 7;
        Total_Producto = Cantidad * Precio_Venta;
        String add = "insert into detalleVentas(id_venta, producto, cantidad, precio_venta, total_producto)"
                   + "values ('"+ID_Venta+"', '"+Producto+"', '"+Cantidad+"', '"+Precio_Venta+"', '"+Total_Producto+"');";
        connection.executeUpdate(add);
        initValues();
        detalleVentas.addRow(new Object [] {ID_Venta, Producto, Cantidad, Precio_Venta, Total_Producto});
    }
    
public void agregarCompra(String Nombre_Cliente, float Total_Venta) { 
        fecha = dia.toString();
        String add = "insert into ventas(nombre, fecha, total_venta)" + "values ('"+Nombre_Cliente+"', '"+fecha+"', '"+Total_Venta+"');";
        connection.executeUpdate(add);
        initSale();
       ventas.addRow(new Object[] {Nombre_Cliente, fecha, Total_Venta});
    }
}








    
    




