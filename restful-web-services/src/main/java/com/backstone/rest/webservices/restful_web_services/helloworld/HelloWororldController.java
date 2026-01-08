package com.backstone.rest.webservices.restful_web_services.helloworld;

import com.backstone.rest.webservices.restful_web_services.user.User;
import com.backstone.rest.webservices.restful_web_services.user.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWororldController {

    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
        return new HelloWorldBean(
                String.format("Hello World %s!", name)
        );
    }
}
