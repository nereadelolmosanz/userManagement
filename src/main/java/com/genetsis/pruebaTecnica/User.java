/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genetsis.pruebaTecnica;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author nolmo
 */
@ManagedBean(name = "user", eager = true)
@ApplicationScoped
public class User {

    private String name;
    private String lastName;
    private String email;
    private String birthDate;

    public User(){
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.birthDate = "";                
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
    public void setDate(String birthDate){
        this.birthDate = birthDate;
    }
    
    
    public String getSaySomething(){
        //check if null?
        if("".equals(name) || name ==null){
                return "1.Usuario " + lastName + " creado";
        }else if("".equals(lastName) || lastName ==null){
                return "2.Usuario " + name + " creado";
        }else{
                return "3.Usuario " + name + " " + lastName + " creado";
        }
    }
}
