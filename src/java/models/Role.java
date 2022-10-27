/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.*;

/**
 *
 * @author JosiahGabrielTarecte
 */
public class Role implements Serializable{
       
       private int roleId;
       private String roleName;
       
       public Role(){
              this.roleId = 0;
              this.roleName = " ";
       }
              
       public Role(int inputRoleID, String inputRoleName){
              this.roleId = inputRoleID;
              this.roleName = inputRoleName;
       }
       
       public Role(int inputRoleID){
              this.roleId = inputRoleID;
              this.roleName = null;
       }

       public int getRoleId() {
              return roleId;
       }

       public void setRoleId(int inputRoleID) {
              this.roleId = inputRoleID;
       }

       public String getRoleName() {
              return roleName;
       }

       public void setRoleName(String inputRoleName) {
              this.roleName = inputRoleName;
       }

       @Override
       public String toString() {
              return "Role{" + "roleId=" + roleId + ", roleName=" + roleName + '}';
       }
 
       
            
       
}
