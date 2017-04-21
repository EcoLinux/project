/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eco6
 */
public class TestConet {

    /**
     * @param args the command line arguments
     */
    
   
public  class Connect_Desconnect{
    
}
      public static Connection connection = null;
      
       public static void connectdb(){
      String url = "jdbc:mysql://localhost:3306/";
      String db = "lost";
      String driver = "com.mysql.jdbc.Driver";

      try{
      Class.forName(driver);
      connection = DriverManager.getConnection(url+db,"root","");
      //JOptionPane.showMessageDialog(null, "Connected sucessful");
      } catch (ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null, "ERROR in connect with Data Base " + e);
      }

     }
       
       
       
       public static void  desconnected(){
           try {
               connection.close();
               // JOptionPane.showMessageDialog(null,"sucessful desconnect Data Base");
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error to desconnect Data Base" + ex);
           }
       
       }
    public static void main(String[] args) {
        // TODO code application logic here
        connectdb();
    }
    
}
