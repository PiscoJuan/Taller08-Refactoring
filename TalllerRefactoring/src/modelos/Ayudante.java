package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelosAyudante;

    public Ayudante(String matricula, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
    	super(matricula, nombre,  apellido,  facultad,  edad,  direccion,  telefono);
    	paralelosAyudante= new ArrayList<>();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelosAyudante(){
        for(Paralelo par:paralelosAyudante){
            //Muestra la info general de cada paralelo
        }
    }
}
