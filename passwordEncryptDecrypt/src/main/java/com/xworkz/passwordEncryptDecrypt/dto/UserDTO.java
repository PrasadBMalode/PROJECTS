package com.xworkz.passwordEncryptDecrypt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private Integer age;
    private String name;
    private String place;
    private String email;
    private Long number;
    private String password;

}
