package models;

import epr.MyConnection;
import javax.swing.table.DefaultTableModel;

public class Model_Productos {
    private int IDproducto;    
    private String producto;
    
    private String descripcion;
    private float precio_compra;
    private float precio_venta;
    private int existencias;
        
    public DefaultTableModel tableModel = new DefaultTableModel(new String []{"ID", "producto", "descripcion", "precio compra", "precio venta", "existencias"}, 0);
    
    MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

    
    public int getIDproducto() {
        return IDproducto;
    }

    
    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    
    public String getProducto() {
        return producto;
    }

  
    public void setProducto(String producto) {
        this.producto = producto;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public float getPrecio_compra() {
        return precio_compra;
    }

   
    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

  
    public float getPrecio_venta() {
        return precio_venta;
    }

   
    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

   
    public int getExistencias() {
        return existencias;
    }

   
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void initValues() {
        String sql = "select * from productos";
        connection.executeQuery(sql);
        connection.toNext();
    }

    public void setValues() {
        IDproducto = connection.getInteger("id_producto");
        producto = connection.getString("producto");
        descripcion = connection.getString("descripcion");
        precio_compra = connection.getFloat("precio_compra");
        precio_venta = connection.getFloat("precio_venta");
        existencias = connection.getInteger("existencias");       
    }


    public void moveToFirst() {
        connection.toFirst();
        setValues();
    }
    
    public void moveToPrevious() {
        connection.toPrevious();
        setValues();
    }
    
    public void moveToNext() {
        connection.toNext();
        setValues();
    }
    
     public void moveToLast() {
        connection.toLast();
        setValues();
    }
     
      public void populateTable() {
        String table = "select * from productos";
        connection.executeQuery(table);
        connection.toNext();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias});
        while(connection.toNext()) {            
            setValues();
           tableModel.addRow(new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias});
        }
    }
      
    
      public void addProducto(String producto, String descripcion, float precio_compra, float precio_venta, int existencias){
        String add = "insert into productos (producto, descripcion, precio_compra, precio_venta, existencias)"
                   + "values ('"+producto+"', '"+descripcion+"', '"+precio_compra+"', '"+precio_venta+"', '"+existencias+"');";
        connection.executeUpdate(add);
        setValues();
        populateTable();
        initValues();
    }
    
    public void editProducto(int IDproducto, String producto, String descripcion, float precio_compra, float precio_venta, int existencias){
        String edit = "update productos set producto ='"+producto+"', descripcion ='"+descripcion+"', precio_compra ='"+precio_compra+"', precio_venta ='"+precio_venta+"', existencias ='"+existencias+"'" + "where id_productos =" +IDproducto;
        connection.executeUpdate(edit);
        populateTable();
        initValues();
    }
    
    public void removeProductos(int IDproducto) {
        String remove = "delete from productos where id_producto=" +IDproducto;
        connection.executeUpdate(remove); 
        setValues();
        populateTable();
        
        initValues();
    }
    
    public void findProductos(String producto) {
        String find = "select * from productos where nombre like "+producto+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }
    
   }    

