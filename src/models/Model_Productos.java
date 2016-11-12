package models;

import java.sql.ResultSet;
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

    
    public void initValues() {
        String sql = "select * from productos";
        connection.executeQuery(sql);
        connection.toNext();
    }

    public void setValues() {
        IDproducto = connection.getInteger("id_producto");
        producto = connection.getString("producto");
        descripcion = connection.getString("descripcion");
        precio_compra = connection.getInteger("precio_compra");
        precio_venta = connection.getInteger("precio_venta");
        existencias =(connection.getInteger("existencias"));
        
        
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
    
      public void addProducto(String producto, String descripcion, int precio_compra, int precio_venta, int existencias){
        String add = "insert into productos (producto, descripcion, precio_compra, precio_venta, existencias)"
                   + "values ('"+producto+"', '"+descripcion+"', '"+precio_compra+"', '"+precio_venta+"', '"+existencias+"');";
        connection.executeUpdate(add);
        setValues();
           tableModel.addRow(new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias});
        
        initValues();
    }
    
    public void editProducto(int IDproducto, String producto, String descripcion, int precio_compra, int precio_venta, int existencias){
        String edit = "update productos set producto ='"+producto+"', descripcion ='"+descripcion+"', precio_compra ='"+precio_compra+"', precio_venta ='"+precio_venta+"', existencias ='"+existencias+"'" + "where id_productos =" +IDproducto;
        connection.executeUpdate(edit);
        setValues();
           tableModel.addRow(new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias});
        initValues();
    }
    
    public void removeProductos(int IDproducto) {
        String remove = "delete from productos where id_producto=" +IDproducto;
        connection.executeUpdate(remove); 
       
        initValues();
    }
    
    public void findProductos(String producto) {
        String find = "select * from productos where nombre like "+producto+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }
    
    public void populateTable() {
        Object fields[] = new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias};
        while(connection.toNext()) {            
            setValues();
           tableModel.addRow(new Object[]{IDproducto, producto, descripcion, precio_compra, precio_venta, existencias});
        
        
        }
    }

    /**
     * @return the IDproductos
     */
    public int getIDproducto() {
        return IDproducto;
    }

    /**
     * @param IDproducto the IDproductos to set
     */
    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_compra
     */
    public float getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return the precio_venta
     */
    public float getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}    