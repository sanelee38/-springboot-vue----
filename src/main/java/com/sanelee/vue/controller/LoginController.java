package com.sanelee.vue.controller;

import com.sanelee.vue.entity.User;
import com.sanelee.vue.result.Result;
import com.sanelee.vue.serice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session){
        //对html标签进行转义，防止XSS攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username,requestUser.getPassword());
        if (null == user){
            return new Result(400);
        }else {
            session.setAttribute("user",user);
            return new Result(200);
        }
    }
}
