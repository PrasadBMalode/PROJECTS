package com.xworkz.loginProject.controler;

import com.xworkz.loginProject.dto.UserRegisterDTO;
import com.xworkz.loginProject.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignUpControler {

    @Autowired
    SignUpServiceImpl registerService;

    public SignUpControler() {
    }

    @GetMapping("getSignUp")
    public String signUpDataSave(UserRegisterDTO userRegisterDTO) {
        System.out.println(" its a SignUpControler");


        try {
            registerService.registerDetailsSave(userRegisterDTO);
            return "SignUpSuccesfully";

        } catch (Exception e) {
            e.printStackTrace();
            return "SignUpFailed";
        }


    }

}
