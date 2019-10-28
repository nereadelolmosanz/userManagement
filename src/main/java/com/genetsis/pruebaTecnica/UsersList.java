package com.genetsis.pruebaTecnica;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author nolmo
 */
@ManagedBean(name = "usersList", eager = true)
@ApplicationScoped
public class UsersList {
    
    private List<User> users = new ArrayList<>();
     
     
    public UsersList(){
        this.users = new ArrayList<>();
    }
     
    public List<User> getUsersList(){
        return users;
    }
     
    public void setUsersList(List<User> users){
        this.users = users;
    }
     
    public void addUser(User user){
        users.add(user);
        
    }
    
    public void removeUser(User user){
        users.remove(user);
    }
    
    public String getShowUsers(){
        String usersList = "No hay usuarios";
        
        if (!users.isEmpty()){
            usersList = "Hay " + users.size() + " usuarios:</br>";
            for (int i=0; i<users.size(); i++){
                User u = users.get(i);
                usersList =  usersList + u.getName() + " " + u.getLastName() + " | "
                        + u.getEmail() + " | " + u.getBirthDate() + "</br>";
            }
        } else {
        }
        return usersList;
    }
    
    
    
    
    
    
    
    
    
}
