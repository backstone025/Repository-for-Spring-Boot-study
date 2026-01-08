package com.backstone.rest.webservices.restful_web_services.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }

    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    // GET /users
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable long id){
        return service.findOne(id);
    }

    // POST /users
    @PostMapping("/users")
    public ResponseEntity<User> craateUser(@RequestBody User user){
        service.save(user);

        return ResponseEntity.created(null).build();
    }
}
