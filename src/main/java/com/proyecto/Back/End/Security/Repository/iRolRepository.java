
package com.proyecto.Back.End.Security.Repository;

import com.proyecto.Back.End.Security.Entity.Rol;
import com.proyecto.Back.End.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
