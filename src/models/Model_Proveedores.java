package models;

import java.sql.ResultSet;
import epr.MyConnection;
import javax.swing.table.DefaultTableModel;

public class Model_Proveedores {
    private int IDproveedor;    
    private String nombre;
    
    private String rfc;
    private String calle;
    private int numero;
    private String colonia;
    private String ciudad;
    private String estado;
    private String nombre_contacto;    
    private int telefono;
    private String email;
    
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String []{"ID", "Nombre", "RFC", "calle", "Numero", "Colonia", "Ciudad", "Estado", "Nombre de contacto", "Telefono", "Email"}, 0);
    
    
    MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

    
    public void initValues() {
        String sql = "select * from proveedores";
        connection.executeQuery(sql);
        connection.toNext();
    }

    public void setValues() {
        IDproveedor = connection.getInteger("id_proveedor");
        nombre = connection.getString("nombre");
        rfc = connection.getString("rfc");
        calle = connection.getString("calle");
        numero = connection.getInteger("numero");
        colonia =(connection.getString("colonia"));
        ciudad = (connection.getString("ciudad"));
        estado = connection.getString("estado");
        nombre_contacto = connection.getString("nombre_contacto");
        telefono = connection.getInteger("telefono");
        email = connection.getString("email");
        
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
    
      public void addProveedor(String nombre, String rfc, String calle, int numero, String colonia, String ciudad,
                            String estado, String nombre_contacto, int telefono, String email) {
        String add = "insert into proveedores (nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)"
                   + "values ('"+nombre+"', '"+rfc+"', '"+calle+"', '"+numero+"', '"+colonia+"', '"+ciudad+"', '"+estado+"', '"+nombre_contacto+"', '"+telefono+"', '"+email+"');";
        connection.executeUpdate(add);        
        initValues();
    }
    
    public void editProveedor(int IDproveedor, String nombre, String rfc, String calle, int numero, String colonia,
                             String ciudad, String estado, String nombre_contacto, int telefono, String email) {
        String edit = "update proveedores set nombre ='"+nombre+"', rfc ='"+rfc+"', calle ='"+calle+"', numero ='"+numero+"', colonia ='"+colonia+"', ciudad ='"+ciudad+"', estado ='"+estado+"', nombre_contacto ='"+nombre_contacto+"', telefono ='"+telefono+"', email ='"+email+"'" + "where id_proveedor =" +IDproveedor;
        connection.executeUpdate(edit);
        initValues();
    }
    
    public void removeProveedor(int IDproveedor) {
        String remove = "delete from proveedores where id_proveedor=" +IDproveedor;
        connection.executeUpdate(remove);      
        initValues();
    }
    
    public void findCustomer(String nombre) {
        String find = "select * from proveedores where nombre like "+nombre+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }
    
    public void populateTable() {
        Object fields[] = new Object[]{IDproveedor, nombre, calle, numero, colonia, email, rfc, ciudad, estado, nombre_contacto, email};
        while(connection.toNext()) {            
            tableModel.addRow(fields);
            setValues();
        }
    }

    /**
     * @return the IDproveedor
     */
    public int getIDproveedor() {
        return IDproveedor;
    }

    /**
     * @param IDproveedor the IDproveedor to set
     */
    public void setIDproveedor(int IDproveedor) {
        this.IDproveedor = IDproveedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the nombre_contacto
     */
    public String getNombre_contacto() {
        return nombre_contacto;
    }

    /**
     * @param nombre_contacto the nombre_contacto to set
     */
    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}



