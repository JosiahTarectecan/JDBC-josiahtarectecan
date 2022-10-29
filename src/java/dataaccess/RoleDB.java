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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Role;

/**
 *
 * @author JosiahGabrielTarecte
 */
public class RoleDB {
       
       public List<Role> getAll() {
              
       List<Role> roles = new ArrayList<>();
       ConnectionPool cp = ConnectionPool.getInstance();
       Connection con = cp.getConnection();
       
       PreparedStatement ps = null;
       ResultSet rs = null;
       
       String sql = "Select * FROM role";
       
              try {
                     ps = con.prepareStatement(sql);
                     rs = ps.executeQuery();
                     
                     while(rs.next()){
                            int roleID = rs.getInt(1);
                            String roleName = rs.getString(2);
                            Role role = new Role(roleID, roleName);
                            roles.add(role);
                     }
                     
              } catch (SQLException ex) {
                     Logger.getLogger(RoleDB.class.getName()).log(Level.SEVERE, null, ex);
              } finally {
                     DBUtil.closePreparedStatement(ps);
                     DBUtil.closeSetResultSet(rs);
                     cp.freeConnection(con);
              }
       
       return roles;
       
       }
       
}
