package com.inn.cafe.dao;

import com.inn.cafe.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao  extends JpaRepository<User, Integer>{

//    @Query(value = "SELECT u FROM User u WHERE u.email =:email",nativeQuery = true)
    User findByEmailId(@Param("email")String email);
}
