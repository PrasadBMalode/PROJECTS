package com.xworkz.passwordEncryptDecrypt.dao;

import com.xworkz.passwordEncryptDecrypt.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class DAOImpl implements UserDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(UserEntity userEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(userEntity);
            transaction.commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
