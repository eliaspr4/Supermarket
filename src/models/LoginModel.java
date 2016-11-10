

package models;

import epr.MyConnection;



public class LoginModel {

  public  String  name;
  public  String  username;
  public String   password;
  public String level;
  public String status;
  
  
  
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
        String sql = "select * from login";
        connection.executeQuery(sql);
        connection.toNext();
    }
  
  public boolean login(String username, String password){
      boolean isAble = false;
      String login = "select * from login where usuario = '"+username+"' and contrasena = '"+password+"';";
      connection.executeQuery(login);
      connection.toNext();
      status = connection.getString("estado");
      if (username.equals(connection.getString("usuario"))&& password.equals(connection.getString("contrasena"))&& status.equals("Activo")){
          isAble = true;
          level = connection.getString("nivel");
      }
      return isAble;
  }
     
      
  


}