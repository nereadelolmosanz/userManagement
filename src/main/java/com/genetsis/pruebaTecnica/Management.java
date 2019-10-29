/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genetsis.pruebaTecnica;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author nolmo
 */
@ManagedBean(name = "management", eager = true)
@ApplicationScoped
public class Management {
    
    @ManagedProperty(value = "#{user}")
    private User user = new User();
    
    private List<User> users = new ArrayList<>();

    public Management() {
        this.user = new User();
        this.users = new ArrayList<>();
    }
    
    public User getUser(){
        return this.user;
    }
    
    public void setUser(User user){
        this.user = user;
    }    
    
    //About User
    
    public String getUserName(){
        return this.user.getName();
    }
    public void setUserName(String name){
        this.user.setName(name);
    }
    public String getUserLastName(){
        return this.user.getLastName();
    }
    public void setUserLastName(String lastName){
        this.user.setLastName(lastName);
    }
    public String getUserEmail(){
        return this.user.getEmail();
    }
    public void setUserEmail(String email){
        this.user.setEmail(email);
    }
    public String getUserBirthDate(){
        return this.user.getBirthDate();
    }
    public void setUserBirthDate(String birthDate){
        this.user.setBirthDate(birthDate);
    }
    
    //About UserList

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
      
    
    public void addUser(){
        User u = new User(this.getUserName(),this.getUserLastName(),
                           this.getUserEmail(),this.getUserBirthDate());
        this.users.add(u);
 
            /*msg = "Usuario: " + this.getUserName()
                    + " " + this.getUserLastName()
                    + " " + this.getUserEmail()
                    + " " + this.getUserBirthDate();*/
    }
    
    public void removeUser(){
        this.users.remove(this.getUser());
    }
    
}
