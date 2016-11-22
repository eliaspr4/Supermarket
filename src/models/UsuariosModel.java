
package models;

import java.sql.ResultSet;
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
        
        username = connection.getString("usuario");
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

  public void addUser(String username, String level,String status){
       String add = "insert into usuarios (usuario,nivel,estado)" + "values('"+username+"', '"+level+"', '"+status+"', );";
       connection.executeUpdate(add);
         setValues();
         tableModel.addRow(new Object[]{ username, level,status});
         initValues();
  }
  
  public void editUser(String username, String level,String status){
       String add = "insert into usuarios (usuario,nivel,estado)" + "values('"+username+"', '"+level+"', '"+status+"', );";
       connection.executeUpdate(add);
         setValues();
         tableModel.addRow(new Object[]{ username, level,status});
         initValues();
  
}
  
   public void findUser(String username) {
        String find = "select * from usuarios where usuario like "+username+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }

public void UsersTable() {
         Object fields[] = new Object[]{username,level,status};                       
        tableModel.addRow(fields);
        while(connection.toNext()) {       
            setValues();
            tableModel.addRow(new Object[]{username,level,status});
        }
    }

}


