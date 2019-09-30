package jpa.service.remote;


import jpa.entities.User;

public interface UserService {
    void create(User user);
    void update(User user);
    User findById(int id);
    User findByUserName(String username);
    void delete(User user);

}
