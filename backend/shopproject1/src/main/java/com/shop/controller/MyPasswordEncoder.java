package backend.shopproject1.src.main.java.com.shop.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class MyPasswordEncoder  {
    @Bean
    public org.springframework.security.crypto.password.PasswordEncoder password()
    {
        return new BCryptPasswordEncoder();
    }
}
