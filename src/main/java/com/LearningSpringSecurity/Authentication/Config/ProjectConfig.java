package com.LearningSpringSecurity.Authentication.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.LearningSpringSecurity.Authentication.Services.JPAUserDetailsService;

@Configuration
public class ProjectConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        return new JPAUserDetailsService();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
        //return new NoOpPasswordEncoder();
    
    }
    /*@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(11);
    }*/

}
