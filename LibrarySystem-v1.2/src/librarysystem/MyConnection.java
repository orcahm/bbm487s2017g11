/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MONSTER
 */
public class MyConnection {
    
    public MyConnection() throws ClassNotFoundException, SQLException{
    
        Class.forName("com.mysql.jdbc.Connection");
        con =(Connection)DriverManager
                .getConnection("jdbc:mysql://localhost:3307/library","root","password");
    }
    
    public Connection con;
    
}
