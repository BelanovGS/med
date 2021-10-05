package com.example.med.controller;

import com.example.med.entity.User;
import com.example.med.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/error")
    public String root(Model model) {
        model.addAttribute("userForm", new User());

        return "error";
    }
}
