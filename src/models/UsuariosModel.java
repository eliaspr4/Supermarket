
package models;


import epr.MyConnection;
import javax.swing.table.DefaultTableModel;

public class UsuariosModel {
  
  public  String  name;
  public  String  username;
  public String   password;
  public String level;
  public String status;
   
 public DefaultTableModel tableModel = new DefaultTableModel (new String []{"Usuario","Nivel","Estado"},0);

 
 MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
 
public void initValues() {
    String sql = "select * from usuarios";
        connection.executeQuery(sql);
        connection.toNext();
}


public void setValues() {
        name = connection.getString("nombre");
        username = connection.getString("usuario");
        password = connection.getString("contrasena");
        level = connection.getString("nivel");
        status = connection.getString("estado");
        
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

  public void addUser(String name, String username, String password, String level, String status) {
        String add = "insert into usuarios (nombre, usuario, (MD5(contrasena)), nivel, estado)"
                   + "values ('"+name+"', '"+username+"', '"+password+"', '"+level+"', '"+status+"');";
       connection.executeUpdate(add);
         initValues();
         populateTable();
  }
  
  public void editUser(String name, String username, String password, String level, String status) {
        String edit = "update usuarios set nombre ='"+name+"', usuario ='"+username+"', contrasena ='"+password+"', nivel ='"+level+"', estado ='"+status+"'" + "where nombre =" +name;
                    connection.executeUpdate(edit);
          initValues();
        populateTable();
   }
  
   public boolean findUser(String name) {
           boolean isFound = false;
        String find = "select * from usuarios where nombre = '"+name+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(name.equals(connection.getString("usuario"))) {
            isFound = true;
        }
        return isFound;
    }
    

public void populateTable() {
        initValues();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{username, level, status});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{username, level, status});           
        }
    }


        }


    




