/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosiahGabrielTarecte
 */
public class DBUtil {
       
      public static void closePreparedStatement(Statement ps){
             try{
                 if(ps != null){
                        ps.close();
                 }
             } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
             }
      }
      
      public static void closeSetResultSet (ResultSet rs){
             try{
                    if(rs != null){
                           rs.close();
                    }
                    
             } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
             }
      }
       
}
