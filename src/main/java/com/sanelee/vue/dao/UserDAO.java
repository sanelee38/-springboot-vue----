package com.sanelee.vue.dao;

import com.sanelee.vue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
