package com.xworkz.loginProject.Repository;

import com.xworkz.loginProject.dto.UserRegisterDTO;
import org.springframework.stereotype.Repository;


import java.sql.*;

@Repository
public class UserRegister {

    String url = "jdbc:mysql://localhost:3306/Register_db";
    String username = "root";
    String password = "Prasad@123";
    String insertQuery = "insert into register_tb values(?,?,?,?)";
    String getQuery="select password from register_tb where email=?";

    public void userDetailsSave(UserRegisterDTO userRegisterDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, userRegisterDTO.getUserName());
            preparedStatement.setString(2, userRegisterDTO.getNumber());
            preparedStatement.setString(3, userRegisterDTO.getEmail());
            preparedStatement.setString(4, userRegisterDTO.getPassword());

            int row=preparedStatement.executeUpdate();
            if (row!=0){
                System.out.println("New row succesfully added to DataBase...!");
            }else {
                System.out.println("0 row Added to DataBase...!");
            }


        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    public String userDetailsRetrieve(String email){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(getQuery);
            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                return resultSet.getString("password");
            }


        }catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }

        return "null";
    }
}
