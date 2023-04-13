
package com.proyecto.Back.End.Interface;

import com.proyecto.Back.End.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una persona 
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar una objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    
}
