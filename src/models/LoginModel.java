
package models;
import  java.sql.ResultSet;
import epr.MyConnection;


public class LoginModel {
   String  username;
   String  password;
  
   
   MyConnection connection = new MyConnection(3306, "localhost", "acme_store", "root", "");

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

    
public void initValues() {
        String sql = "select * from usersLogin";
        connection.executeQuery(sql);
    }
  
  public void setValues(){
   
      username = connection.getString("username");
      password = connection.getString("password");
  }
     
      
  


}