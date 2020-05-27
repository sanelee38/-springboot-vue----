package com.sanelee.vue.serice;

import com.sanelee.vue.dao.UserDAO;
import com.sanelee.vue.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username){
        User user = getByName(username);
        return null!=user;

    }

    private User getByName(String username) {
        return userDAO.findByUsername(username);
    }
    public User get(String username,String password){
        return userDAO.getByUsernameAndPassword(username,password);
    }
    public void add(User user){
        userDAO.save(user);
    }

}
