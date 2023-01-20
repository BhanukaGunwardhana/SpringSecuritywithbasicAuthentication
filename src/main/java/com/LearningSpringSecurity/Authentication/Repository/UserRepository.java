package com.LearningSpringSecurity.Authentication.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LearningSpringSecurity.Authentication.Entity.User;
@Repository

public interface UserRepository extends JpaRepository<User,Integer>{
   // public Optional<User> findUserByUserName(String username);

   
    
}
