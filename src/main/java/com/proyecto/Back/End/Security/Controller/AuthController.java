
package com.proyecto.Back.End.Security.Controller;




import com.proyecto.Back.End.Security.Service.RolService;
import com.proyecto.Back.End.Security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"https://proyectointegradorfrontend","http://localhost:4200"})
public class AuthController {

    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;
    
    
   }
