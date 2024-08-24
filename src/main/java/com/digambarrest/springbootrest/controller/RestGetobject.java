package com.digambarrest.springbootrest.controller;


import com.digambarrest.springbootrest.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGetobject {

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setname("Digambar");
        user.setEmail("dsr@gamil.com");
        return user;
    }
}
