package jpa.service;

import jpa.entities.User;
import jpa.util.CRUDOperations;


public class UserService implements jpa.service.remote.UserService {

    CRUDOperations crudOperations = new CRUDOperations();

    public void create (User user){
       crudOperations.insertEntity(user);
    }
    public void update(User user){
        crudOperations.updateEntity(user);
    }
    public User findById(int id){
        return crudOperations.findEntitybyId(User.class,id);
    }
    public User findByUserName(String username){
        return crudOperations.findEntitybyUserName(username);
    }
    public void delete(User user){
        crudOperations.removeEntity(user);
    }

    /*//TODO only for testing!!
    public void test(){
        User user = findByUserName("username");
        user.setPassword("password1");
        update(user);
    }*/
}
