package com.xworkz.loginProject.service;

import com.xworkz.loginProject.customeEvent.InvalidDataException;
import com.xworkz.loginProject.dto.UserRegisterDTO;

public interface SignUpService {

    boolean registerDetailsSave(UserRegisterDTO userRegisterDTO) throws InvalidDataException;

}
