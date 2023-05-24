package paquetedos;

/**
 *
 * @author santy
 */
public class ConjuntoEnfermeros {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public ConjuntoEnfermeros(String n, String t, double s){
        nombre = n;
        tipo = t;
        sueldo = s;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerTipo(String x){
        tipo = x;
    }
    
    public void establecerSueldo(double x){
        sueldo = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
}
