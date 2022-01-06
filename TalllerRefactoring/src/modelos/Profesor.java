package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    private int aniosdeTrabajo;
    private String facultad;
    private double BonoFijo;
	static double bonoPorAnio=600;
    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public int getAniosdeTrabajo() {
    	return aniosdeTrabajo;
    }
    public String getFacultad() {
    	return facultad;
    }
    public double getBonoFijo() {
    	return BonoFijo;
    } 
    public void setAniosdeTrabajo(int anios) {
    	this.aniosdeTrabajo=anios;
    }
    public void setFacultad(String facultad) {
    	this.facultad=facultad;
    }
    public void setBonoFijo(double bonoFijo) {
    	this.BonoFijo=bonoFijo;
    }    

    public double calcularSueldo(Profesor prof){
        return prof.getAniosdeTrabajo()*bonoPorAnio + prof.getBonoFijo();
    }      
}
