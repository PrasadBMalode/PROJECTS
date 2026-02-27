package com.xworkz.loginProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
public class UserRegisterDTO {
    private String userName;
    private String number;
    private String email;
    private String password;
    private String confirmPassword;

}
