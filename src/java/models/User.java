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
public class User implements Serializable{
       
       private String email;
       private String fname;
       private String lname;
       private String password;
       private boolean active;
       private int role;
       private String roleName;
       
       public User(){

       }
       
       public User(String email, String fname, String lname, String password, 
               int inputRole, boolean active, int role, String roleName){
              
              this.email = email;
              this.fname = fname;
              this.lname = lname;
              this.password = password;
              this.active = active;
              this.role = role;
              this.roleName = roleName;
              
       }

       public String getEmail() {
              return email;
       }

       public void setEmail(String email) {
              this.email = email;
       }

       public String getFname() {
              return fname;
       }

       public void setFname(String fname) {
              this.fname = fname;
       }

       public String getLname() {
              return lname;
       }

       public void setLname(String lname) {
              this.lname = lname;
       }

       public String getPassword() {
              return password;
       }

       public void setPassword(String password) {
              this.password = password;
       }

       public boolean isActive() {
              return active;
       }

       public void setActive(boolean active) {
              this.active = active;
       }

       public int getRole() {
              return role;
       }

       public void setRole(int role) {
              this.role = role;
       }

       public String getRoleName() {
              return roleName;
       }

       public void setRoleName(String roleName) {
              this.roleName = roleName;
       }
       

}
