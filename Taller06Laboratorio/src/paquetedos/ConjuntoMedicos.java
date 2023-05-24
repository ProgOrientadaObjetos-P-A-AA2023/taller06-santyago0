package paquetedos;

/**
 *
 * @author santy
 */
public class ConjuntoMedicos {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public ConjuntoMedicos(String n, String esp, double s){
        nombre = n;
        especialidad = esp;
        sueldo = s;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerEspecialidad(String x){
        especialidad = x;
    }
    
    public void establecerSueldo(double x){
        sueldo = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
}
