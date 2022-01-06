package modelos;

import java.util.ArrayList;

public class Estudiante extends Usuario{
    //Informacion del estudiante
    public String matricula;

    public Estudiante(String matricula, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
    	super(nombre,  apellido,  facultad,  edad,  direccion,  telefono);
    	this.matricula = matricula;
    }

    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    

    
    
}
        
    
    
    
            
        
        
