package com.xworkz.xworkz_Prasad_Modules.controler;

import com.xworkz.xworkz_Prasad_Modules.dto.UserDTO;
import com.xworkz.xworkz_Prasad_Modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    public UserController() {
        System.out.println("User Controller...");
    }

    @GetMapping("/registerFirst")
    public String mapedRegistration(){
        return "register";
    }

    @PostMapping("/register")
    public String registration(UserDTO userDTO, Model model) {
        String validation = userService.registrationValidation(userDTO);
        if (validation.equalsIgnoreCase("Registration Done")) {
            model.addAttribute("registerSuccess", validation);
            return "register";
        } else if (validation.equalsIgnoreCase("Registration Failed...!")) {
            model.addAttribute("registerFailed", validation);
            return "register";
        }else if (validation.equalsIgnoreCase("User already exist")){
            model.addAttribute("existData",validation);
            return "register";
        }
        return "register";
    }

}
