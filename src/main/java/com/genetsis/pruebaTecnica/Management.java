/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genetsis.pruebaTecnica;

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
    
    @ManagedProperty(value = "#{userBean}")
    private User userBean = new User();
    
    @ManagedProperty(value = "#{userListBean}")
    private UsersList usersListBean = new UsersList();
    
    
    public User getUserBean(){
        return this.userBean;
    }
    
    public void setUserBean(User userBean){
        this.userBean = userBean;
    }
    
    public UsersList getUsersListBean() {
        return usersListBean;
    }

    public void setUsersListBean(UsersList usersListBean) {
        this.usersListBean = usersListBean;
    }
    
    
    
    public String getUserName(){
        return userBean.getName();
    }
    public void setUserName(String name){
        this.userBean.setName(name);
    }
    public String getUserLastName(){
        return userBean.getLastName();
    }
    public void setUserLastName(String lastName){
        this.userBean.setLastName(lastName);
    }
    public String getUserEmail(){
        return userBean.getEmail();
    }
    public void setUserEmail(String email){
        this.userBean = userBean;
    }
    public String getUserBirthDate(){
        return userBean.getBirthDate();
    }
    public void setUserBirthDate(String birthDate){
        this.userBean.setBirthDate(birthDate);
    }
    
      
    public List<User> getUsersList(){
        return usersListBean.getUsersList();
    }
    
    
    
    public void addUserBean(User userBean){
        usersListBean.addUser(userBean);
    }
    
    public void removeUserBean(User userBean){
        usersListBean.removeUser(userBean);
    }
    
    
    
    
    public String getAddUser(){
        if (userBean.getName() == null || "".equals(userBean.getName()) || "".equals(userBean.getLastName()) || userBean.getLastName()==null || "".equals(userBean.getEmail()) || userBean.getEmail() ==null || "".equals(userBean.getBirthDate()) || userBean.getBirthDate() ==null){
                return "Por favor, rellene todos los campos";
        } else {
            usersListBean.addUser(userBean);
        }
        return usersListBean.getShowUsers();
    }
}
