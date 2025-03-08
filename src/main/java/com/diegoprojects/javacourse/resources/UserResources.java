package com.diegoprojects.javacourse.resources;

import com.diegoprojects.javacourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Diego", "diego@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
