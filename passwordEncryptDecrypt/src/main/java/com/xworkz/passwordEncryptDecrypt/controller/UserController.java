package com.xworkz.passwordEncryptDecrypt.controller;

import com.xworkz.passwordEncryptDecrypt.dto.UserDTO;
import com.xworkz.passwordEncryptDecrypt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    public UserController(){
        System.out.println("UserController..");
    }

    @PostMapping("/signUp")
    public String signUp(){
        return "signUp";
    }

    @PostMapping("/register")
    public String register(UserDTO userDTO, Model model){
        String save = userService.save(userDTO);
        if (save.equalsIgnoreCase("Registration done")){
            model.addAttribute("registerDone",save);
        }else if (save.equalsIgnoreCase("Registration failed")){
            model.addAttribute("registerFail",save);
        }
        return "signUp";
    }

    @PostMapping("/signIn")
    public String signIn(String email, String password,Model model){

        boolean signInValidation = userService.signIn(email, password);
        if (signInValidation){
            model.addAttribute("signInSuccess","SignIn Successfully");
            return "signIn";
        }else {
            model.addAttribute("signInFail", "SignIn Failed");
            return "signIn";
        }
    }
}
