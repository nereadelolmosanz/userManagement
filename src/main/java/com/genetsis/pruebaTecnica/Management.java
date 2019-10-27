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
    private User userBean;
    
    @ManagedProperty(value = "#{userListBean}")
    private UsersList userListBean;
    
    public String getName(){
        return userBean.getName();
    }
    
    public List<User> getUsers(){
        return userListBean.getUsersList();
    }
    
    
    public String getAddUser(){
        if (userBean.getName() == null || "".equals(userBean.getName()) || "".equals(userBean.getLastName()) || userBean.getLastName()==null || "".equals(userBean.getEmail()) || userBean.getEmail() ==null || "".equals(userBean.getBirthDate()) || userBean.getBirthDate() ==null){
                return "Por favor, rellene todos los campos";
        } else {
            userListBean.addUser(userBean);
        }
        return userListBean.getShowUsers();
    }
}
