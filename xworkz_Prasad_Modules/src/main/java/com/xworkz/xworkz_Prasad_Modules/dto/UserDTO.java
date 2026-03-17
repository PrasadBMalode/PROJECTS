package com.xworkz.xworkz_Prasad_Modules.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String dob;
    private Integer age;
    private String gender;
    private String location;
    private String email;
    private Long phNumber;
    private String password;
    private String confirmPassword;

}
