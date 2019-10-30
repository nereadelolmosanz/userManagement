package com.genetsis.pruebaTecnica;

import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.validation.constraints.Pattern;


/**
 *
 * @author nolmo
 */
@ManagedBean(name = "user", eager = true)
@ApplicationScoped
public class User {

    @ManagedProperty(value="#{name}")
    @Pattern (regexp="^\\D+$", message="No introduzca números en este campo.")
    private String name = "";
    
    @ManagedProperty(value="#{lastName}")
    @Pattern (regexp="^\\D+$", message="No introduzca números en este campo.")
    private String lastName = "";
    
    @ManagedProperty(value="#{email}")
    @Pattern (regexp="\\S+@\\S+", message="El formato debe ser direccion@tu.dominio")
    
    private String email = "";
    
    @ManagedProperty(value="#{birthDate}")
    private Date birthDate = new Date();
    
    
    public User(){
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.birthDate = new Date();                
    }
    
    public User(String name, String lastName, String email, Date birthDate){
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
    
    public Date getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }   
    
}
