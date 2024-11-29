package com.opsmonsters.HelloWorld.dao;

import com.opsmonsters.HelloWorld.dto.UserDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao { //data acces object

    @PersistenceContext
    EntityManager em;

    public UserDto getUserById(int id){
        Object[] userObject = (Object[]) em.createNativeQuery("select * from users where user_id = :id")
                .setParameter("id", id)
                .getSingleResult();

        UserDto dto = new UserDto();
        dto.setFirstName((String)userObject[1]);
        dto.setLastName((String) userObject[2]);
        dto.setPassword((String) userObject[3]);
        dto.setAddress((String) userObject[4]);
        dto.setGender((String) userObject[5]);
        return dto;


    }

//    public List<UserDto> getUserList(){
//        List<Object[]> userObjectList = (List<Object[]>)em.createNativeQuery("select * from users")
//                .getResultList();
//
//    }


}
