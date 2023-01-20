package com.LearningSpringSecurity.Authentication.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Service;

import com.LearningSpringSecurity.Authentication.Entity.User;
import com.LearningSpringSecurity.Authentication.Repository.UserRepository;

import lombok.extern.slf4j.Slf4j;
//@Service
@Slf4j
public class JPAUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    //@Autowired
    //private NoOpPasswordEncoder noOpPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
            //Optional<User> user=userRepository.findUserByUserName(username); 
            //User u=user.orElseThrow(()->new UsernameNotFoundException("Error!"));
            for(User u: userRepository.findAll()){
                if(u.getUsername().equals(username)){
                    User user=u;
                    SecurityUser securityUser=new SecurityUser(user);
                    return securityUser;
                    
                }
            }
        throw new UsernameNotFoundException("Error");
        
    }
    
}
