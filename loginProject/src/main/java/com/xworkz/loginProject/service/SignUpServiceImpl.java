package com.xworkz.loginProject.service;

import com.xworkz.loginProject.Repository.UserRegister;
import com.xworkz.loginProject.customeEvent.InvalidDataException;
import com.xworkz.loginProject.dto.UserRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    UserRegister userRegister;

    public boolean registerDetailsSave(UserRegisterDTO userRegisterDTO) throws InvalidDataException{

        String password = userRegisterDTO.getPassword();
        String confirmPassword = userRegisterDTO.getConfirmPassword();

        if (userRegisterDTO.getUserName() != null && userRegisterDTO.getUserName().length() > 3 && userRegisterDTO.getUserName().length() < 15 && userRegisterDTO.getUserName().matches("^[A-Za-z]+$")
                && userRegisterDTO.getNumber().length() == 10 && userRegisterDTO.getNumber() != null &&
                userRegisterDTO.getEmail().contains("@gmail.com") && userRegisterDTO.getEmail() != null &&
                userRegisterDTO.getEmail().length() > 13 && userRegisterDTO.getEmail().length() < 25

                && password.length() == 8
                && Character.isUpperCase(password.charAt(0))
                && password.replaceAll("[a-zA-Z0-9]", "").length() >= 2
                && password.equals(confirmPassword)) {


            userRegister.userDetailsSave(userRegisterDTO);
            System.out.println("Data saved to DataBase...!");
            return true;

        } else {
            throw new InvalidDataException();
        }


    }


}
