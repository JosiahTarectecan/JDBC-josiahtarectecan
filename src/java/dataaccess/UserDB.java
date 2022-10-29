/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.User;

/**
 *
 * @author JosiahGabrielTarecte
 */
public class UserDB {
      
       public List<User> getAll(){
       
       List<User> users = new ArrayList<>();
       ConnectionPool cp = ConnectionPool.getInstance();
       Connection con = cp.getConnection();
       PreparedStatement ps = null;
       ResultSet rs = null;
              
       String sql = "SELECT u.email, u.active, u.first_name, u.last_name, u.password, u.role, r.role_name FROM user u INNER JOIN role r ON r.role_id = u.role";
       
              try {
                     ps = con.prepareStatement(sql);
                     rs = ps.executeQuery();
                     
                     while(rs.next()){
                     
                            String email = rs.getString(1);
                            boolean active = rs.getInt(2) == 1;
                            String fname = rs.getString(3);
                            String lname = rs.getString(4);
                            String password = rs.getString(5);
                            int role = rs.getInt(6);
                            String roleName = rs.getString(7);
                            
                            User user = new User(email, active, fname, lname, password, role, roleName);
                            users.add(user);
                     }
                     
              } catch (SQLException ex) {
                     Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
              } finally{
                     
                     DBUtil.closePreparedStatement(ps);
                     DBUtil.closeSetResultSet(rs);
                     cp.freeConnection(con);
    
              }  
              
       return users;       
       }
       
       public User get(String userEmail){
       
       User user = null;
       ConnectionPool cp = ConnectionPool.getInstance();
       Connection con = cp.getConnection();
       PreparedStatement ps = null;
       ResultSet rs = null;
       
       String sql = "SELECT u.email, u.active, u.first_name, u.last_name, u.password, u.role, r.role_name FROM user u INNER JOIN role r ON r.role_id = u.role WHERE email=?";
              
              try{
                    ps = con.prepareStatement(sql);
                    ps.setString(1, userEmail);
                    rs = ps.executeQuery();
                    if(rs.next()){
                           String email = rs.getString(1);
                            boolean active = rs.getInt(2) == 1;
                            String fname = rs.getString(3);
                            String lname = rs.getString(4);
                            String password = rs.getString(5);
                            int role = rs.getInt(6);
                            String roleName = rs.getString(7);
                            
                            user = new User(email, active, fname, lname, password, role, roleName); 
                    }
              } catch (SQLException ex) {
                     Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
              } finally{
                     
                     DBUtil.closePreparedStatement(ps);
                     DBUtil.closeSetResultSet(rs);
                     cp.freeConnection(con);
                     
              }
       return user;
       }
       
       public void insert(){
       
       }
       
       public void update(){
       
       }
       
       public void delete(){
       
       }
       
       
}
