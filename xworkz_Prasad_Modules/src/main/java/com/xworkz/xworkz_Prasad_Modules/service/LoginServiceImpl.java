package com.xworkz.xworkz_Prasad_Modules.service;

import com.xworkz.xworkz_Prasad_Modules.dao.LoginDAO;
import com.xworkz.xworkz_Prasad_Modules.entity.UserEntity;
import com.xworkz.xworkz_Prasad_Modules.utility.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDAO loginDAO;

    @Override
    public boolean loginValidation(String email, String password) {

        UserEntity user = loginDAO.findByEmail(email);

        if (user == null) {
            return false;
        }

        // Check if already blocked
        if (user.getAccountLocked() != null && user.getAccountLocked()) {
            System.out.println("Account is blocked!");
            return false;
        }

        String decryptedPassword = CryptoUtil.decrypt(user.getPassword());

        if (decryptedPassword.equals(password)) {

            // Reset attempts on success
            user.setLoginAttempts(0);
            loginDAO.updateUser(user);

            return true;

        } else {

            // Increase attempts
            Integer attempts = user.getLoginAttempts() == null ? 0 : user.getLoginAttempts();
            attempts++;

            user.setLoginAttempts(attempts);

            // Block if >= 3
            if (attempts >= 3) {
                user.setAccountLocked(true);
                System.out.println("Account blocked after 3 attempts!");
            }

            loginDAO.updateUser(user);

            return false;
        }
    }
}
