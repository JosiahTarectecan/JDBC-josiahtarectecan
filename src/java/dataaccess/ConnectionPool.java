/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.*;

/**
 *
 * @author JosiahGabrielTarecte
 */
public class ConnectionPool {
       
       private static ConnectionPool pool = null;
       private static DataSource dataSources =  null;
       
       private ConnectionPool(){
              try{
                     InitialContext ic = new InitialContext();
                     dataSources = (DataSource)ic.lookup("java:/comp/env/jdbc/userdb");
              
              } catch (NamingException ex) {
                     Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
              }
       }
       
       public static synchronized ConnectionPool getInstance(){
              if(pool == null){
                     pool = new ConnectionPool();
              }      
                     return pool;
       }
       

       public Connection getConnection(){
              try{
                     return dataSources.getConnection();
              } catch (SQLException ex) {
                     Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
                     return null;
              }
       }
       
       public void freeConnection(Connection c){
              try{
                     c.close();
              } catch (SQLException ex) {
                     Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);       
              }
              
       }
       
              
       
       
       
}
