package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;
    
	
	//Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public  double CalcularNotaInicial(double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        notaInicial=notaTeorico+notaPractico;
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public  double CalcularNotaFinal(double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        notaFinal=notaTeorico+notaPractico;
           
        return notaFinal;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public  double CalcularNotaTotal(){
        notaTotal=(notaInicial+notaFinal)/2;
        return notaTotal;
        
    }
    
}
