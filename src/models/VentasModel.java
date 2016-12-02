
package models;

import epr.MyConnection;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class VentasModel {
    
     int ID_Cliente;
    String Nombre;
    int ID_Producto;
    String Producto;
    float Precio_venta;
    int Cantidad;
    float Total;
    float Subtotal;
    String fecha;
    
    public Date dia = new Date();
    
    public DefaultTableModel tableModel = new DefaultTableModel( new String []{"ID Producto","Producto","Precio venta","Cantidad","Subtotal"}, 0);
   
    
    MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

  

    
   public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public float getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(float Precio_venta) {
        this.Precio_venta = Precio_venta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }
   
     public void initValues() {
        String sql = "select * from ventas";
        connection.executeQuery(sql);
        connection.toNext();
    }
     
     public void setValues(){
         
         ID_Cliente = connection.getInteger("id_cliente");
         Nombre = connection.getString("nombre");
         ID_Producto = connection.getInteger("id_producto");
         Producto = connection.getString("producto");
         Precio_venta = connection.getFloat("precio_venta");
         Cantidad = connection.getInteger("cantidad");
         Subtotal = connection.getFloat("subtotal");
         Total = connection.getInteger("total");
     }
     
     public boolean buscarCliente(int ID_Producto){
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
     
      
    public void agregarProducto(int ID_Cliente,String Nombre,int ID_Producto,String Producto,float Precio_Venta,int Cantidad,float Subtotal,float Total ){
        String add = "insert into ventas (id_cliente, nombre, id_producto, producto, precio_venta, cantidad, iva, subtotal, total)"
        + "values ('"+ID_Cliente+"', '"+Nombre+"', '"+ID_Producto+"', '"+Producto+"', '"+Precio_Venta+"', '"+Cantidad+"', '"+Subtotal+"', '"+Total+"');";
    connection.executeUpdate(add);
        initValues();
         tableModel.addRow(new Object[]{ID_Producto, Producto, Precio_Venta,Cantidad, Subtotal});
         fecha = String.format("%s %tB %<te, %<tY", dia);
    }
    


}

