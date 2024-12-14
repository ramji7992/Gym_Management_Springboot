package com.rj.controller;

import com.rj.binding.OwnerBean;
import com.rj.services.IMailService;
import com.rj.services.IOwnerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Timestamp;
import java.time.Instant;

@Controller
public class OwnerController {
    @Autowired
    IOwnerServices services;

    @GetMapping("/")
    public String showHomePage() {
        // Returns the name of the view
        return "index";
    }

    @GetMapping("/Registration")
    public String ownerRegisterPage(Model model){
        OwnerBean ob = new OwnerBean();
        model.addAttribute("user", ob);
        return "RegisterOwner";
    }

    @PostMapping("/register")
    public String saveOwner(OwnerBean ob, Model model){
        ob.setRegDate(Timestamp.from(Instant.now()));
        System.out.println(ob);
        String msg = services.registerOwner(ob);
        model.addAttribute("msg", msg);
        return "success";
    }

    //Login Code
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        OwnerBean ob = new OwnerBean();
        model.addAttribute("bind", ob);
        return "loginPage";
    }
    @PostMapping("/loginOwner")
    public String loginOwner(@ModelAttribute("bind") OwnerBean ob, Model model){
        OwnerBean ob1 = services.getUserByUsernameAndPassword(ob.getUserName(), ob.getPassword());
        if (ob1 != null){
            String msg = "Welcome " + ob1.getName() + "\n in Fitness World GYM";
            model.addAttribute("msg", msg);
            return "WelcomeOwner";
        }
        else {
            String msg = "Invalid UseName or Password";
            model.addAttribute("msg", msg);
            return "loginPage";
        }
    }

    @GetMapping("/welcomePage")
    public String welcomepage(){
        return "WelcomeOwner";
    }
}
