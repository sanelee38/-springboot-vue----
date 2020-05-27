package com.sanelee.vue.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
@Data
@Entity
@Table(name ="user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String username;
    String password;
}
