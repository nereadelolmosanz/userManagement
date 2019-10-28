package com.genetsis.pruebaTecnica;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author nolmo
 */
@ManagedBean(name = "user", eager = true)
@SessionScoped
public class User {

    private String name;
    private String lastName;
    private String email;
    private String birthDate;
    
    //private UsersList users = new UsersList();

    public User(){
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.birthDate = "";                
    }
    
    public User(String name, String lastName, String email, String birthDate){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;      
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    
    
    /*
    public String getAddUser(){
        if("".equals(name) || name ==null || "".equals(lastName) ||
                lastName ==null || "".equals(email) || email ==null
                || "".equals(birthDate) || birthDate ==null){
                return "Por favor, rellene todos los campos";
        } else {
            users.addUser(this);
        }
        return users.getShowUsers();
    }*/
    
    public String getSomething(){
        if("".equals(name) || name ==null || "".equals(lastName) ||
                lastName ==null || "".equals(email) || email ==null
                || "".equals(birthDate) || birthDate ==null){
                return "Rellene todos los campos";
        }else{
                return "Usuario: " + name + " " + lastName
                        + " " + email + " " + birthDate;
        }
    }
    
    /*public List<User> getUserList(){
        return users.getUsersList();
    }*/
}
