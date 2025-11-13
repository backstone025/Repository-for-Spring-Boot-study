package com.backstone.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    AuthenticationService authenticationService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        else {
            model.addAttribute("errorMessage", "Invalid username or password! Pleaze try again.");
            return "login";
        }
    }
}
