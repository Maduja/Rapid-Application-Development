/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author E-LINE
 */
public class DbConnector {
    final static String URL="jdbc:mysql://localhost:3306/activity02";
    final static String DRIVER="com.mysql.jdbc.Driver";
    final static String USER="root";
    final static String DBPW="";
    
    public static Connection getConnection(){
     Connection con = null;
        try {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(URL,USER,DBPW);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
