package com.xworkz.passwordEncryptDecrypt.dao;

import com.xworkz.passwordEncryptDecrypt.entity.UserEntity;

public interface UserDAO {

    boolean save(UserEntity userEntity);
}
