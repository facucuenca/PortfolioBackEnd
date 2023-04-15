
package com.proyecto.Back.End.Security;

import com.proyecto.Back.End.Security.Service.UserDetailsImpl;
import com.proyecto.Back.End.Security.jwt.JwtEntryPoint;
import com.proyecto.Back.End.Security.jwt.JwtTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MainSecurity {
 
    @Autowired
    UserDetailsImpl userDetailsServicesImpl;
    
    @Autowired
    JwtEntryPoint jwtEntryPoint;
    
    @Bean
    public JwtTokenFilter jwtTokenFilter() {
        return new JwtTokenFilter();
    }


}
