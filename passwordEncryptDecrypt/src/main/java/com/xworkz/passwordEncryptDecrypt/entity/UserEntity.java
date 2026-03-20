package com.xworkz.passwordEncryptDecrypt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ED_TB")
@NamedQuery(name = "findByEmail",query = "SELECT u FROM UserEntity u WHERE u.email = :email"
)public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer age;
    private String name;
    private String place;
    private String email;
    private Long number;
    private String password;
}
