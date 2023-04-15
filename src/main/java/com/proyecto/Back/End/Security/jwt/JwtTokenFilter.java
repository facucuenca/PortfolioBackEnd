
package com.proyecto.Back.End.Security.jwt;

import com.proyecto.Back.End.Security.Service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;


public class JwtTokenFilter {
  
    
    @Autowired
    JwtProvider jwtProvider;
    @Autowired
    UserDetailsImpl userDetailsServiceImpl;
}
