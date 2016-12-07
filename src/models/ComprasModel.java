

package models;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

import epr.MyConnection;

public class ComprasModel {
  
  public int ID_Compras;
  public String Producto;
  public int Cantidad;
  public float Precio_Compra;
  public float Total_Producto;
  
  public String Nombre_Proveedor;
  public String Fecha;
  public float Total_Compra;
  
  public Date dia = new Date();
  
 public DefaultTableModel detalleCompras = new DefaultTableModel(new String [] {"ID Compra", "Producto", "Cantidad", "Precio Compra", "Subtotal"}, 0);
 public DefaultTableModel compras = new DefaultTableModel(new String [] {"Nombre", "Fecha", "Total"}, 0);
  
  MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");
  
 

    public int getID_Compras() {
        return ID_Compras;
    }

    public void setID_Compras(int ID_Compras) {
        this.ID_Compras = ID_Compras;
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

    public float getPrecio_Compra() {
        return Precio_Compra;
    }

    public void setPrecio_Compra(float Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }

    public float getTotal_Producto() {
        return Total_Producto;
    }

    public void setTotal_Producto(float Total_Producto) {
        this.Total_Producto = Total_Producto;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public float getTotal_Compra() {
        return Total_Compra;
    }

    public void setTotal_Compra(float Total_Compra) {
        this.Total_Compra = Total_Compra;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
  
    public void initValues() {
        String sql = "select * from detalleCompras";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        ID_Compras = connection.getInteger("id_compra");
        Producto = connection.getString("producto");
        Cantidad = connection.getInteger("cantidad");
        Precio_Compra = connection.getFloat("precio_compra");
       Total_Producto = connection.getFloat("total_producto");
    }
    
    public void initPurchase() {
        String sql = "select * from compras";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    
    public void setPurchase() {
        Nombre_Proveedor = connection.getString("nombre");
         Fecha= connection.getString("fecha");
        Total_Compra = connection.getFloat("total_compra");
    }
    
    public boolean buscarProveedor(int ID_Proveedor) {
        boolean isFound = false;
        String find = "select * from proveedores where id_proveedor = '"+ID_Proveedor+"';";
        connection.executeQuery(find);
        connection.toNext();
        if( ID_Proveedor== connection.getInteger("id_proveedor")) {
            isFound = true;
            Nombre_Proveedor = connection.getString("nombre");
        }
        return isFound;
    }
    
    public boolean buscarProducto(int ID_Producto) {
        boolean isFound = false;
        String find = "select * from productos where id_producto = '"+ID_Producto+"';";
        connection.executeQuery(find);
        connection.toNext();
        if( ID_Producto== connection.getInteger("id_producto")) {
            isFound = true;
            Producto = connection.getString("producto");
            Precio_Compra = connection.getFloat("precio_compra");
        }
        return isFound;
    } 
    
     public void agregarProducto(String Producto, int Cantidad, float Precio_Compra) {
        initValues();
        ID_Compras = connection.getInteger("id_compra");
        connection.toLast();
        ID_Compras = 7;
        Total_Producto = Cantidad * Precio_Compra;
        String add = "insert into detalleCompras(id_compra, producto, cantidad, precio_compra, total_producto)"
                   + "values ('"+ID_Compras+"', '"+Producto+"', '"+Cantidad+"', '"+Precio_Compra+"', '"+Total_Producto+"');";
        connection.executeUpdate(add);
        initValues();
        detalleCompras.addRow(new Object [] {ID_Compras, Producto, Cantidad, Precio_Compra, Total_Producto});
    }
    
     public void agregarCompra(String Nombre_Proveedor, float Total_Compra) { 
       Fecha = dia.toString();
        String add = "insert into compras(nombre, fecha, total_compra)" + "values ('"+Nombre_Proveedor+"', '"+Fecha+"', '"+Total_Compra+"');";
        connection.executeUpdate(add);
        initPurchase();
        compras.addRow(new Object[] {Nombre_Proveedor, Fecha,Total_Compra });
    }
     
}

