package com.xworkz.loginProject.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegisterFormController {

    @GetMapping("/signUp")
    public String signUpPage() {
        System.out.println("sign Up ok");
        return "signUpPage";
    }


    @GetMapping("/signIn")
    public String signInPage() {
        System.out.println("sign In ok");
        return "signInPage";
    }


}

