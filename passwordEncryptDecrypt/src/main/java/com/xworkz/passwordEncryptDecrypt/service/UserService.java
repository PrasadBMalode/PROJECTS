package com.xworkz.passwordEncryptDecrypt.service;

import com.xworkz.passwordEncryptDecrypt.dto.UserDTO;

public interface UserService {
     String save(UserDTO userDTO);

     boolean signIn(String email, String password);
}
