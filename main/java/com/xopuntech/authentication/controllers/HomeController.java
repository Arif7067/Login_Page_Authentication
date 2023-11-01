package com.xopuntech.authentication.controllers;


import com.xopuntech.authentication.Service.ProjectUserService;
import com.xopuntech.authentication.model.ProjectUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ProjectUserService projectUserService;

    @GetMapping("/users")
    public List<ProjectUser> getProjectUser(){
        System.out.println("getting users");
        return this.projectUserService.getUsers();

    }

}
