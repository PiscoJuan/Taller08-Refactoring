package modelos;

import java.util.ArrayList;

public class Profesor extends Usuario{
    public String codigo;
    private int aniosdeTrabajo;
    private String facultad;
    private double BonoFijo;
	static double bonoPorAnio=600;
	
	
    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
    	super(nombre,  apellido,  facultad,  edad,  direccion,  telefono);
    	this.codigo = codigo;
       
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public int getAniosdeTrabajo() {
    	return aniosdeTrabajo;
    }
    
    public double getBonoFijo() {
    	return BonoFijo;
    } 
    public void setAniosdeTrabajo(int anios) {
    	this.aniosdeTrabajo=anios;
    }
    public void setBonoFijo(double bonoFijo) {
    	this.BonoFijo=bonoFijo;
    }    

    public double calcularSueldo(Profesor prof){
        return prof.getAniosdeTrabajo()*bonoPorAnio + prof.getBonoFijo();
    }      
}
