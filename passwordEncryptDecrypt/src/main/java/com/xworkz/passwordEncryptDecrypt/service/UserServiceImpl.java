package com.xworkz.passwordEncryptDecrypt.service;

import com.xworkz.passwordEncryptDecrypt.dao.UserDAO;
import com.xworkz.passwordEncryptDecrypt.dto.UserDTO;
import com.xworkz.passwordEncryptDecrypt.entity.UserEntity;
import com.xworkz.passwordEncryptDecrypt.util.EncryptDecrypt;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    EncryptDecrypt encryptDecrypt;

    @Autowired
    UserDAO userDAO;

    @Override
    public String save(UserDTO userDTO) {

        String encrypted = encryptDecrypt.encrypt(userDTO.getPassword());
        System.out.println("Encrypted password  "+encrypted);
        userDTO.setPassword(encrypted);

        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(userDTO,userEntity);

        boolean save = userDAO.save(userEntity);
        if (save){
            return "Registration done";
        }else {
            return "Registration failed";
        }
    }

    @Override
    public boolean signIn(String email, String password) {
        UserEntity user = userDAO.signIn(email);

        if (user==null){
            return false;
        }

        String decrypt = encryptDecrypt.decrypt(user.getPassword());
        System.out.println("password Decryption  "+decrypt);
        if (decrypt.equals(password)){
            return true;
        }
        return false;
    }
}
